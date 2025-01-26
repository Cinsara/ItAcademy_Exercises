import Classes.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Testing loading class using instances: ");

        Wind instrumentWind = new Wind("Flute", 35.50);
        Percussion instrumentPercussion = new Percussion("Drum", 67.50);
        StringInstrument instrumentString = new StringInstrument("Guitar", 45.00);

        instrumentWind.playAnInstrument();
        instrumentString.playAnInstrument();
        instrumentPercussion.playAnInstrument();
    }

}