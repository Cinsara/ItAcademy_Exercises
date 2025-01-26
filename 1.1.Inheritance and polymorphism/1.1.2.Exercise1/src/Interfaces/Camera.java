package Interfaces;
public interface Camera {

    public default void to_photograph() {
        System.out.println( "A photograph is being taken.");
        }

}
