package com.example.Project.Password;

import com.example.Project.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordRepository extends JpaRepository<Password, Long> {

}
