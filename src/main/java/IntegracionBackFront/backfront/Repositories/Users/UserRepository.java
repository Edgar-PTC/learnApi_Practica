package IntegracionBackFront.backfront.Repositories.Users;

import IntegracionBackFront.backfront.Entities.Users.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
