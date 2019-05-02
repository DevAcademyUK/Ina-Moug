package animals;

import java.util.Scanner;

public static void main(String[]args){


public class cat {
    private String name;
    private String size;
    private int age;
    private String color;
    private Boolean male;
    private Boolean female;
    private String mood;

    public cat(String name, String size, int age, String color, Boolean gender, String mood) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.color = color;
        this.mood = mood;

        Boolean m = male;
        Boolean f = female;

        if (gender = f)
        {
            System.out.print("female");
        }

        else if (gender = m)
        {
            System.out.print("male");
        }
    }

}

    private String bark(String size) {
        String bark = "";
        if (size.equalsIgnoreCase("large")) {
            bark = " yap yap yap";
        } else if (size.equalsIgnoreCase("XXlarge")) {
            bark = " moeww moeww";
        } else {
            bark = "MOEWW! MOEWW!";
        }
        return bark;
    }

    private String behavior(String mood) {
        String behavior = "";
        if (mood.equalsIgnoreCase("happy")) {
            behavior = " Jumping everywhere ";
        } else if (mood.equalsIgnoreCase("calm")) {
            behavior = " Coming around and for caress ";
        } else if (mood.equalsIgnoreCase("angry")) {
            behavior = " Meoowwww ";
        }
        return behavior;
    }


}

