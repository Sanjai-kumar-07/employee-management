package com.example.employee_management.config;

import com.example.employee_management.entity.User;
import com.example.employee_management.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner createHRUser(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {

        return args -> {

            if (userRepository.findByUsername("hr") .isEmpty()) {

                User hr = new User(
                        "hr",
                        passwordEncoder.encode("hr123"),
                        "HR"
                );

                userRepository.save(hr);

                System.out.println("HR user created successfully!");
            }
        };
    }
}