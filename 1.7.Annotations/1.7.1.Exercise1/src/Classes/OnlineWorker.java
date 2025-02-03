package Classes;

public class OnlineWorker extends Worker {

    private final float internet;

    public OnlineWorker(String name, String surname, double priceHour, float internet) {
        super(name, surname, priceHour);
        this.internet = internet;
    }

    public float getInternet() {
        return internet;
    }

    @Override
    public double calculateSalary(double monthlyHoursWorked){
        return ((monthlyHoursWorked * super.getPriceHour()) + getInternet());
    }
}
