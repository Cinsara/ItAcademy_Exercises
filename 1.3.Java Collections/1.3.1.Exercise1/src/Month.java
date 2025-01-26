import java.util.ArrayList;

public class Month {

    //private ArrayList<String> months = new ArrayList<String>();
    private String name = "January";

    public Month(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }

}
