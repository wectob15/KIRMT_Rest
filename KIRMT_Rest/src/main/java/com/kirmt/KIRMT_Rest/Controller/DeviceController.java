package com.kirmt.KIRMT_Rest.Controller;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.kirmt.KIRMT_Rest.Entity.Admin;
import com.kirmt.KIRMT_Rest.Entity.Classroom;
import com.kirmt.KIRMT_Rest.Entity.Device;
import com.kirmt.KIRMT_Rest.Repository.ClassroomRepository;
import com.kirmt.KIRMT_Rest.Repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController
public class DeviceController {

    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private ClassroomRepository classroomRepository;

    @RequestMapping(value = "/device", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public List<Device> getAllDevices(){
        return deviceRepository.findAll();
    }

    @RequestMapping(value = "/device/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void addDevice(@RequestBody @Valid Device device){
        System.out.println("hier");
        //Classroom classroom = classroomRepository.getOne(device.getClassroom_id());
        //device.setClassroom(classroom);
        //deviceRepository.save(device);
    }

    @RequestMapping(value = "/device/{device_id}", method = RequestMethod.GET)
    public Optional<Device> getDeviceById(@PathVariable int user_id){
        return deviceRepository.findById(user_id);
    }

    @RequestMapping(value = "device/delete/{device_id}", method = RequestMethod.DELETE)
    public void deleteDevice(@PathVariable int device_id){
        deviceRepository.deleteById(device_id);
    }

}
