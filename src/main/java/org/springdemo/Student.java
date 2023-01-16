package org.springdemo;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
        System.out.println("setStudentId");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println("setStudentName");
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
        System.out.println("setStudentAddress");
    }

    public Student(int studentId, String studentName, String studentAddress) {
        super();
        System.out.println("parametrized student constructor");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
        System.out.println("default student constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
