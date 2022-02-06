package com.springdemo.dao;

import com.springdemo.entity.Doctor;

import java.util.List;

public interface DoctorDAO {
    public List<Doctor> getDoctors();
    void saveDoctor(Doctor doctor);
}
