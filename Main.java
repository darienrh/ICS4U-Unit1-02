/*
* The "Template" program is a template
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-XX
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class Main {

    /**
    * Speed of light.
    */
    private static final double SPEEDOFLIGHT = 299792458;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        double mass = 0.0;
        double energy = 0.0;
        Scanner myInput = new Scanner(System.in);  //define instance of Scanner
        System.out.print("Enter the mass of the object (kg) : ");
        try {
            mass = myInput.nextDouble(); //get input from the user
            energy = mass * SPEEDOFLIGHT * SPEEDOFLIGHT;  //do the math
            System.out.println("An object of mass " + mass + "would produce "
              + energy + " J of Energy");
        } catch (java.util.InputMismatchException errorCode) {
            System.out.println("Sorry that was not a number !!!");
        }

      System.out.println("\nDone.");
    }
}
