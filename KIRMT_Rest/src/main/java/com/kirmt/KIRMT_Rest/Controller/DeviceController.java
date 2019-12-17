package com.kirmt.KIRMT_Rest.Controller;

import com.kirmt.KIRMT_Rest.Entity.Admin;
import com.kirmt.KIRMT_Rest.Entity.Device;
import com.kirmt.KIRMT_Rest.Repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DeviceController {

    @Autowired
    private DeviceRepository deviceRepository;

    @RequestMapping(value = "/device", method = RequestMethod.GET)
    public List<Device> getAllDevices(){
        return deviceRepository.findAll();
    }

    @RequestMapping(value = "/device/add", method = RequestMethod.POST)
    public void addUser(@RequestBody @Valid Device device){
        deviceRepository.save(device);
    }

}
