package co.ke.stanslaus.learningsecurity.repository;

import co.ke.stanslaus.learningsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    Optional<User> findUserByEmail(String email);
}
