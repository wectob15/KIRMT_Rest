package com.kirmt.KIRMT_Rest.Controller;

import com.kirmt.KIRMT_Rest.Entity.Admin;
import com.kirmt.KIRMT_Rest.Entity.User;
import com.kirmt.KIRMT_Rest.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
    @RequestMapping(value = "/admin/add", method = RequestMethod.POST)
    public void addAdmin(@Valid @RequestBody Admin admin){
        adminRepository.save(admin);
    }
}
