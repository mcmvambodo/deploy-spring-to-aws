package doitwell.group.springaws.elasticsearch;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;*/
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.List;

import static java.util.Arrays.asList;

//@Service
/*public class PersonService {
    @Autowired
    PersonRepository repository;

    public void create(final Person person){
        person.setCars(asList(new Car("1","Carina 3","Toyota",20_000.0d),
                new Car("2","Pajero","Toyota",15_000.0d)));
        repository.save(person);
    }

    public Person findById(String id){
        return repository.findById(id).orElseThrow();
    }
    public List<Person> findAll(){
        return repository.findAll(PageRequest.of(0,5)).stream().toList();
    }

    public List<Person> findByName(String name){
        return repository.findByName(name, PageRequest.of(0,10)).stream().toList();
    }

    public Person update(String id, Person p){
        Person person = repository.findById(id).orElseThrow();
        person.setName(p.getName());
        return person;

    }

    public boolean delete(String id){
        repository.deleteById(id);
        return true;
    }


}*/
