package com.fundoonotes.fundoonotesapp.service;

import com.fundoonotes.fundoonotesapp.dto.AuthResponse;
import com.fundoonotes.fundoonotesapp.dto.LoginRequest;
import com.fundoonotes.fundoonotesapp.dto.RegisterRequest;
import com.fundoonotes.fundoonotesapp.entity.User;
import com.fundoonotes.fundoonotesapp.exception.DuplicateEmailException;
import com.fundoonotes.fundoonotesapp.exception.InvalidCredentialsException;
import com.fundoonotes.fundoonotesapp.repository.UserRepository;
import com.fundoonotes.fundoonotesapp.security.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public AuthResponse register(RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new DuplicateEmailException(request.getEmail());
        }

        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPasswordHash(passwordEncoder.encode(request.getPassword()));

        User saved = userRepository.save(user);
        String token = jwtUtil.generateToken(saved.getUserId(), saved.getEmail());

        return new AuthResponse(token, saved.getEmail(), "Registration successful");
    }

    public AuthResponse login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(InvalidCredentialsException::new);

        if (!passwordEncoder.matches(request.getPassword(), user.getPasswordHash())) {
            throw new InvalidCredentialsException();
        }

        String token = jwtUtil.generateToken(user.getUserId(), user.getEmail());
        return new AuthResponse(token, user.getEmail(), "Login successful");
    }
}
