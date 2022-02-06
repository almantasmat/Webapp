package com.springdemo.service;

import com.springdemo.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getDoctors();
    void saveDoctor(Doctor doctor);
}
