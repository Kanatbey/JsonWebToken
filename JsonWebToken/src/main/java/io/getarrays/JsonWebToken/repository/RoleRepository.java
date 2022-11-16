package io.getarrays.JsonWebToken.repository;


import io.getarrays.JsonWebToken.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
