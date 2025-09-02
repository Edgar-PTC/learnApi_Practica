package IntegracionBackFront.backfront.Repositories.Users;

import IntegracionBackFront.backfront.Entities.Users.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    //Metodo para buscar usuario
    Optional<UserEntity> findByCorreo(String email);
}
