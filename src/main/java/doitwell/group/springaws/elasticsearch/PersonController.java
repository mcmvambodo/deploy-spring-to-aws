package doitwell.group.springaws.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    @GetMapping("{name}")
    public String welcome(@PathVariable String name){
        return "Welcome to Doitwell Group "+name;
    }
   /* @Autowired
    PersonService personService;*/
    /*@Autowired
    PersonRepository repository;
    @GetMapping
    public Iterable<Person> getAll(){
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Person getPersonById(@PathVariable String id){
        return repository.findById(id).orElseThrow();
    }
    @GetMapping("{name}")
    public List<Person> getPersonByName(@PathVariable String name){
        return repository.findByName(name, PageRequest.of(0,5)).stream().toList();
    }
    @PostMapping
    public Person addPerson(@RequestBody Person person ){
        person.setCars(asList(new Car("1","Carina 3","Toyota",20_000.0d),
                new Car("2","Pajero","Toyota",15_000.0d)));
        return repository.save(person);
    }
    @PutMapping("{id}")
    public Person update(@PathVariable String id, @RequestBody Person p){
        Person person = repository.findById(id).orElseThrow();
        person.setName(p.getName());
        return person;
    }
    @DeleteMapping("{id}")
    public boolean delete(@PathVariable String id){
        repository.deleteById(id);
        return true;
    }*/
}
