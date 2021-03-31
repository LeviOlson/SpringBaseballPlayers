package dmacc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dmacc.repository.PlayerRepository;

@SpringBootApplication
public class BaseballPlayersSpringLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseballPlayersSpringLombokApplication.class, args);
	}
	
	@Autowired
	PlayerRepository repo;

}
