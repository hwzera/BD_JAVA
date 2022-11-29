public class App {
    public static void main(String[] args) throws Exception {
        ConectionFactory.createConnection();

        User mathews = new User();

        mathews.setUsername("Mathews");
        mathews.setPassword("root");
        mathews.setStatus(0);
        mathews.setToken(23);

        // salvar
        UserRepository userRepository = new UserRepository();
        userRepository.save(mathews);

        List<User> usuarios = userRepository.selectAll();
    }
}
