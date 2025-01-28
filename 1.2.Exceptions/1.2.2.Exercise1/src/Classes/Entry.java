package Classes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {
    private static final Scanner input = new Scanner(System.in);

    public static byte readByte(String message){
        byte data = 0;
        boolean valid = false;

        while(!valid){
            try{
                System.out.println(message);
                data = input.nextByte();
                valid = true;
            } catch(InputMismatchException e){
                System.out.println("Error. Please write a valid number.");
                input.next();
            }
        }
        return data;
    }

    public static int readInt(String message){
        int data = 0;
        boolean valid = false;

        while(!valid){
            try{
                System.out.println(message);
                data = input.nextInt();
                valid = true;
            } catch(InputMismatchException e){
                System.out.println("Error. Please write a valid integer.");
                input.next();
            }
        }
        return data;
    }

    public static float readFloat(String message){
        float data = 0;
        boolean valid = false;

        while(!valid){
            try{
                System.out.println(message);
                data = input.nextFloat();
                valid = true;
            } catch(InputMismatchException e){
                System.out.println("Error. Please write a valid decimal number.");
                input.next();
            }
        }
        return data;
    }

    public static double readDouble(String message) {
        double data = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print(message);
                data = input.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. Please write a valid decimal number.");
                input.next();
            }
        }
        return data;
    }

    public static char readChar(String message) {
        char data = ' ';
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print(message);
                String write = input.next();
                input.nextLine();
                if (write.length() == 1) {
                    data = write.charAt(0);
                    valid = true;
                } else {
                    System.out.println("Error. Please, write only one character.");
                }
            } catch (Exception e) {
                System.out.println("Error. Something is wrong. Please try again.");
            }
        }
        return data;
    }

    public static String readString(String message) {
        String data = "";
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print(message);
                data = input.nextLine();
                valid = true;
            } catch (Exception e) {
                System.out.println("Error. Something is wrong. Please try again.");
                input.next();
            }
        }
        return data;
    }

    public static boolean readYesOrNot(String message) {
        boolean valid = false;
        boolean answer = false;

        while (!valid) {
            try {
                System.out.print(message);
                String write = input.nextLine().toLowerCase();

                if (write.equals("y")) {
                    answer = true;
                    valid = true;
                } else if (write.equals("n")) {
                    valid = true;
                } else {
                    System.out.println("Error. Please enter 'y' for yes or 'n' for no.");
                }
            } catch (Exception e) {
                System.out.println("Error. Something is wrong. Please try again.");
                input.nextLine();
            }
        }
        return answer;
    }
}
