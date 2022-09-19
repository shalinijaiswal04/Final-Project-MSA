package com.project.doctor.controller;

import com.netflix.discovery.converters.Auto;
import com.project.doctor.data.DoctorData;
import com.project.doctor.dto.DoctorDto;
import com.project.doctor.model.Doctor;
import com.project.doctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/doctors")
@CrossOrigin(origins = {"http://localhost:4200"})
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
     DoctorDto create(@RequestBody DoctorData doctorData){
        return doctorService.create(doctorData);
    }
    @GetMapping(path ="/id/{id}")
    DoctorDto getById(@PathVariable int id){
        return doctorService.getById(id);
    }
    @GetMapping
    List<DoctorDto> getAllDoctor(){
        return doctorService.getAllDoctor();
    }

    @GetMapping("/updatePatientAttend/{id}")
    void updatePatientAttend(@PathVariable int id){
        doctorService.updatePatientAttend(id);
    }



}
