package games;


import java.util.Scanner;

public class multiplicationdoodad { //varible name of class,( blueprint for object of )=class

    Scanner myScanner = new Scanner(System.in); //the instance varible is myScanner

    public static void main(String[] args) { //the front door or the main entrance for the prgram
        multiplicationdoodad mdd = new multiplicationdoodad(); //create new instence for the class just to start working
        mdd.getValues();

    }

    private void getValues() { // h methodos pou dhlonoume mia timh an ueloyme na mas epistrepsei timh
        System.out.println(" What number would you like the multiplication table for? ");
        int number = Integer.parseInt(myScanner.nextLine());
        System.out.println(" What is the maximum multiplication you wish to Calculate? ");
        int multiplier = Integer.parseInt(myScanner.nextLine());
        calculate(number, multiplier); //anakalei thn meuodo ou tha akooythisei epeita


    }

    private void calculate(int number, int multiplier) {
        for (int i = 1; i < multiplier; i++) {
            System.out.println(i + " times " + number + " is " + i * number);

        }
    }
}
