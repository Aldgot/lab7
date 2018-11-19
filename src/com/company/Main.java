package com.company;

public class Main {

    public static void main(String[] args) {
        Abiturient abiturient1 = new Abiturient();
        Predmet myPredmet = Predmet.BIOLOGY;
        abiturient1.setNumber(123456);
        abiturient1.setName("Иван Иванов Иванович");
        abiturient1.setBirthday(1999);
        abiturient1.setAverageRatings(9);
        System.out.println("Number: " + abiturient1.getNumber());
        System.out.println("Name: " + abiturient1.getName());
        System.out.println("Year of Birth: " + abiturient1.getBirthday());
        System.out.println("Capital: " + myPredmet.getOcenka());
        System.out.println("Average Ratings: " + abiturient1.getAverageRatings());
    }
}

class Abiturient{
    private int number;
    private String name;
    private int birthday;
    private int averageRatings;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number<0){
            System.out.println("Некорректный ввод");
        }
        else {
            this.number = number;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Некорректный ввод);
        }
        else {
            this.name = name;
        }
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        if(birthday<0 && number>2018){
            System.out.println("Некорректный ввод");
        }
        else {
            this.birthday = birthday;
        }
    }

    public int getAverageRatings() {
        return averageRatings;
    }

    public void setAverageRatings(int averageRatings) {
        if(averageRatings<0 && averageRatings>12 && averageRatings<1){
            System.out.println("Некорректный ввод");
        }
        else {
            this.averageRatings = averageRatings;
        }
    }
}