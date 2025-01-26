package Classes;

public class Wind extends Instrument {

    public Wind(String name, double price) {
        super(name, price);
    }

    public void playAnInstrument(){
        System.out.println("A wind instrument is being played.");
    }


}
