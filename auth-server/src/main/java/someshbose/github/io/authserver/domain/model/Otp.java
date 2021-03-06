package someshbose.github.io.authserver.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AS_OTP")
public class Otp {

    @Id
    private String username;
    private String code;

    public String getUsername() {
        return username;
    }

    public String getCode() {
        return code;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
