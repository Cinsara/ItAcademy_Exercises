package Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DniTest {

    @Test
    public void calculateLetter(){

        List<Integer> numbers = new ArrayList<>();
        String dni_letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int rest;

        numbers.add(12345678);
        numbers.add(87654321);
        numbers.add(11223344);
        numbers.add(55667788);
        numbers.add(99887766);
        numbers.add(44332211);
        numbers.add(13579246);
        numbers.add(24681357);
        numbers.add(98765432);
        numbers.add(56781234);

        List<Character> letters = new ArrayList<>();

        letters.add('Z');
        letters.add('X');
        letters.add('B');
        letters.add('Z');
        letters.add('P');
        letters.add('X');
        letters.add('T');
        letters.add('B');
        letters.add('M');
        letters.add('F');

        for(int i = 0; i < numbers.size(); i++){
            char calculateLetter;
            int dniNumber = numbers.get(i);
            char letter = letters.get(i);

            rest = dniNumber % 23;
            calculateLetter = dni_letters.charAt(rest);

            assertEquals(letter, calculateLetter,
                    String.format("The letter of the DNI %d doesn't match. Expected: %c, Calculate: %c",
                            dniNumber, letter, calculateLetter));
        }
    }
}
