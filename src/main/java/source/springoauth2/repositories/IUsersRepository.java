package source.springoauth2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.springoauth2.entities.UserEntity;

import java.util.UUID;

@Repository
public interface IUsersRepository extends JpaRepository<UserEntity, UUID> {
}
