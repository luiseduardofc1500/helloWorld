package br.ufrn.imd.helloworld.controller;

import br.ufrn.imd.helloworld.entity.Greeting;
import br.ufrn.imd.helloworld.repository.GreetingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public final class GreetingController {
    private final GreetingRepository greetingRepository;

    public GreetingController (GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    @ResponseBody
    @GetMapping("/greetings")
    public List<Greeting> index(){
        return greetingRepository.findAll();
    }

    @ResponseBody
    @ResponseStatus
    @RequestMapping(path = "/greetings", method = RequestMethod.POST)
    public String storeGreeting(@RequestBody Greeting greeting){
        greetingRepository.save(greeting);

        return "Greeting stored with id " + greeting.getId();

    }

}
