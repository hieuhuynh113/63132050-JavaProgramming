package Bai4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Scanner;

class Student {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Score: " + score;
    }

    public boolean isExcellent() {
        return score >= 8.0; // Giả sử 8.0 là ngưỡng cho sinh viên giỏi
    }

    // Thêm phương thức getter cho điểm
    public double getScore() {
        return score;
    }
}




