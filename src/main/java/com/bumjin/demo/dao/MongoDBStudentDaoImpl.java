package com.bumjin.demo.dao;

import com.bumjin.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("mongoDbDao")
public class MongoDBStudentDaoImpl implements StudentDao{

    //private final MongoDbTemplate mongoDbTEmplate;

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        return 0;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(UUID.randomUUID()
                , 10
                , "Mongo"
                , "DB"
                , "NoSQL"));
        return students;
    }

    @Override
    public int updateStudentById(UUID studentId, Student studentUpdate) {
        return 0;
    }

    @Override
    public int deleteStudentBYId(UUID studentId) {
        return 0;
    }
}
