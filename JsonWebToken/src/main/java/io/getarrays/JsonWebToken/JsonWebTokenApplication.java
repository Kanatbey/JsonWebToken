package io.getarrays.JsonWebToken;

import io.getarrays.JsonWebToken.domain.Role;
import io.getarrays.JsonWebToken.domain.User;
import io.getarrays.JsonWebToken.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JsonWebTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonWebTokenApplication.class, args);
	}

//	@Bean
//	PasswordEncoder passwordEncoder(){
//		return new BCryptPasswordEncoder();
//	}

//	CommandLineRunner runner(UserService userService) {
//		return args -> {
//			userService.saveRole(new Role(null,"ROLE_USER"));
//			userService.saveRole(new Role(null,"ROLE_MANAGER"));
//			userService.saveRole(new Role(null,"ROLE_ADMIN"));
//			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null,"asan","esenali","2345",new ArrayList<>()));
//			userService.saveUser(new User(null,"ESEN","MARAli","CXZX",new ArrayList<>()));
//			userService.saveUser(new User(null,"USON","SURBAEV","CZV",new ArrayList<>()));
//			userService.saveUser(new User(null,"MARAT","ATAMURAT","CVZVZCX",new ArrayList<>()));
//
//			userService.addRoleToUser("asan","ROLE_USER");
//			userService.addRoleToUser("asan","ROLE_USER");
//			userService.addRoleToUser("ESEN","ROLE_USER");
//			userService.addRoleToUser("USON","ROLE_USER");
//			userService.addRoleToUser("MARAT","ROLE_USER");
//
//		};
//	}
}
