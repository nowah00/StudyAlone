package eutcha.prob02;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 같은 객체
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.studentNum == other.studentNum; // 학번 같으면 동일
    }
}
