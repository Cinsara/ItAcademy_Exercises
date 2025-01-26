package Classes;
public class Percussion extends Instrument {

    public Percussion(String name, double price){
        super(name,price);
    }

    public void playAnInstrument(){
        System.out.println("A percussion instrument is being played.");
    }

}
