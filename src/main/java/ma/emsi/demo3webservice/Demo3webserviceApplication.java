package ma.emsi.demo3webservice;

import ma.emsi.demo3webservice.dao.entities.Compte;
import ma.emsi.demo3webservice.dao.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Demo3webserviceApplication {

    @Autowired
    private CompteRepository compteRepository;
    public static void main(String[] args) {
        SpringApplication.run(Demo3webserviceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CompteRepository compteRepository){
        return args -> {
            Compte compte1 = new Compte(null,20000,new Date());
            Compte compte2 = new Compte(null,25000,new Date());
            Compte compte3 = new Compte(null,3000,new Date());
            Compte compte4 = new Compte(null,8000,new Date());

            compteRepository.saveAll(
                    List.of(compte1,compte2,compte3,compte4)
            );


        };
    }

}
