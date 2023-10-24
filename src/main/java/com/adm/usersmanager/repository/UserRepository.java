package com.adm.usersmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adm.usersmanager.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}
