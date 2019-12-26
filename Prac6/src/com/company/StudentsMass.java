package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StudentsMass {
    public Student[] students;

    StudentsMass(int count)
    {
        students = new Student[count];
    }

    static private Comparator<Student> srtToUp; //создаем правило для сравнения студентов
    static private Comparator<Student> srtToDown;
    static {
        srtToUp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getID(), o2.getID());
            }
        };
        srtToDown = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o2.getID(), o1.getID());
            }
        };
    }

    public void fillStudents(String[] arrayNames, int[] arrayID)
    {
        for (int i = 0; i < students.length; i++)
        {
            students[i] = new Student(arrayNames[i], arrayID[i]);
        }
    }

    public void sortStudents(int type)
    {
        if (type == 0) Arrays.sort(students, srtToUp);
        else if (type == 1) Arrays.sort(students, srtToDown);
    }

    static public void main(String[] args)
    {

        StudentsMass std = new StudentsMass(5);
        String[] str = {"Петя", "Вася", "Вова", "Глеб", "Саша"};
        int[] mas = {10023, 10000, 23100, 45000, 10001};
        std.fillStudents(str, mas);
        std.sortStudents(1);
        for (Student stud : std.students)
        {
            System.out.print(stud);
        }
    }
}
