import javax.swing.JOptionPane;
import java.util.*;
public class BMI_driver
{
    public static void main(String[]args){
        boolean tryAgain;
        do {
            tryAgain=false;
            Scanner keyboardInput=new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String userName=keyboardInput.next();
            System.out.println("\nHello " + userName + "! This program will help you calculate your BMI.\n");
            System.out.print("Please enter your weight in pounds: ");
            double weight=keyboardInput.nextDouble();
            System.out.print("Please enter your height in inches: ");
            double height=keyboardInput.nextDouble();
            BMI calculateBMI=new BMI(weight,height);
            System.out.printf(userName+" according to what you entered your BMI is: %.2f",calculateBMI.getBMI());
            System.out.println("\n\nStatus: "+calculateBMI.getStatus());
            System.out.println("\nEnter another patient's information? (yes/no)");
            String anotherTry=keyboardInput.next();
            if(anotherTry.equalsIgnoreCase("yes"))
                tryAgain=true;              
        }while(tryAgain);
        System.out.println("Thank you for participating.");
    }
}