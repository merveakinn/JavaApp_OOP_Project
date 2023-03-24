package com.merveakin.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*
        User myUser = new User();
        myUser.name = "Merve";
        myUser.job = "Instructor";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";
    */

        User myUser = new User("Merve", "Instructor");
        System.out.println(myUser.name);

        //Encapsulation

        Musician james = new Musician("James", "Guitar", 50);
        james.age = 60;  //jame.age'e eriştik ve değiştirdik (Musician sınıfında private yaparsak age kısmını ulaşamayız)
        System.out.println(james.age);

        System.out.println(james.getName());

        james.setAge(60, "Merve");  //password doğruysa yazar doğruyu password yanlışsa 50 yazar
        System.out.println(james.getAge());


        //Inheritance

        SuperMusician lars = new SuperMusician("Lars", "Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());


        //Polymorphism

        //Static Polymorphism

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        //Dynamic Polymorphism

        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

    }
}