package com.chahd.voyages.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chahd.voyages.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}
