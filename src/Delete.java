import java.util.Scanner;

public class Delete {


    static void DeleteShow() {

        Scanner sc=new Scanner(System.in);
        String id;
        int[] idClassCode;
        int cancelClass,optionCancel;

        System.out.println("\nChange/Cancel a Reservation");
        System.out.println("------------------------------\n");
        System.out.println("Enter your details\n");
        System.out.print("ID:\t");
        id=sc.nextLine();
        idClassCode=Index.SearchId(id);
        if(idClassCode[0]==0)
            System.out.println("\nNo Reservation Found\n");
        else{
            Index.SelectReservedOption(idClassCode);
            System.out.print("\nSelect the Reservation to be Canceled\t");
            optionCancel=sc.nextInt();
            cancelClass=idClassCode[optionCancel-1];
            Index.SelectDeleteClass(cancelClass,id);

            System.out.println("Do you want to Reserve Another Class?");
            System.out.println("1.Yes\n2.No\n");
            if(sc.nextInt()==1){
                Reservation.ReservationView();
            }

        }

    }



}