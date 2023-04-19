import java.util.Scanner;

public class Schedule {

    static int selectOption;
    static Scanner sc=new Scanner(System.in);
    static int TimetableDay(int dayChoice){

        switch (dayChoice){

            case 1:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1\t\t\tWeek 1\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("2\t\t\tWeek 1\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("3\t\t\tWeek 2\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("4\t\t\tWeek 2\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("5\t\t\tWeek 3\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("6\t\t\tWeek 3\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("7\t\t\tWeek 4\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("8\t\t\tWeek 4\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("9\t\t\tWeek 5\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("10\t\t\tWeek 5\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("11\t\t\tWeek 6\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("12\t\t\tWeek 6\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("13\t\t\tWeek 7\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("14\t\t\tWeek 7\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("15\t\t\tWeek 8\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("16\t\t\tWeek 8\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 101;
                else if(selectOption==2)
                    return 102;
                else if(selectOption==3)
                    return 201;
                else if(selectOption==4)
                    return 202;
                else if(selectOption==5)
                    return 301;
                else if(selectOption==6)
                    return 302;
                else if(selectOption==7)
                    return 401;
                else if(selectOption==8)
                    return 402;
                else if(selectOption==9)
                    return 501;
                else if(selectOption==10)
                    return 502;
                else if(selectOption==11)
                    return 601;
                else if(selectOption==12)
                    return 602;
                else if(selectOption==13)
                    return 701;
                else if(selectOption==14)
                    return 702;
                else if(selectOption==15)
                    return 801;
                else if(selectOption==16)
                    return 802;

                break;

            case 2:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1\t\t\tWeek 1\t\tSunday\t\t\tZumba\t\t\t10:00\t\t4");
                System.out.println("2\t\t\tWeek 1\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("3\t\t\tWeek 2\t\tSunday\t\t\tZumba\t\t\t10:00\t\t4");
                System.out.println("4\t\t\tWeek 2\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("5\t\t\tWeek 3\t\tSunday\t\t\tZumba\t\t\t10:00\t\t4");
                System.out.println("6\t\t\tWeek 3\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("7\t\t\tWeek 4\t\tSunday\t\t\tZumba\t\t\t10:00\t\t4");
                System.out.println("8\t\t\tWeek 4\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("9\t\t\tWeek 5\t\tSunday\t\t\tZumba\t\t\t10:00\t\t4");
                System.out.println("10\t\t\tWeek 5\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("11\t\t\tWeek 6\t\tSunday\t\t\tZumba\t\t\t10:00\t\t4");
                System.out.println("12\t\t\tWeek 6\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("13\t\t\tWeek 7\t\tSunday\t\t\tZumba\t\t\t10:00\t\t4");
                System.out.println("14\t\t\tWeek 7\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("15\t\t\tWeek 8\t\tSunday\t\t\tZumba\t\t\t10:00\t\t4");
                System.out.println("16\t\t\tWeek 8\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 103;
                else if(selectOption==2)
                    return 104;
                else if(selectOption==3)
                    return 203;
                else if(selectOption==4)
                    return 204;
                else if(selectOption==5)
                    return 303;
                else if(selectOption==6)
                    return 304;
                else if(selectOption==7)
                    return 403;
                else if(selectOption==8)
                    return 404;
                else if(selectOption==9)
                    return 503;
                else if(selectOption==10)
                    return 504;
                else if(selectOption==11)
                    return 603;
                else if(selectOption==12)
                    return 604;
                else if(selectOption==13)
                    return 703;
                else if(selectOption==14)
                    return 704;
                else if(selectOption==15)
                    return 803;
                else if(selectOption==16)
                    return 804;

                break;

            default:
                System.out.println("Wrong Choice");
                break;
        }


        return 0;
    }


    static int TimetableClass(int fitChoice) {

        switch (fitChoice){

            case 1:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1\t\t\tWeek 1\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("2\t\t\tWeek 2\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("3\t\t\tWeek 3\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("4\t\t\tWeek 4\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("5\t\t\tWeek 5\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("6\t\t\tWeek 6\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("7\t\t\tWeek 7\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println("8\t\t\tWeek 8\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 101;
                else if(selectOption==2)
                    return 201;
                else if(selectOption==3)
                    return 301;
                else if(selectOption==4)
                    return 401;
                else if(selectOption==5)
                    return 501;
                else if(selectOption==6)
                    return 601;
                else if(selectOption==7)
                    return 701;
                else if(selectOption==8)
                    return 801;

                break;

            case 2:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1\t\t\tWeek 1\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("2\t\t\tWeek 2\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("3\t\t\tWeek 3\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("4\t\t\tWeek 4\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("5\t\t\tWeek 5\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("6\t\t\tWeek 6\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("7\t\t\tWeek 7\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println("8\t\t\tWeek 8\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 102;
                else if(selectOption==2)
                    return 202;
                else if(selectOption==3)
                    return 302;
                else if(selectOption==4)
                    return 402;
                else if(selectOption==5)
                    return 502;
                else if(selectOption==6)
                    return 602;
                else if(selectOption==7)
                    return 702;
                else if(selectOption==8)
                    return 802;

                break;

            case 3:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1\t\t\tWeek 1\t\tSunday\t\t\tZumba\t\t10:00\t\t4");
                System.out.println("2\t\t\tWeek 2\t\tSunday\t\t\tZumba\t\t10:00\t\t4");
                System.out.println("3\t\t\tWeek 3\t\tSunday\t\t\tZumba\t\t10:00\t\t4");
                System.out.println("4\t\t\tWeek 4\t\tSunday\t\t\tZumba\t\t10:00\t\t4");
                System.out.println("5\t\t\tWeek 5\t\tSunday\t\t\tZumba\t\t10:00\t\t4");
                System.out.println("6\t\t\tWeek 6\t\tSunday\t\t\tZumba\t\t10:00\t\t4");
                System.out.println("7\t\t\tWeek 7\t\tSunday\t\t\tZumba\t\t10:00\t\t4");
                System.out.println("8\t\t\tWeek 8\t\tSunday\t\t\tZumba\t\t10:00\t\t4");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 103;
                else if(selectOption==2)
                    return 203;
                else if(selectOption==3)
                    return 303;
                else if(selectOption==4)
                    return 403;
                else if(selectOption==5)
                    return 503;
                else if(selectOption==6)
                    return 603;
                else if(selectOption==7)
                    return 703;
                else if(selectOption==8)
                    return 803;

                break;

            case 4:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("1\t\t\tWeek 1\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("2\t\t\tWeek 2\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("3\t\t\tWeek 3\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("4\t\t\tWeek 4\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("5\t\t\tWeek 5\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("6\t\t\tWeek 6\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("7\t\t\tWeek 7\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println("8\t\t\tWeek 8\t\tSunday\t\t\tYoga\t\t13:00\t\t5");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 104;
                else if(selectOption==2)
                    return 204;
                else if(selectOption==3)
                    return 304;
                else if(selectOption==4)
                    return 404;
                else if(selectOption==5)
                    return 504;
                else if(selectOption==6)
                    return 604;
                else if(selectOption==7)
                    return 704;
                else if(selectOption==8)
                    return 804;

                break;


            default:
                System.out.println("Wrong Choice");
                break;
        }




        return 0;
    }
}
