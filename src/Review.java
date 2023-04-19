import java.util.Scanner;

public class Review {

    static void MonthlyReviewView(){

        int month;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nMonthly Lesson Review");
        System.out.println("------------------------------\n");
        System.out.print("Review of Month :\t");
        month=sc.nextInt();
        Index.MonthlyReportSelect(month);

    }

    static void ChampionReviewView(){

        int month;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nMonthly Champion Fitness Type Review");
        System.out.println("------------------------------------------\n");
        System.out.print("Review of Month :\t");
        month=sc.nextInt();
        System.out.println("\nClass\t\t\t\tIncome");
        System.out.println("--------------------------------");
        Index.ChampionReviewSelect(month);



    }


}
