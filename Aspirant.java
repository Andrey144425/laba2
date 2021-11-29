package com.company;

public class Aspirant extends Student {

    // поля класса
    private String firstName;
    private String lastName;
    private int group;
    private double averageMark;
    private String work;

    // пустой конструктор
    public Aspirant() {
        super();
        this.work = "diploma";
    }

    // конструктор с параметрами
    public Aspirant(String firstName, String lastName, int group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    // геттеры класса
    public String getWork(){ return work; }

    // фуункция вычисления стипендии
    @Override
    public double getScholarship(){
        return averageMark == 5 ? 200: 180;
    }

    // функция вывода информации об аспиранте
    public void display(){
        System.out.printf("Name: %s %s , группа: %d, средний балл: %f, текущая работа: %s \n", getFirstName(), getLastName(), getGroup(), getAverageMark(), getWork() );
    }
}
