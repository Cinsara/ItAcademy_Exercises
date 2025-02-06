package Classes;

public class Worker {

    private String name;
    private String surname;
    private double priceHour;

    public Worker(String name, String surname, double priceHour) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getPriceHour(){
        return priceHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPriceHour(float priceHour) {
        this.priceHour = priceHour;
    }

    public double calculateSalary(double hoursWorked){
        return hoursWorked * this.priceHour;
    }
}
