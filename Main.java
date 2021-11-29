package com.company;

public class Main {

    // основна программа
    public static void main(String[] args) {
        // создаем объект класса студент, который ссылается на класс аспирант
        Student s1 = new Aspirant("Ivan", "Ivanov", 1, 5.0, "diploma");
        s1.display();

        // создаем массив студентов
        Student[] arr = new Student[2];
        // заполняем элементы
        arr[0] = new Student("Petr", "Petrov", 2, 4.0);
        arr[0].display();
        arr[1] = new Aspirant("Anton", "Sidorov", 3, 5.0, "course");
        arr[1].display();

        // проходимся по массиву и вызываем метод для вычисления стипендии
        for(int i = 0; i < arr.length; i++)
            System.out.println("Стипендия студента = " + arr[i].getScholarship());
    }
}
