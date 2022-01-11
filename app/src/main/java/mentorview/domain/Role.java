package mentorview.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    USER("ROLE_USER", "회원", true),
    GET_TOTAL_REVIEW("ROLE_GET_TOTAL_REVIEW", "비밀답변 권한", false);

    private final String key;
    private final String title;
    private final boolean total_review;
}
