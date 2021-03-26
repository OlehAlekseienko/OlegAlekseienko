package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Hospital patient = new Hospital();
        patient.setCityOfResidence("Chernovtsy");
        patient.setRoom("22");
        patient.setPills("Nurofen, Solpodein");
        patient.setDateOfBirthMother(LocalDate.of(1978,2,15));
        patient.setDateOfBirthMother(LocalDate.of(1983,6,27));
        patient.setNameFather("Vasya");
        patient.setNameMother("Sasha");
        patient.setDoctorName("Grigoriy");
        patient.setPhoneNumberFather("+380500764665");
        patient.setPhoneNumberMother("+380500567347");
        System.out.println(patient);
    }
}
