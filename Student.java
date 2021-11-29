package com.company;

// класс студент
public class Student {
    // поля класса
    private String firstName;
    private String lastName;
    private int group;
    private double averageMark;

    // пустой конструктор
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.group = 1;
        this.averageMark = 0.0;
    }

    // конструктор с параметрами
    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    // геттеры класса
    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public int getGroup(){ return group; }
    public double getAverageMark(){ return averageMark; }

    // фуункция вычисления стипендии
    public double getScholarship(){
        return averageMark == 5 ? 100: 80;
    }

    // функция вывода информации о студенте
    public void display(){
        System.out.printf("Name: %s %s , группа: %d, средний балл: %f \n", getFirstName(), getLastName(), getGroup(), getAverageMark() );
    }

}
