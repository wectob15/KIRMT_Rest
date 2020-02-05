package com.kirmt.KIRMT_Rest.Controller;

import com.kirmt.KIRMT_Rest.Entity.Responsible;
import com.kirmt.KIRMT_Rest.Repository.ResponsibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ResponsibleController {
    @Autowired
    private ResponsibleRepository classResponsibleRepository;

    @RequestMapping(value = "/classresponsible", method = RequestMethod.GET)
    public List<Responsible> getAllResponsibles() {
        return classResponsibleRepository.findAll();
    }

    @RequestMapping(value = "/classresponsible/add", method = RequestMethod.POST)
    public void addResponsible(@Valid @RequestBody Responsible classResponsible){
        classResponsibleRepository.save(classResponsible);
    }
}
