package Classes;

public class FaceToFaceWorker extends Worker{

    private static double gasoline;

    public FaceToFaceWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    public static double getGasoline() {
        return gasoline;
    }

    public static void setGasoline(double gasoline) {
        FaceToFaceWorker.gasoline = gasoline;
    }

    @Override
    public double calculateSalary(double monthlyHoursWorked){
        return ((monthlyHoursWorked * super.getPriceHour()) + getGasoline());
    }

    @Deprecated
    public int simpleCalculation(){
        return 5 +2;
    }
}
