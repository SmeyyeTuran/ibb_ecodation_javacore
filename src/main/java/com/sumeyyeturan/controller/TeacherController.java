package com.sumeyyeturan.controller;

import com.sumeyyeturan.dao.IDaoGenerics;
import com.sumeyyeturan.dao.TeacherDao;
import com.sumeyyeturan.dto.TeacherDto;
import com.sumeyyeturan.utils.SpecialColor;

import java.util.List;

public class TeacherController implements IDaoGenerics<TeacherDto> {

    // INJECTION
    private final TeacherDao teacherDao;

    // Parametresiz Constructor
    public TeacherController() {
        this.teacherDao = new TeacherDao();
    }

    // CREATE
    @Override
    public TeacherDto create(TeacherDto teacherDto) {
        TeacherDto createdStudent = teacherDao.create(teacherDto);
        if (createdStudent == null) {
            System.out.println(SpecialColor.RED + "❌ Öğretmen oluşturulamadı. Geçerli bilgiler giriniz." + SpecialColor.RESET);
        }
        return createdStudent;
    }


    // FIND BY NAME
    @Override
    public TeacherDto findByName(String name) {
        return teacherDao.findByName(name);
    }

    @Override
    public TeacherDto findById(int id) {
        return null;
    }

    // LIST
    @Override
    public List<TeacherDto> list() {
        return teacherDao.list();
    }

    // UPDATE
    @Override
    public TeacherDto update(int id, TeacherDto teacherDto) {
        return teacherDao.update(id, teacherDto);
    }

    // DELETE
    @Override
    public TeacherDto delete(int id) {
        return teacherDao.delete(id);
    }

    // CHOOISE(Switch-case)
    @Override
    public void chooise() {
        teacherDao.chooise();
    }
}