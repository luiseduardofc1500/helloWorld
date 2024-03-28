package br.ufrn.imd.helloworld.controller;

import br.ufrn.imd.helloworld.entity.Greeting;
import br.ufrn.imd.helloworld.repository.GreetingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public final class GreetingController {
    private final GreetingRepository greetingRepository;

    public GreetingController (GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    @GetMapping("/greetings")
    public List<Greeting> index(){
        return greetingRepository.findAll();
    }

    public String storeGreeting(@RequestBody Greeting greeting){
         greetingRepository.save(greeting);

        return "Greeting stored with id " + greeting.getId();


    }




}
