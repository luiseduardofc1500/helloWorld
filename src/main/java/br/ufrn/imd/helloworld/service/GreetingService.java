package br.ufrn.imd.helloworld.service;

import br.ufrn.imd.helloworld.entity.Greeting;
import br.ufrn.imd.helloworld.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService (GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    public String salvaBanco(Greeting greeting){
        greetingRepository.save(greeting);

        return "Greeting stored with id " + greeting.getId();
    }

    public List<Greeting> findAll(){
        return greetingRepository.findAll();
    }

}
