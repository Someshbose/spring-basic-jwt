package someshbose.github.io.businesslogic.domain.model;

public class User {

    private String username;
    private String password;
    private String code;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
