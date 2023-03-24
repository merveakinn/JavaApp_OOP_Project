package com.merveakin.oopproject;

public class Musician {

    String name;
    String instrument;
    int age;

    public Musician(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setAge(int age, String password) {  //age'i set yapabilme koşulu koydum password true dönerse set yapabilir
        if (password.matches("Merve")){
            this.age = age;


        }


    }

    }

