import Classes.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static ArrayList<Month> allMonths = new ArrayList<Month>();
    static HashSet<Month> cHashSet;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws NotDuplicatesHashSet {

        foundAgost();
        showHashSet();
        notDuplicates();
    }

    public static void insertMonth(){

        int c = 0;
        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");

        allMonths.add(january);
        allMonths.add(february);
        allMonths.add(march);
        allMonths.add(april);
        allMonths.add(may);
        allMonths.add(june);
        allMonths.add(july);
        allMonths.add(september);
        allMonths.add(october);
        allMonths.add(november);
        allMonths.add(december);

        System.out.println("Months list without Agost:\n");

        while(c < allMonths.size()){
            System.out.println(allMonths.get(c).getName());
            c++;
        }

        System.out.println();
    }

    public static void foundAgost(){

        insertMonth();
        Month agost = new Month("Agost");
        int c = 0;

        System.out.println("Months list with Agost:\n");

        for(int i = 0; i < allMonths.size(); i++){
            if(i == 7){
                allMonths.add(i,agost);
            }
        }

        while(c < allMonths.size()){
            System.out.println(allMonths.get(c).getName());
            c++;
        }

        System.out.println();
    }

    public static void convertHashSet(){
       cHashSet = new HashSet<>(allMonths);
    }

    public static void showHashSet(){
        convertHashSet();
        System.out.println("Arraylist to HashSet:\n");

        for(Month value : cHashSet){
            System.out.println(value);
        }
    }

    public static void notDuplicates() throws NotDuplicatesHashSet {
        int option;
        Month january = new Month("January");

        System.out.println("Select a option:\n" +
                "1. With a one month duplicate.\n" +
                "2. Without a month duplicate.\n" +
                "0. Exit.");

        do{
            option = input.nextInt();

            switch(option){
                case 1:
                    cHashSet.add(january);
                    if(!cHashSet.add(january)){
                        throw new NotDuplicatesHashSet("Hash Set doesn't admit duplicates.");
                    } else {
                        System.out.println("All is good. The Hash Set doesn't have duplicates.");
                    }

                    for(Month value : cHashSet){
                        System.out.println(value);
                    }
                    break;

                case 2:
                    for(Month value : cHashSet){
                        System.out.println(value);
                    }
                    break;

                case 0:
                    System.out.println("Exit.");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while(option != 0);
    }
}