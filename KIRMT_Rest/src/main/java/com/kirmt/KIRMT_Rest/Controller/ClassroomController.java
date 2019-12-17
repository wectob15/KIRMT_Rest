package com.kirmt.KIRMT_Rest.Controller;

import com.kirmt.KIRMT_Rest.Entity.Classroom;
import com.kirmt.KIRMT_Rest.Repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class ClassroomController {
    @Autowired
    private ClassroomRepository classroomRepository;

    @RequestMapping(value = "/classrooms", method = RequestMethod.GET)
    public List<Classroom> getAllClassrooms(){
        return classroomRepository.findAll();
    }

    @RequestMapping(value = "/classrooms/add", method = RequestMethod.POST)
    public void addUser(@Valid @RequestBody Classroom classroom){
        classroomRepository.save(classroom);
    }

    @RequestMapping(value = "/classrooms/{user_id}", method = RequestMethod.GET)
    public Optional<Classroom> getUserById(@PathVariable int user_id){
        return classroomRepository.findById(user_id);
    }
}
