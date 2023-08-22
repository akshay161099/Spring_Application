package com.example.controller;

import com.example.dao.Person;
import com.example.repository.PersonRepository;
import com.example.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController

public class TopicController {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private TopicService topicService;
    //GET
    @RequestMapping("/people")
    public List<Person> getList(){
        //return topicService.getPeople();
        List<Person> list = new ArrayList<>();
        personRepository.findAll().forEach(list::add);
        return list;
    }
    // GET
    @RequestMapping("/people/{id}")
    public Optional<Person> getPerson(@PathVariable String id){
        //return topicService.getPerson(name);
        return personRepository.findById(id);
    }
    //POST
    @RequestMapping(method = RequestMethod.POST, value = "/people")
    public void addPerson(@RequestBody Person person){
        //topicService.addPerson(person);
        personRepository.save(person);
    }
    //PUT
    @RequestMapping(method = RequestMethod.PUT, value = "/people")
    public void updatePerson(@RequestBody Person person){
        //topicService.updatePerson(person,id);
        personRepository.save(person);
    }
    //DELETE
    @RequestMapping(method = RequestMethod.DELETE, value = "/people/{id}")
    public void deletePerson(@RequestBody Person person, @PathVariable String id){
        //topicService.deletePerson(person,id);
        personRepository.deleteById(id);
    }
}
