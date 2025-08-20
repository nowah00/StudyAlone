package eutcha.prob04.comparable;

public class Student implements Comparable<Student>{
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student o2) {
        if (this.score > o2.score) {
            return 1;
        } else if (this.score < o2.score) {
            return -1;
        } return 0;
    }
}
