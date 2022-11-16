package io.getarrays.JsonWebToken.repository;


import io.getarrays.JsonWebToken.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String userName);
}
