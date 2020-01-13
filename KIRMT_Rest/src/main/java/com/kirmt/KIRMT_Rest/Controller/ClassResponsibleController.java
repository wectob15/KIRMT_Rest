package com.kirmt.KIRMT_Rest.Controller;

import com.kirmt.KIRMT_Rest.Entity.ClassResponsible;
import com.kirmt.KIRMT_Rest.Repository.ClassResponsibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClassResponsibleController {
    @Autowired
    private ClassResponsibleRepository classResponsibleRepository;

    @RequestMapping(value = "/classresponsible", method = RequestMethod.GET)
    public List<ClassResponsible> getAllAdmins() {
        return classResponsibleRepository.findAll();
    }
    @RequestMapping(value = "/classresponsible/add", method = RequestMethod.POST)
    public void addAdmin(@Valid @RequestBody ClassResponsible classResponsible){
        classResponsibleRepository.save(classResponsible);
    }
}
