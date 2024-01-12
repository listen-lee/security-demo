package org.example.securitydemo.repository;

import java.util.Optional;

import org.example.securitydemo.models.ERole;
import org.example.securitydemo.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}