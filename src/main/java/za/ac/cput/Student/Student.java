package za.ac.cput.Student;

import java.util.Collection;
import java.util.Objects;

public class Student {

    private String firstName , Surname ;
    private int studentNum;
    private String Course ;
    private int yearOfStudy;

    public Student(String firstName , int studentNum)
    {
        this.firstName = firstName;
        this.studentNum = studentNum;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", Surname='" + Surname + '\'' +
                ", studentNum=" + studentNum +
                ", Course='" + Course + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNum == student.studentNum && firstName.equals(student.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, studentNum);
    }

}
