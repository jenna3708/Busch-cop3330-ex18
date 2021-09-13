import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" + "Press F to convert from Celsius to Fahrenheit. ");
        String unit = input.next();

        if(unit.equals("f"))
        {
            unit = "F";
        }
        else if(unit.equals("c"))
        {
            unit = "C";
        }

        System.out.println("Your choice:"+unit);

        Scanner input2 = new Scanner(System.in);
        if(unit.equals("F"))
        {
            System.out.println("Please enter the temperature in Celsius:");
        }
        else if(unit.equals("C"))
        {
            System.out.println("Please enter the temperature in Fahrenheit:");
        }
        String temp = input2.next();
        int convTemp = Integer.parseInt(temp);

        if(unit.equals("F"))
        {
            int newTemp = (convTemp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is "+newTemp+".");
        }
        else if(unit.equals("C"))
        {
            int newTemp = (convTemp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is "+newTemp+".");
        }



    }
}