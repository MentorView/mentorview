package mentorview.Infra;


import mentorview.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // email을 통해 가입된 회원 인지를 확인
    Optional<User> findByEmail(String email);
}
