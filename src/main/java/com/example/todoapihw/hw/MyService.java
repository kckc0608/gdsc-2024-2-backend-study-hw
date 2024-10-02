package com.example.todoapihw.hw;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyService {

    private final MyRepository myRepository;

    public void serviceMethod() {
        System.out.println("service");
        myRepository.repositoryMethod();
    }
}
