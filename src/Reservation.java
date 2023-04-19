import java.util.Scanner;

public class Reservation {

    static int classCode;
    static void BookView() {

        Scanner sc=new Scanner(System.in);
        int classChoice,dayChoice,fitChoice;
        System.out.println("\nBook a Group Fitness Lesson");
        System.out.println("------------------------------\n");
        System.out.println("Choose your Class by");
        System.out.println("1. Day\n2. Fitness Type\n");
        classChoice = sc.nextInt();
        if (classChoice == 1) {
            System.out.println("\nChoose Day");
            System.out.println("1. Saturday\n2. Sunday\n");
            dayChoice = sc.nextInt();
            classCode=Schedule.TimetableDay(dayChoice);
            CheckSeats();
        } else if (classChoice == 2) {
            System.out.println("\nChoose Class");
            System.out.println("1. Spin\n2. Bodysculpt\n3. Zumba\n4. Yoga\n");
            fitChoice = sc.nextInt();
            classCode=Schedule.TimetableClass(fitChoice);
            CheckSeats();
        } else
            System.out.println("Wrong Choice");
    }

    static void CheckSeats(){

        int seatLeft;
        seatLeft=Index.SeatAvailable(classCode);
        if (seatLeft<=0)
            System.out.println("\nApologies, No Seats Available \n");

        else
            BookSeat();

    }


    static void BookSeat(){

        String name,id;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter your details\n");
        System.out.print("Name:\t");
        name=sc.nextLine();
        System.out.print("ID:\t");
        id=sc.nextLine();
        Index.SelectBookingClass(name,id,classCode);



    }



}
