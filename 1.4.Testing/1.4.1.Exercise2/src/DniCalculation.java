import java.util.Scanner;

public class DniCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dniNumber;
        char letter;

        System.out.println("Insert your DNI number:");

        dniNumber = input.nextInt();
        letter = DniLetterCalculate(dniNumber);

        System.out.println("The letter for yor DNI number is: " + letter);
    }

    public static char DniLetterCalculate(int dni){
        int rest;
        String dni_letters = "TRWAGMYFPDXBNJZSQVHLCKE";

        rest = dni % 23;
        return dni_letters.charAt(rest);
    }

}