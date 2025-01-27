package Classes;

public class NumberObject {

    protected int number;

    public NumberObject(int number){
        this.number = number;
    }

    public int getNumberObject() {
        return number;
    }

    public void setNumberObject(int number) {
        this.number = number;
    }

    @Override
   public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        NumberObject that = (NumberObject) obj;
        return this.number == that.number;
    }

}
