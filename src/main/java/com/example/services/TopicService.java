package com.example.services;

import com.example.dao.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class TopicService {
    private List<Person> list = new ArrayList<>(Arrays.asList(
            new Person("Akshay","23","India","1"),
                new Person("Abc","24","USA","2"),
                new Person("Def","26","Austria","3"),
                new Person("XYZ","12","Germany","4")));



    public Person getPerson(String id){
        return list.stream().filter(item -> item.getId().equals(id)).findFirst().get();
    }
    public List<Person> addPerson(Person person){
        list.add(person);
        return list;
    }
    public void updatePerson(Person person, String id){
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                list.set(i,person);
            }
        }
    }
    public void deletePerson(Person person, String id){
        list.removeIf(t->t.getId().equals(id));
    }
}
