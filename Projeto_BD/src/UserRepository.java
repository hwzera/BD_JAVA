import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    // DAO = DATA ACCESS OBJECT > ANTIGAMENTE
    // hoje em dia chama User Repository
    // DAO > CRUD
    // > C - CREATE (insert into)
    // > R - READ (select from)
    // > U - UPDATE (update set)
    // > D - DELETE (delete from)

    // contrutor
    private Connection conn = null;

    public UserRepository() {
        // nunca fazer tratamento de excessoes dentro do construtor
        this.conn = ConectionFactory.createConnection();
    }

    // criar usuario
    public void save(User _user) {


        String uSQL = "INSERT INTO tb_user (username, password, status, token) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(uSQL);
            ps.setString(1, _user.getUsername());
            ps.setString(2, _user.getPassword());
            ps.setInt(3, _user.getStatus());
            ps.setDouble(4, _user.getToken());

            ps.executeUpdate(); // INSERT, UPDATE e DELETE

            System.out.println("Usuario Cadastrado!");

        } catch (SQLException e) {
            System.out.println("Error: Nao foi possivel inserir o usuario");
        }

    }

    public User getOne(int id){
            
        String sql = "SELECT * FROM tb_user WHERE id = ?";

        return null;
    }

    public List<User> selectAll() {

        String sql = "SELECT * FROM tb_user";

        List<User> users = new ArrayList<User>();

        try{
        PreparedStatement ps = this.conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            User u = new User();
            u.setId(rs.getInt("id"));
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
            u.setToken(rs.getDouble("token"));
            users.add(u);
            //System.out.println(rs.getInt("id") + " - " + rs.getString("username") + " - " + rs.getShort("password"));
        }
        
        System.out.println(rs);

        } catch (SQLException e){
            System.out.println("Erro: Não foi possivel buscal os usuários");
            e.printStackTrace();
        }
    }

    public void update(User _user) {
    }

    public void delete(User _user) {
    }

}
