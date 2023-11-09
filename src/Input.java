import java.util.Scanner;

public class Input {
    public static int takeIntAsOption(){
        Scanner scn = new Scanner(System.in);
        while (!scn.hasNextInt()) {
            Print.invalidInput();
            scn.nextLine();
            System.out.print("Select an option: ");
        }
        int num = scn.nextInt();
        scn.nextLine();
        return num;
    }

    public static int takeIntAsNumber(){
        Scanner scn = new Scanner(System.in);
        while (!scn.hasNextInt()) {
            Print.invalidInput();
            scn.nextLine();
            System.out.print("Enter Number: ");
        }
        int num = scn.nextInt();
        scn.nextLine();
        return num;
    }

    public static int takeIntAsAge(){
        Scanner scn = new Scanner(System.in);
        while (!scn.hasNextInt()) {
            Print.invalidInput();
            scn.nextLine();
            System.out.print("Enter Age: ");
        }
        int num = scn.nextInt();
        scn.nextLine();
        return num;
    }

    public static double takeDoubleAsHeight(){
        Scanner scn = new Scanner(System.in);
        while (!scn.hasNextDouble()) {
            Print.invalidInput();
            scn.nextLine();
            System.out.print("Enter Height: ");
        }
        double num = scn.nextDouble();
        scn.nextLine();
        return num;
    }

    public static double takeDoubleAsWeeklySalary(){
        Scanner scn = new Scanner(System.in);
        while (!scn.hasNextDouble()) {
            Print.invalidInput();
            scn.nextLine();
            System.out.print("Enter Weekly Salary: ");
        }
        double num = scn.nextDouble();
        scn.nextLine();
        return num;
    }

    public static double takeDoubleAsLowerBoundSalary(){
        Scanner scn = new Scanner(System.in);
        while (!scn.hasNextDouble()) {
            Print.invalidInput();
            scn.nextLine();
            System.out.print("Enter Lower Bound of Salary: ");
        }
        double num = scn.nextDouble();
        scn.nextLine();
        return num;
    }

    public static double takeDoubleAsUpperBoundSalary(){
        Scanner scn = new Scanner(System.in);
        while (!scn.hasNextDouble()) {
            Print.invalidInput();
            scn.nextLine();
            System.out.print("Enter Upper Bound of Salary: ");
        }
        double num = scn.nextDouble();
        scn.nextLine();
        return num;
    }

    public static String takeString(){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        return s;
    }
}
