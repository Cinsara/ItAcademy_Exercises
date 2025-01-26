package Classes;
public class StringInstrument extends Instrument {

    public StringInstrument(String name, double price){
        super(name,price);
    }

    public void playAnInstrument(){
        System.out.println("A string instrument is being played.");
    }

}
