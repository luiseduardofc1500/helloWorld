package br.ufrn.imd.helloworld.controller;

import br.ufrn.imd.helloworld.entity.Greeting;
import br.ufrn.imd.helloworld.repository.GreetingRepository;
import br.ufrn.imd.helloworld.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public final class GreetingController {
    private final GreetingRepository greetingRepository;
    private final GreetingService greetingService;

    public GreetingController (GreetingRepository greetingRepository, GreetingService greetingService){
        this.greetingRepository = greetingRepository;
        this.greetingService = greetingService;
    }

    @ResponseBody
    @GetMapping("/all")
    public List<Greeting> index() {
        return greetingRepository.findAll();
    }


    @ResponseBody
    @ResponseStatus
    @PostMapping
    public String storeGreeting(@RequestBody Greeting greeting){
       return greetingService.salvaBanco(greeting);

    }

}
