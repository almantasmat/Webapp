package com.springdemo.service;

import com.springdemo.dao.DoctorDAO;
import com.springdemo.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Controller
public class DoctorServiceImpl implements DoctorService{

    @Autowired
   private DoctorDAO doctorDAO;

    @Override
    @Transactional
    public List<Doctor> getDoctors() {
        return doctorDAO.getDoctors();
    }

    @Override
    @Transactional
    public void saveDoctor(Doctor doctor) {
        doctorDAO.saveDoctor(doctor);
    }
}
