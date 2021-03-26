package com.company;

import java.time.LocalDate;
import java.util.Objects;

/*
@USER: Java02
@DATE: 20.03.2021
@NAME: Student
*/
public class Hospital {
    private String room;
    private String doctorName;
    private String pills;
    private String nameMother;
    private String nameFather;
    private LocalDate dateOfBirthMother;
    private LocalDate dateOfBirthFather;
    private String phoneNumberMother;
    private String phoneNumberFather;
    private String cityOfResidence;

    public Hospital() {
    }

    public Hospital(String room, String doctorName, String pills, String nameMother, String nameFather, LocalDate dateOfBirthMother, LocalDate dateOfBirthFather, String phoneNumberMother, String phoneNumberFather, String cityOfResidence) {
        this.room = room;
        this.doctorName = doctorName;
        this.pills = pills;
        this.nameMother = nameMother;
        this.nameFather = nameFather;
        this.dateOfBirthMother = dateOfBirthMother;
        this.dateOfBirthFather = dateOfBirthFather;
        this.phoneNumberMother = phoneNumberMother;
        this.phoneNumberFather = phoneNumberFather;
        this.cityOfResidence = cityOfResidence;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPills() {
        return pills;
    }

    public void setPills(String pills) {
        this.pills = pills;
    }

    public String getNameMother() {
        return nameMother;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public LocalDate getDateOfBirthMother() {
        return dateOfBirthMother;
    }

    public void setDateOfBirthMother(LocalDate dateOfBirthMother) {
        this.dateOfBirthMother = dateOfBirthMother;
    }

    public LocalDate getDateOfBirthFather() {
        return dateOfBirthFather;
    }

    public void setDateOfBirthFather(LocalDate dateOfBirthFather) {
        this.dateOfBirthFather = dateOfBirthFather;
    }

    public String getPhoneNumberMother() {
        return phoneNumberMother;
    }

    public void setPhoneNumberMother(String phoneNumberMother) {
        this.phoneNumberMother = phoneNumberMother;
    }

    public String getPhoneNumberFather() {
        return phoneNumberFather;
    }

    public void setPhoneNumberFather(String phoneNumberFather) {
        this.phoneNumberFather = phoneNumberFather;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "room='" + room + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", pills='" + pills + '\'' +
                ", nameMother='" + nameMother + '\'' +
                ", nameFather='" + nameFather + '\'' +
                ", dateOfBirthMother=" + dateOfBirthMother +
                ", dateOfBirthfather=" + dateOfBirthFather +
                ", phoneNumberMother='" + phoneNumberMother + '\'' +
                ", phoneNumberFather='" + phoneNumberFather + '\'' +
                ", cityOfResidence='" + cityOfResidence + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital Hospital = (Hospital) o;
        return Objects.equals(room, Hospital.room) && Objects.equals(doctorName, Hospital.doctorName) && Objects.equals(pills, Hospital.pills) && Objects.equals(nameMother, Hospital.nameMother) && Objects.equals(nameFather, Hospital.nameFather) && Objects.equals(dateOfBirthMother, Hospital.dateOfBirthMother) && Objects.equals(dateOfBirthFather, Hospital.dateOfBirthFather) && Objects.equals(phoneNumberMother, Hospital.phoneNumberMother) && Objects.equals(phoneNumberFather, Hospital.phoneNumberFather) && Objects.equals(cityOfResidence, Hospital.cityOfResidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(room, doctorName, pills, nameMother, nameFather, dateOfBirthMother, dateOfBirthFather, phoneNumberMother, phoneNumberFather, cityOfResidence);
    }
}
