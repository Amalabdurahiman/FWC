import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("\n\nWelcome to Fitness Weekend Club (FWC)");
            System.out.println("_________________________________\n");
            System.out.println("Menu");
            System.out.println("1. Reserve Fitness Lesson\n2. Change/Delete a Reservation\n3. Attend a Lesson\n4. Monthly Report\n5. Monthly Champion Fitness Report\n6. Exit\n" );
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> Reservation.ReservationView();
                case 2 -> Delete.DeleteShow();
                case 3 -> Attend.AttendShow();
                case 4 -> Review.MonthlyReviewShow();
                case 5 -> Review.ChampionReviewShow();
                case 6 -> System.out.println("\nTHANK YOU\n\n");
                default -> System.out.println("Wrong Choice\n");
            }





        }while(choice!=6);




    }
}