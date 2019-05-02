package animals;

import java.util.Scanner;

public class createAnimals {
    Scanner myScanner = new Scanner(System.in);


public static void main(String[]args){

        creatAnimal create=new creatAnimal();
        create.animals();
        }

    private void getAnimalType(){
        System.out.println(" What animal would you like to create? ");
        String animal = myScanner.nextLine();

 if(animal.equalsIgnoreCase( "dog")) {
    creatDog();
        }
else if(animal.equalsIgnoreCase("cat"){
    creatCat();
    }
    else {
        System.out.println( animal + " is not an animal we can currently create, please try again ");
        }

        getAnimalType();
    }
    private void creatDog() {
            System.out.println(" What is the dogs name? ");
            String name = myScanner.nextLine();
            System.out.println(" How big is the dog? ");
            String size = myScanner.nextLine();
            System.out.println(" How old is the dog? ");
            int age = Integer.parseInt();
            System.out.println(" What breed is the dog? ");
            String breed = myScanner.nextLine();
            dog myDog = new dog(name, size, age, breed);

            myDog.bark(size);
            myDog.play(breed);
            myDog.beHuman( name, age, breed);


    }

    private void creatCat() {
            System.out.println(" What is the cats name? ");
            Scanner myScanner;
            String name = myScanner.nextLine();
            System.out.println(" How big is the cat? ");
            String size = myScanner.nextLine();
            System.out.println(" How old is the cat? ");
            int age = myScanner.nextLine();
            System.out.println(" What color is the cat? ");
            String color = myScanner.nextLine();
            System.out.println(" What gender is the cat? ");
            Boolean gender = myScanner.nextLine();

            cat myCat = new cat(name, size, age, color, gender);

            myCat.bark(size);
            myCat.behavior(mood);

    }

}



