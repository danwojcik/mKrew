package pl.mkrew.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mkrew.app.domain.UserEntity;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    boolean existsByConfirmEmailOrLogin (String login, String email);

    Optional<UserEntity> findByConfirmationId (String confirmationId);

    Optional<UserEntity> findUserByLogin (String login);
}