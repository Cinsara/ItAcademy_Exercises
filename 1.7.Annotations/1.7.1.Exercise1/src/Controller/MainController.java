package Controller;

import Classes.*;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    static List<Object> listWorkers = new ArrayList<>();
    static List<Double> listHours = new ArrayList<>();

    public static void start(){
        setUpGasoline();
        calculateMethods();
    }

    private static void instanceWorker(){
        OnlineWorker onlineWorker = new OnlineWorker("Juan","Pérez",7.5, 21);
        FaceToFaceWorker faceToFaceWorker = new FaceToFaceWorker("Laura","Martín", 6);
        Worker worker = new Worker("Nathan", "Carter", 8.6);

        listWorkers.add(onlineWorker);
        listWorkers.add(faceToFaceWorker);
        listWorkers.add(worker);

        listHours.add(245.0);
        listHours.add(231.0);
        listHours.add(20.2);
    }

    private static void setUpGasoline(){
        FaceToFaceWorker.setGasoline(1.45);
    }

    private static void calculateMethods(){
        instanceWorker();

        List <Double> salaries = new ArrayList<>();
        double calcsalary = 0.0;
        System.out.println("The salaries are:");
        for(int i = 0; i < listWorkers.size(); i++){
            if(listWorkers.get(i) instanceof OnlineWorker){
                calcsalary = ((OnlineWorker) listWorkers.get(i)).calculateSalary(listHours.get(i));
            } else if (listWorkers.get(i) instanceof FaceToFaceWorker) {
                calcsalary = ((FaceToFaceWorker) listWorkers.get(i)).calculateSalary(listHours.get(i));
            } else if (listWorkers.get(i) instanceof Worker){
                calcsalary = ((Worker) listWorkers.get(i)).calculateSalary(listHours.get(i));
            }
            salaries.add(calcsalary);
        }

        for(int i=0; i<listWorkers.size();i++){
            System.out.printf("- %s : %s\n", listWorkers.get(i).getClass().getSimpleName(), salaries.get(i));
        }
    }
}
