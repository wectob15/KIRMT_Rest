package com.kirmt.KIRMT_Rest.Controller;

import com.kirmt.KIRMT_Rest.Entity.Status;
import com.kirmt.KIRMT_Rest.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class StatusController {

    @Autowired
    private StatusRepository statusRepository;

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public List<Status> getStatus(){
        return statusRepository.findAll();
    }
    @RequestMapping(value="/status/{status_id}", method = RequestMethod.GET)
    public Optional<Status> getOneStatus(@PathVariable int status_id){
        return statusRepository.findById(status_id);
    }

    @RequestMapping(value="/status/add", method = RequestMethod.POST)
    public void addStatus(@Valid @RequestBody Status status){
        statusRepository.save(status);
    }

    @RequestMapping(value="/status/delete/{status_id}", method = RequestMethod.DELETE)
    public void deleteStatus(@PathVariable int status_id){
        statusRepository.deleteById(status_id);
    }
}
