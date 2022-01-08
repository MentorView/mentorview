package mentorview.Infra;


import mentorview.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignUpRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
}
