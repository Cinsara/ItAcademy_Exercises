package Classes;

abstract class Instrument {
    protected String name = "";
    protected double price;

    public Instrument(String name, double price){
        this.name = name;
        this.price = price;
    }

    public abstract void playAnInstrument();

    static {
        System.out.println("The instrument class has been loaded into memory");
    }

}
