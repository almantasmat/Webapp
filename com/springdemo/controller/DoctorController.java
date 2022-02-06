package com.springdemo.controller;


import com.springdemo.dao.DoctorDAO;
import com.springdemo.entity.Doctor;
import com.springdemo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
    //    need to inject customerDao
    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/list")
    public String listCustomer(Model model) {

//        get customers from DAO
        List<Doctor> doctors = doctorService.getDoctors();

//        add customer to model
        model.addAttribute("doctors", doctors);
        return "list-doctors";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Doctor doctor = new Doctor();
        model.addAttribute("doctor", doctor);
        return "new-doctor-form";
    }

    @PostMapping("/saveDoctor")
    public String saveDoctor(@ModelAttribute ("doctor") Doctor doctor){
        doctorService.saveDoctor(doctor);
        return "redirect:/doctor/list";
    }

}
