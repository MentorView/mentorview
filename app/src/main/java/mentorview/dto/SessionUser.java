package mentorview.dto;

import lombok.Getter;
import mentorview.domain.User;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;


    public SessionUser(User user) {
        this.name = name;
        this.email = email;
        this.picture = picture;
    }
}
