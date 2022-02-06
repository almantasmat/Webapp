package com.springdemo.dao;

import org.hibernate.SessionFactory;
import com.springdemo.entity.Doctor;
import org.hibernate.Session;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DoctorDAOImpl implements DoctorDAO{
//   need to inject seesion factory
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Doctor> getDoctors() {
        //    get current hibernate session
        Session session = sessionFactory.getCurrentSession();

//    create query
        Query<Doctor> query = session.createQuery("FROM Doctor", Doctor.class);

//    execute query and get result list
        List<Doctor>doctors = query.getResultList();
//    return result
        return doctors;
    }

    @Override
    public void saveDoctor(Doctor doctor) {
        Session session = sessionFactory.getCurrentSession();
        session.save(doctor);
    }
}
