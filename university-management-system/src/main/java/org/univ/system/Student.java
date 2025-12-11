package org.univ.system;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Student implements Enrollable {
    private String name;
    private String studentId;
    private Faculty major;

    public Student(String name, String studentId, Faculty major) {
        if (!studentId.matches("\\d{8}"))
            this.name = name;
        this.studentId = studentId;
        this.major = major;
    }
}
