package dio.springboot;

import dio.springboot.model.Users;
import dio.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Users user = new Users();
        user.setName("Caio");
        user.setUsername("caio");
        user.setPassword("abc123");

        repository.save(user);

        for (Users u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
