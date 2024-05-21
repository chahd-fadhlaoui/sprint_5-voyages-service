package com.chahd.voyages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.chahd.voyages.entities.Role;
import com.chahd.voyages.entities.User;
import com.chahd.voyages.entities.Voyage;
import com.chahd.voyages.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class VoyagesApplication implements CommandLineRunner {

    private final RepositoryRestConfiguration repositoryRestConfiguration;
    private final PasswordEncoder passwordEncoder;
    @Autowired
    UserService userService;


    @Autowired
    public VoyagesApplication(RepositoryRestConfiguration repositoryRestConfiguration, PasswordEncoder passwordEncoder) {
        this.repositoryRestConfiguration = repositoryRestConfiguration;
        this.passwordEncoder = passwordEncoder;
    }

    public static void main(String[] args) {
        SpringApplication.run(VoyagesApplication.class, args);
    }

    
   /* @PostConstruct
    void init_users() {
	//ajouter les rôles
    userService.addRole(new Role(null,"ADMIN"));
    userService.addRole(new Role(null,"AGENT"));
    userService.addRole(new Role(null,"USER"));
    //ajouter les users
    userService.saveUser(new User(null,"admin","123",true,null));
    userService.saveUser(new User(null,"chahd","123",true,null));
    userService.saveUser(new User(null,"user","123",true,null));
    //ajouter les rôles aux users
    userService.addRoleToUser("admin", "ADMIN");
    userService.addRoleToUser("chahd", "USER");
    userService.addRoleToUser("chahd", "AGENT");
    userService.addRoleToUser("user", "USER");
    }
    */
    
    @Override
    public void run(String... args) throws Exception {
        // Expose entity IDs
        repositoryRestConfiguration.exposeIdsFor(Voyage.class);
        
        // Print encoded password for debugging purposes
        //System.out.println("Password Encoded BCRYPT: ********************");
        //System.out.println(passwordEncoder.encode("123"));
        
    }
}
