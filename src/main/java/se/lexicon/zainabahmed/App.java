package se.lexicon.zainabahmed;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "OOP exercises" );
        //Car
        System.out.println("Car");
        Car Reynault = new Car(1,2020, "Captur", "red", "160hp");
         Reynault.drive();

         //Rectangle
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  //input . instead of , for decimal places
        double inputHeight, inputWidth, tableArea;
        System.out.println("Rectangle");
            // take input, calculate area
        Rectangle table = new Rectangle();
        System.out.println("Please enter height : ");
        inputHeight = scanner.nextDouble();
        System.out.println("Please enter width : ");
        inputWidth = scanner.nextDouble();
        tableArea= table.getArea(inputHeight, inputWidth);
        System.out.printf("%.2f",tableArea);  // formatted to two decimal places

        //
    }

}
