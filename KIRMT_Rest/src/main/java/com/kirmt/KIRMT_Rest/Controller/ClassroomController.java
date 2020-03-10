package com.kirmt.KIRMT_Rest.Controller;

import com.kirmt.KIRMT_Rest.Entity.Classroom;
import com.kirmt.KIRMT_Rest.Entity.User;
import com.kirmt.KIRMT_Rest.Repository.ClassroomRepository;
import com.kirmt.KIRMT_Rest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class ClassroomController {
    @Autowired
    private ClassroomRepository classroomRepository;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/classrooms", method = RequestMethod.GET)
    public List<Classroom> getAllClassrooms(){
        return classroomRepository.findAll();
    }

    @RequestMapping(value = "/classrooms/add", method = RequestMethod.POST)
    public void addClassroom(@Valid @RequestBody Classroom classroom){
        User user = userRepository.getOne(classroom.getUser_id());
        classroom.setUser(user);
        classroomRepository.save(classroom);
    }

    @RequestMapping(value = "/classrooms/getClass/{classname}", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public Classroom getClassroomIdByName(@PathVariable String classname){
        return classroomRepository.findClassroomByClassname(classname);
    }

    @RequestMapping(value = "/classrooms/{classroom_id}", method = RequestMethod.GET)
    public Optional<Classroom> getClassroomById(@PathVariable int classroom_id){
        return classroomRepository.findById(classroom_id);
    }
}

