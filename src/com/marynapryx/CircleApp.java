////////////////////////////////////////////////
// CircleApp that gets the user input,        //
// creates a Circle object,                   //
// and displays the circumference and area.   //
////////////////////////////////////////////////

package com.marynapryx;

import java.util.Scanner;

/**
 * @author marynaprix
 */

public class CircleApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the CircleApp!");
        userInteraction();
    }


    public static void userInteraction(){
        Scanner keyboard = new Scanner(System.in);
        char repeat; //to hold y/n
        String input; //to hold input
        int count = 0;

        do{
            System.out.println("Please enter the radius of the circle");
            double radius = keyboard.nextDouble();

            Circle circle = new Circle(radius);
            circle.setArea(circle.getArea());
            circle.setCircumference(circle.getCircumference());

            System.out.println("Circumference is " + circle.getFormattedCircumference());
            System.out.println("Area is " + circle.getFormattedArea());
            System.out.println();
            keyboard.nextLine();

            // Check if the user wants to continue
            System.out.println("Do you want to continue, y/n: ");
            input = keyboard.nextLine();
            repeat = input.charAt(0);
            System.out.println();
            count++;
            Circle.setObjectCount(count);

        }while (repeat == 'y' || repeat == 'Y');

        System.out.println("You created " + Circle.getObjectCount() + " circle object(s).");
    }



}
