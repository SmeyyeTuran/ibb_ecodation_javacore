package com.sumeyyeturan;

import com.sumeyyeturan.controller.StudentController;
import com.sumeyyeturan.dto.PersonDto;

//
public class Main {
    public static void main(String[] args) {
        try {
            StudentController studentController = new StudentController();
            studentController.chooise();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}