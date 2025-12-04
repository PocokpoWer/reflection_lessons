package org.univ.system;

public class Student implements Enrollable {
    private String name;
    private String studentId;
    private String major;

    public Student(String name, String studentId, String major) {
        if (!studentId.matches("\\d{8}"))
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }
}
