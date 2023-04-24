import java.util.Scanner;

public class Reservation {

    static int classKey;
    static void ReservationView() {

        Scanner sc=new Scanner(System.in);
        int classChoice,dayChoice,fitChoice;
        System.out.println("\nReserve Fitness Lesson");
        System.out.println("------------------------------\n");
        System.out.println("Reserve Your Class By");
        System.out.println("1. Day\n2. Fitness Type\n");
        classChoice = sc.nextInt();
        if (classChoice == 1) {
            System.out.println("\nChoose Your Day");
            System.out.println("1. Saturday\n2. Sunday\n");
            dayChoice = sc.nextInt();
            classKey=Schedule.ScheduleDay(dayChoice);
            CheckSeats();
        } else if (classChoice == 2) {
            System.out.println("\nChoose Your Class");
            System.out.println("1. Spin\n2. Bodysculpt \n3. Zumba\n4. Yoga\n");
            fitChoice = sc.nextInt();
            classKey=Schedule.ScheduleClass(fitChoice);
            CheckSeats();
        } else
            System.out.println("Wrong Choice");
    }

    static void CheckSeats(){

        int seatLeft;
        seatLeft=Index.SeatAvailable(classKey);
        if (seatLeft<=0)
            System.out.println("\nSorry, No Space Available \n");

        else
            ReserveSeat();

    }


    static void ReserveSeat(){

        String name,id;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter your details\n");
        System.out.print("Name:\t");
        name=sc.nextLine();
        System.out.print("ID:\t");
        id=sc.nextLine();
        Index.SelectReservationClass(name,id,classKey);



    }



}
