package Interfaces;
public interface Watch {

    public default void alarm() {
        System.out.println("The alarm is ringing.");
    }
}
