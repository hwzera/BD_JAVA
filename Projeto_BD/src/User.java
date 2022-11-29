public class User {

    private int id; // auto increment
    private String username;
    private String password;
    private int status; // 0 = inativo, 1 = ativo
    private double token;

    // getter setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getToken() {
        return token;
    }

    public void setToken(double token) {
        this.token = token;
    }
}
