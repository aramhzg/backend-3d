package com.central.backendprints.repository;

import com.central.backendprints.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
