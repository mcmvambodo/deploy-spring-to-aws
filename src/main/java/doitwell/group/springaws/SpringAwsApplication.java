package doitwell.group.springaws;

import doitwell.group.springaws.rabbit.hello.SpringAwsApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class SpringAwsApplication {


/*    @Bean
    @Profile("usage_message")
    public CommandLineRunner usage(){
        return args -> {
            System.out.println("This app uses Spring profiles to control its behavior. \n");
            System.out.println("Sample usage: java -jar rabbit-tutorials.jar --spring.profiles.active=hello-world,sender");
        };
    }

    @Profile("!usage_message")
    @Bean
    public CommandLineRunner tutorial(){
        return new SpringAwsApplicationRunner();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(SpringAwsApplication.class, args);
    }

}
