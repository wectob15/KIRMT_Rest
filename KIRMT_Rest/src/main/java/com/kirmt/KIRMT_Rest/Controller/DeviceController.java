package com.kirmt.KIRMT_Rest.Controller;

import com.kirmt.KIRMT_Rest.Entity.Admin;
import com.kirmt.KIRMT_Rest.Entity.Device;
import com.kirmt.KIRMT_Rest.Repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class DeviceController {

    @Autowired
    private DeviceRepository deviceRepository;

    @RequestMapping(value = "/device", method = RequestMethod.GET)
    public List<Device> getAllDevices(){
        return deviceRepository.findAll();
    }

    @RequestMapping(value = "/device/add", method = RequestMethod.POST)
    public void addDevice(@RequestBody @Valid Device device){
        deviceRepository.save(device);
    }

    @RequestMapping(value = "/device/{device_id}", method = RequestMethod.GET)
    public Optional<Device> getDeviceById(@PathVariable int user_id){
        return deviceRepository.findById(user_id);
    }

    @RequestMapping(value = "device/delete/{device_id}", method = RequestMethod.GET)
    public void deleteDevice(@PathVariable int device_id){
        deviceRepository.deleteById(device_id);
    }

}
