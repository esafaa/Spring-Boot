package com.example.SpringSecurityRegDemo.repository;
import com.example.SpringSecurityRegDemo.model.Role;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	
   public Role findRoleByName(String role);

   @Query(value = "select * from role where role.id= (select role_id from users_roles where user_id = :id)", nativeQuery = true)
   public List<Role> findRoleByUser(@Param("id") long id);
}