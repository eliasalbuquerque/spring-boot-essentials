package com.devdojo.springboot2essentials.controller;

import java.util.List;
import com.devdojo.springboot2essentials.domain.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    public List<Person> list(){
        return List.of(            
            new Person(name: "Paulo"),
            new Person( name: "Joao")
        );
    }
}


// Spring Boot 2 Essentials 03 - Criando projeto na pedreiragem pt 02
// https://www.youtube.com/watch?v=szrqiHLbUq0&list=PL62G310vn6nFBIxp6ZwGnm8xMcGE3VA5H&index=4