

package com.example.mercado_crud.service;

import java.util.List;

import com.example.mercado_crud.exceptions.RecursoNaoEncontradoException;
import org.springframework.stereotype.Service;

import com.example.mercado_crud.model.User;
import com.example.mercado_crud.repository.UserRepository;
import com.example.mercado_crud.role.Role;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email já registrado");
        }
        user.setRole(Role.CLIENT);
        return userRepository.save(user);
    }
        public User createAdmin(User user){
            user.setRole(Role.ADMIN);
            return userRepository.save(user);

    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getUserByid(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Usuario não encontrado"));
    }

    public void deleteUser(Long id){
        if(!userRepository.existsById(id)){
            throw new RecursoNaoEncontradoException("Usuario com" + id +"Não encontrado");
        }

        userRepository.deleteById(id);
    }
}
