import Classes.FaceToFaceWorker;
import Classes.OnlineWorker;
import Classes.Worker;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        String sentence;
        int calculation;

        OnlineWorker onlineWorker = new OnlineWorker("Juan","Pérez",7.5, 21);
        FaceToFaceWorker faceToFaceWorker = new FaceToFaceWorker("Laura","Martín", 6);

        calculation = faceToFaceWorker.simpleCalculation();
        sentence = onlineWorker.sentence();

        System.out.printf("- First deprecated method: %d\n- Second deprecated method: %s%n",
                calculation, sentence);

    }
}