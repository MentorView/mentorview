package mentorview.application;

import mentorview.Infra.SignUpRepository;
import mentorview.domain.User;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    private final SignUpRepository signUpRepository;

    public SignUpService(SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }

}
