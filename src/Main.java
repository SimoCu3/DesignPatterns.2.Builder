/*
CONSEGNA:
Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video
*/

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persone persone = new Persone();

        Person person1 = new Person.PersonBuilder()
                .setFirstName("Simone")
                .setLastName("Cuccu")
                .setAge(21)
                .setAddress("Via XYZ")
                .build();

        Person person2 = new Person.PersonBuilder()
                .setFirstName("Mario")
                .setLastName("Careddu")
                .setAge(22)
                .setAddress("Via ZYX")
                .build();

        
        persone.getPersone().add(person1);
        persone.getPersone().add(person2);

        System.out.println(person1);
        System.out.println(person2);

    }
}