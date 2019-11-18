package catchingexceptions;

import javax.swing.*;

public class CatchingExceptions {

    public static void main(String[] args) {
        String myInput;
        int numerator = 0, denominator = 0;
        int result = 0;
        boolean flag = true;
        //System.out.println(result);
        while (flag){
        try {
            //User inputs
            myInput = JOptionPane.showInputDialog("Enter an integer numerator: ");
            //Crash on non-integer inputs
            numerator = Integer.parseInt(myInput);

            myInput = JOptionPane.showInputDialog("Enter an integer denominator: ");
            denominator = Integer.parseInt(myInput);


            //Will crash if denominator == 0
            result = numerator / denominator;
            //System.out.println(result);
        } catch (ArithmeticException ae) {
            System.err.println("You cannot have a denominator of 0.");
            System.err.println("Exception: " + ae);
            //System.exit(1);
        } catch (NumberFormatException nfe) {
            System.err.println("You must enter integers.");
            System.err.println("Exception: " + nfe);
            //System.exit(1);
        }
        //flag = false;
        System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
        
        }
        //System.out.println(result);
    }
}
