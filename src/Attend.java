import java.util.Scanner;

public class Attend {

     static void AttendShow() {

        Scanner sc=new Scanner(System.in);
        String id;
        int[] idClassCode;
        int attendClass,optionAttend;

        System.out.println("\nAttend a Lesson");
        System.out.println("--------------------------\n");
        System.out.println("Enter your details\n");
        System.out.print("ID:\t");
        id=sc.nextLine();
        idClassCode=Index.SearchId(id);

        if(idClassCode[0]==0)
            System.out.println("\nNo classes Scheduled :(\n");
        else{
            Index.SelectBookedOption(idClassCode);
            System.out.print("\nPlease Select the Class You Attended:\t");
            optionAttend=sc.nextInt();
            attendClass=idClassCode[optionAttend-1];
            // System.out.println(cancelClass + "\tHello");//
            Index.SelectAttendClass(attendClass,id);


        }

    }
}
