package app;

import app.repositories.AddressRepository;
import app.repositories.FamilyMemberRepository;
import app.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FamilyWebsiteApp {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    FamilyMemberRepository familyMemberRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(FamilyWebsiteApp.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
}