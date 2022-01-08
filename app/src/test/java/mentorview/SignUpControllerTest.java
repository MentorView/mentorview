package mentorview;

import mentorview.application.SignUpService;
import mentorview.controllers.SignUpController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;

@WebMvcTest(SignUpController.class)
public class SignUpControllerTest {

    private MockMvc mockMvc;

    public SignUpControllerTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @MockBean
    private SignUpService signUpService;

    @Test
    void 회원가입이_성공하면_200을_리턴한다() {
        // 준비

        // 실행

        // 검증
    }


}
