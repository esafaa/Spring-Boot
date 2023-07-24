package org.safaaess.studentLogin.repository;


import org.safaaess.studentLogin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>
{
 
  Role findByName(String name);
}

