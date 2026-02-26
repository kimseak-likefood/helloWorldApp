package kh.edu.paragoniu.helloworldapp;

import kh.edu.paragoniu.helloworldapp.models.User;
import kh.edu.paragoniu.helloworldapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) {
//        userRepository.save(new User());
    }
}