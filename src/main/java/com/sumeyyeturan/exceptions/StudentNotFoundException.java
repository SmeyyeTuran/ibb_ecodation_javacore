package com.sumeyyeturan.exceptions;

// Öğrenci bulunamazsa Fırlatılacak Özel Excepiton
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}