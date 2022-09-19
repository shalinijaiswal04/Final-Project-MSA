package com.project.patient.controller;

import com.project.patient.data.PatientData;
import com.project.patient.dto.PatientDto;
import com.project.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = {"http://localhost:4200"})
public class PatientController {
    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    PatientDto create(@RequestBody PatientData patientData){
        return patientService.create(patientData);
    }
    @GetMapping(path ="/id/{id}")
    PatientDto getById(@PathVariable int id){

        return patientService.getById(id);
    }
    @GetMapping
    List<PatientDto> getAllPatient(){
        return patientService.getAllPatient();
    }



}
