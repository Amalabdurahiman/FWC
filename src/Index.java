import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;

public class Index {

    static int sr101 = 0, sr102 = 5, sr103 = 2, sr104 = 0, sr201 = 1, sr202 = 3, sr203 = 3, sr204 = 1, sr301 = 5, sr302 = 4, sr303 = 4, sr304 = 0, sr401 = 0, sr402 = 3, sr403 = 0, sr404 = 2, sr501 = 4, sr502 = 3, sr503 = 1, sr504 = 5, sr601 = 4, sr602 = 2, sr603 = 2, sr604 = 3, sr701 = 2, sr702 = 5, sr703 = 4, sr704 = 2, sr801 = 1, sr802 = 0, sr803 = 0, sr804 = 5;

    static String[][] i101 = {
            {"1661", "William", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1772", "Jessica", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1013", "Craig", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1004", "Erin", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1202", "Kevin", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
    };

    static String[][] i102 = {
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
    };
    static String[][] i103 = {
            {"1286", "Kylee", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1439", "Vincent", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1145", "Danna", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
    };

    static String[][] i104 = {
            {"1049", "Walker", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1728", "Hana", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1661", "William", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1772", "Jessica", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1013", "Craig", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
    };

    static String[][] i201 = {
            {"1004", "Erin", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1202", "Kevin", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1286", "Kylee", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1439", "Vincent", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
    };

    static String[][] i202 = {
            {"1145", "Danna", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"1049", "Walker", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
    };

    static String[][] i203 = {
            {"1728", "Hana", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1661", "William", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
    };

    static String[][] i204 = {
            {"1772", "Jessica", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1013", "Craig", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1004", "Erin", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1202", "Kevin", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
    };

    static String[][] i301 = {
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
    };

    static String[][] i302 = {
            {"1286", "Kylee", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
    };

    static String[][] i303 = {
            {"1439", "Vincent", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
    };

    static String[][] i304 = {
            {"1145", "Danna", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1049", "Walker", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1728", "Hana", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1661", "William", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1772", "Jessica", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
    };

    static String[][] i401 = {
            {"1013", "Craig", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1004", "Erin", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1202", "Kevin", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1286", "Kylee", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1439", "Vincent", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
    };

    static String[][] i402 = {
            {"1145", "Danna", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"1049", "Walker", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
    };

    static String[][] i403 = {
            {"1728", "Hana", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1661", "William", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1772", "Jessica", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1013", "Craig", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1004", "Erin", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
    };

    static String[][] i404 = {
            {"1202", "Kevin", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1286", "Kylee", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1439", "Vincent", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
    };

    static String[][] i501 = {
            {"1145", "Danna", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
    };

    static String[][] i502 = {
            {"1049", "Walker", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"1728", "Hana", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
    };

    static String[][] i503 = {
            {"1661", "William", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1772", "Jessica", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1013", "Craig", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1004", "Erin", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
    };

    static String[][] i504 = {
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
    };

    static String[][] i601 = {
            {"1202", "Kevin", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
    };

    static String[][] i602 = {
            {"1286", "Kylee", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"1439", "Vincent", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"1145", "Danna", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
    };

    static String[][] i603 = {
            {"1049", "Walker", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1728", "Hana", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1661", "William", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
    };

    static String[][] i604 = {
            {"1772", "Jessica", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1013", "Craig", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
    };

    static String[][] i701 = {
            {"1004", "Erin", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1202", "Kevin", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1286", "Kylee", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
    };

    static String[][] i702 = {
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
            {"0", "None", "Bodysculpt", "Saturday", "13:00", "Available", "3","None","0"},
    };

    static String[][] i703 = {
            {"1439", "Vincent", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "10:00", "Available", "4","None","0"},
    };

    static String[][] i704 = {
            {"1145", "Danna", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1049", "Walker", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"1728", "Hana", "Yoga", "Sunday", "13:00", "Reserved", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
    };

    static String[][] i801 = {
            {"1661", "William", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1772", "Jessica", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1013", "Craig", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"1004", "Erin", "Spin", "Saturday", "10:00", "Reserved", "2","None","0"},
            {"0", "None", "Spin", "Saturday", "10:00", "Available", "2","None","0"},
    };

    static String[][] i802 = {
            {"1202", "Kevin", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"1286", "Kylee", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"1439", "Vincent", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"1145", "Danna", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
            {"1049", "Walker", "Bodysculpt", "Saturday", "13:00", "Reserved", "3","None","0"},
    };

    static String[][] i803 = {
            {"1728", "Hana", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1661", "William", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1772", "Jessica", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1013", "Craig", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
            {"1004", "Erin", "Zumba", "Sunday", "10:00", "Reserved", "4","None","0"},
    };

    static String[][] i804 = {
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
            {"0", "None", "Yoga", "Sunday", "13:00", "Available", "5","None","0"},
    };


    static int SeatAvailable(int classCode) {

        if (classCode == 101)
            return sr101;
        else if (classCode == 102)
            return sr102;
        else if (classCode == 103)
            return sr103;
        else if (classCode == 104)
            return sr104;
        else if (classCode == 201)
            return sr201;
        else if (classCode == 202)
            return sr202;
        else if (classCode == 203)
            return sr203;
        else if (classCode == 204)
            return sr204;
        else if (classCode == 301)
            return sr301;
        else if (classCode == 302)
            return sr302;
        else if (classCode == 303)
            return sr303;
        else if (classCode == 304)
            return sr304;
        else if (classCode == 401)
            return sr401;
        else if (classCode == 402)
            return sr402;
        else if (classCode == 403)
            return sr403;
        else if (classCode == 404)
            return sr404;
        else if (classCode == 501)
            return sr501;
        else if (classCode == 502)
            return sr502;
        else if (classCode == 503)
            return sr503;
        else if (classCode == 504)
            return sr504;
        else if (classCode == 601)
            return sr601;
        else if (classCode == 602)
            return sr602;
        else if (classCode == 603)
            return sr603;
        else if (classCode == 604)
            return sr604;
        else if (classCode == 701)
            return sr701;
        else if (classCode == 702)
            return sr702;
        else if (classCode == 703)
            return sr703;
        else if (classCode == 704)
            return sr704;
        else if (classCode == 801)
            return sr801;
        else if (classCode == 802)
            return sr802;
        else if (classCode == 803)
            return sr803;
        else if (classCode == 804)
            return sr804;

        return 0;
    }

    static void SelectBookingClass(String name, String id, int classCode) {

        if (classCode == 101)
            AddBooking(name, id, i101, 101);
        else if (classCode == 102)
            AddBooking(name, id, i102,102);
        else if (classCode == 103)
            AddBooking(name, id, i103,103);
        else if (classCode == 104)
            AddBooking(name, id, i104,104);
        else if (classCode == 201)
            AddBooking(name, id, i201,201);
        else if (classCode == 202)
            AddBooking(name, id, i202,202);
        else if (classCode == 203)
            AddBooking(name, id, i203,203);
        else if (classCode == 204)
            AddBooking(name, id, i204,204);
        else if (classCode == 301)
            AddBooking(name, id, i301,301);
        else if (classCode == 302)
            AddBooking(name, id, i302,302);
        else if (classCode == 303)
            AddBooking(name, id, i303,303);
        else if (classCode == 304)
            AddBooking(name, id, i304,304);
        else if (classCode == 401)
            AddBooking(name, id, i401,401);
        else if (classCode == 402)
            AddBooking(name, id, i402,402);
        else if (classCode == 403)
            AddBooking(name, id, i403,403);
        else if (classCode == 404)
            AddBooking(name, id, i404,404);
        else if (classCode == 501)
            AddBooking(name, id, i501,501);
        else if (classCode == 502)
            AddBooking(name, id, i502,502);
        else if (classCode == 503)
            AddBooking(name, id, i503,503);
        else if (classCode == 504)
            AddBooking(name, id, i504,504);
        else if (classCode == 601)
            AddBooking(name, id, i601,601);
        else if (classCode == 602)
            AddBooking(name, id, i602,602);
        else if (classCode == 603)
            AddBooking(name, id, i603,603);
        else if (classCode == 604)
            AddBooking(name, id, i604,604);
        else if (classCode == 701)
            AddBooking(name, id, i701,701);
        else if (classCode == 702)
            AddBooking(name, id, i702,702);
        else if (classCode == 703)
            AddBooking(name, id, i703,703);
        else if (classCode == 704)
            AddBooking(name, id, i704,704);
        else if (classCode == 801)
            AddBooking(name, id, i801,801);
        else if (classCode == 802)
            AddBooking(name, id, i802,802);
        else if (classCode == 803)
            AddBooking(name, id, i803,803);
        else if (classCode == 804)
            AddBooking(name, id, i804,804);

    }

    static void AddBooking(String name, String id, String[][] db, int classCode) {
        int already = 0;
        for (int i = 0; i < 5; i++) {
            if (Objects.equals(db[i][0], id)) {
                System.out.println("\nBooking Already Exist!! :| \n");
                already = 1;
                break;

            }
        }
        if (already == 0) {
            for (int i = 0; i < 5; i++) {
                if (db[i][5] == "Available") {

                    db[i][0] = id;
                    db[i][1] = name;
                    db[i][5] = "Reserved";
                    removeSeat(classCode);

                    //Print the table

                    PrintTable(db);//
                    //
                    System.out.println("\nBooking Confirmed :)\n");
                    break;
                } else continue;


            }


        }


    }


    static void removeSeat(int classCode){

        if(classCode==101)
            sr101--;
        else if(classCode==102)
            sr102--;
        else if(classCode==103)
            sr103--;
        else if(classCode==104)
            sr104--;
        else if(classCode==201)
            sr201--;
        else if(classCode==202)
            sr202--;
        else if(classCode==203)
            sr203--;
        else if(classCode==204)
            sr204--;
        else if(classCode==301)
            sr301--;
        else if(classCode==302)
            sr302--;
        else if(classCode==303)
            sr303--;
        else if(classCode==304)
            sr304--;
        else if(classCode==401)
            sr401--;
        else if(classCode==402)
            sr402--;
        else if(classCode==403)
            sr403--;
        else if(classCode==404)
            sr404--;
        else if(classCode==501)
            sr501--;
        else if(classCode==502)
            sr502--;
        else if(classCode==503)
            sr503--;
        else if(classCode==504)
            sr504--;
        else if(classCode==601)
            sr601--;
        else if(classCode==602)
            sr602--;
        else if(classCode==603)
            sr603--;
        else if(classCode==604)
            sr604--;
        else if(classCode==701)
            sr701--;
        else if(classCode==702)
            sr702--;
        else if(classCode==703)
            sr703--;
        else if(classCode==704)
            sr704--;
        else if(classCode==801)
            sr801--;
        else if(classCode==802)
            sr802--;
        else if(classCode==803)
            sr803--;
        else if(classCode==804)
            sr804--;
    }




    static int[] SearchId(String id) {

        int[] idClassCode = new int[302];
        int found = 0, i;

        //i101
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i101[i][0])&&(!Objects.equals(i101[i][5], "Present"))) {
                idClassCode[found] = 101;
                found++;
                break;
            }
        }
        //i102
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i102[i][0])&&(!Objects.equals(i102[i][5], "Present"))) {
                idClassCode[found] = 102;
                found++;
                break;
            }
        }
        //i103
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i103[i][0])&&(!Objects.equals(i103[i][5], "Present"))) {
                idClassCode[found] = 103;
                found++;
                break;
            }
        }
        //i104
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i104[i][0])&&(!Objects.equals(i104[i][5], "Present"))) {
                idClassCode[found] = 104;
                found++;
                break;
            }
        }
        //i201
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i201[i][0])&&(!Objects.equals(i201[i][5], "Present"))) {
                idClassCode[found] = 201;
                found++;
                break;
            }
        }
        //i202
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i202[i][0])&&(!Objects.equals(i202[i][5], "Present"))) {
                idClassCode[found] = 202;
                found++;
                break;
            }
        }
        //i203
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i203[i][0])&&(!Objects.equals(i203[i][5], "Present"))) {
                idClassCode[found] = 203;
                found++;
                break;
            }
        }
        //i204
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i204[i][0])&&(!Objects.equals(i204[i][5], "Present"))) {
                idClassCode[found] = 204;
                found++;
                break;
            }
        }
        //i301
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i301[i][0])&&(!Objects.equals(i301[i][5], "Present"))) {
                idClassCode[found] = 301;
                found++;
                break;
            }
        }
        //i302
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i302[i][0])&&(!Objects.equals(i302[i][5], "Present"))) {
                idClassCode[found] = 302;
                found++;
                break;
            }
        }
        //i303
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i303[i][0])&&(!Objects.equals(i303[i][5], "Present"))) {
                idClassCode[found] = 303;
                found++;
                break;
            }
        }
        //i304
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i304[i][0])&&(!Objects.equals(i304[i][5], "Present"))) {
                idClassCode[found] = 304;
                found++;
                break;
            }
        }
        //i401
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i401[i][0])&&(!Objects.equals(i401[i][5], "Present"))) {
                idClassCode[found] = 401;
                found++;
                break;
            }
        }
        //i402
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i402[i][0])&&(!Objects.equals(i402[i][5], "Present"))) {
                idClassCode[found] = 402;
                found++;
                break;
            }
        }
        //i403
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i403[i][0])&&(!Objects.equals(i403[i][5], "Present"))) {
                idClassCode[found] = 403;
                found++;
                break;
            }
        }
        //i404
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i404[i][0])&&(!Objects.equals(i404[i][5], "Present"))) {
                idClassCode[found] = 404;
                found++;
                break;
            }
        }
        //i501
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i501[i][0])&&(!Objects.equals(i501[i][5], "Present"))) {
                idClassCode[found] = 501;
                found++;
                break;
            }
        }
        //i502
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i502[i][0])&&(!Objects.equals(i502[i][5], "Present"))) {
                idClassCode[found] = 502;
                found++;
                break;
            }
        }
        //i503
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i503[i][0])&&(!Objects.equals(i503[i][5], "Present"))) {
                idClassCode[found] = 503;
                found++;
                break;
            }
        }
        //i504
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i504[i][0])&&(!Objects.equals(i504[i][5], "Present"))) {
                idClassCode[found] = 504;
                found++;
                break;
            }
        }
        //i601
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i601[i][0])&&(!Objects.equals(i601[i][5], "Present"))) {
                idClassCode[found] = 601;
                found++;
                break;
            }
        }
        //i602
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i602[i][0])&&(!Objects.equals(i602[i][5], "Present"))) {
                idClassCode[found] = 602;
                found++;
                break;
            }
        }
        //i603
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i603[i][0])&&(!Objects.equals(i603[i][5], "Present"))) {
                idClassCode[found] = 603;
                found++;
                break;
            }
        }
        //i604
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i604[i][0])&&(!Objects.equals(i604[i][5], "Present"))) {
                idClassCode[found] = 604;
                found++;
                break;
            }
        }
        //i701
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i701[i][0])&&(!Objects.equals(i701[i][5], "Present"))) {
                idClassCode[found] = 701;
                found++;
                break;
            }
        }
        //i702
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i702[i][0])&&(!Objects.equals(i702[i][5], "Present"))) {
                idClassCode[found] = 702;
                found++;
                break;
            }
        }
        //i703
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i703[i][0])&&(!Objects.equals(i703[i][5], "Present"))) {
                idClassCode[found] = 703;
                found++;
                break;
            }
        }
        //i704
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i704[i][0])&&(!Objects.equals(i704[i][5], "Present"))) {
                idClassCode[found] = 704;
                found++;
                break;
            }
        }
        //i801
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i801[i][0])&&(!Objects.equals(i801[i][5], "Present"))) {
                idClassCode[found] = 801;
                found++;
                break;
            }
        }
        //i802
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i802[i][0])&&(!Objects.equals(i802[i][5], "Present"))) {
                idClassCode[found] = 802;
                found++;
                break;
            }
        }
        //i803
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i803[i][0])&&(!Objects.equals(i803[i][5], "Present"))) {
                idClassCode[found] = 803;
                found++;
                break;
            }
        }
        //i804
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i804[i][0])&&(!Objects.equals(i804[i][5], "Present"))) {
                idClassCode[found] = 804;
                found++;
                break;
            }
        }

        return idClassCode;
    }


    static void SelectBookedOption(int[] idClassCode) {

        int i = 0;

        System.out.println("\nYour Bookings\n");
        System.out.println("Option\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
        System.out.println("---------------------------------------------------------------------------");

        while (idClassCode[i] != 0) {
            if (idClassCode[i] == 101) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 102) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 103) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSunday\t\tZumba\t\t10:00\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 104) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSunday\t\tYoga\t\t13:00\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 201) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 202) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 203) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSunday\t\tZumba\t\t10:00\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 204) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSunday\t\tYoga\t\t13:00\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 301) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 302) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 303) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSunday\t\tZumba\t\t10:00\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 304) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSunday\t\tYoga\t\t13:00\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 401) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 402) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 403) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSunday\t\tZumba\t\t10:00\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 404) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSunday\t\tYoga\t\t13:00\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 501) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 502) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 503) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSunday\t\tZumba\t\t10:00\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 504) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSunday\t\tYoga\t\t13:00\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 601) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 602) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 603) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSunday\t\tZumba\t\t10:00\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 604) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSunday\t\tYoga\t\t13:00\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 701) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 702) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 703) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSunday\t\tZumba\t\t10:00\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 704) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSunday\t\tYoga\t\t13:00\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 801) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSaturday\t\tSpin\t\t10:00\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 802) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSaturday\t\tBodysculpt\t\t13:00\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 803) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSunday\t\tZumba\t\t10:00\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 804) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSunday\t\tYoga\t\t13:00\t\t5");
                i++;
                continue;
            }

            i++;
        }


    }

    static void SelectCancelClass(int cancelClass, String id) {

        if (cancelClass == 101)
            CancelClass(i101, id,101);
        else if (cancelClass == 102)
            CancelClass(i102, id,102);
        else if (cancelClass == 103)
            CancelClass(i103, id,103);
        else if (cancelClass == 104)
            CancelClass(i104, id,104);
        else if (cancelClass == 201)
            CancelClass(i201, id,201);
        else if (cancelClass == 202)
            CancelClass(i202, id,202);
        else if (cancelClass == 203)
            CancelClass(i203, id,203);
        else if (cancelClass == 204)
            CancelClass(i204, id,204);
        else if (cancelClass == 301)
            CancelClass(i301, id,301);
        else if (cancelClass == 302)
            CancelClass(i302, id,302);
        else if (cancelClass == 303)
            CancelClass(i303, id,303);
        else if (cancelClass == 304)
            CancelClass(i304, id,304);
        else if (cancelClass == 401)
            CancelClass(i401, id,401);
        else if (cancelClass == 402)
            CancelClass(i402, id,402);
        else if (cancelClass == 403)
            CancelClass(i403, id,403);
        else if (cancelClass == 404)
            CancelClass(i404, id,404);
        else if (cancelClass == 501)
            CancelClass(i501, id,501);
        else if (cancelClass == 502)
            CancelClass(i502, id,502);
        else if (cancelClass == 503)
            CancelClass(i503, id,503);
        else if (cancelClass == 504)
            CancelClass(i504, id,504);
        else if (cancelClass == 601)
            CancelClass(i601, id,601);
        else if (cancelClass == 602)
            CancelClass(i602, id,602);
        else if (cancelClass == 603)
            CancelClass(i603, id,603);
        else if (cancelClass == 604)
            CancelClass(i604, id,604);
        else if (cancelClass == 701)
            CancelClass(i701, id,701);
        else if (cancelClass == 702)
            CancelClass(i702, id,702);
        else if (cancelClass == 703)
            CancelClass(i703, id,703);
        else if (cancelClass == 704)
            CancelClass(i704, id,704);
        else if (cancelClass == 801)
            CancelClass(i801, id,801);
        else if (cancelClass == 802)
            CancelClass(i802, id,802);
        else if (cancelClass == 803)
            CancelClass(i803, id,803);
        else if (cancelClass == 804)
            CancelClass(i804, id,804);
        else
            System.out.println("\nInvalid Choice :(\n");

    }

    static void CancelClass(String[][] db, String id,int classCode) {

        for (int i=0;i<5;i++) {
            //System.out.println("HEYYYY\t"+id+"\t"+db[i][0]);//
            if (Objects.equals(db[i][0], id)) {

                db[i][0] = "0";
                db[i][1] = "None";
                db[i][5] = "Available";
                addSeat(classCode);
                PrintTable(db); //
                System.out.println("\nBooking Canceled :)\n");
                break;


            }

        }
    }


    static void addSeat(int classCode){


        if(classCode==101)
            sr101++;
        else if(classCode==102)
            sr102++;
        else if(classCode==103)
            sr103++;
        else if(classCode==104)
            sr104++;
        else if(classCode==201)
            sr201++;
        else if(classCode==202)
            sr202++;
        else if(classCode==203)
            sr203++;
        else if(classCode==204)
            sr204++;
        else if(classCode==301)
            sr301++;
        else if(classCode==302)
            sr302++;
        else if(classCode==303)
            sr303++;
        else if(classCode==304)
            sr304++;
        else if(classCode==401)
            sr401++;
        else if(classCode==402)
            sr402++;
        else if(classCode==403)
            sr403++;
        else if(classCode==404)
            sr404++;
        else if(classCode==501)
            sr501++;
        else if(classCode==502)
            sr502++;
        else if(classCode==503)
            sr503++;
        else if(classCode==504)
            sr504++;
        else if(classCode==601)
            sr601++;
        else if(classCode==602)
            sr602++;
        else if(classCode==603)
            sr603++;
        else if(classCode==604)
            sr604++;
        else if(classCode==701)
            sr701++;
        else if(classCode==702)
            sr702++;
        else if(classCode==703)
            sr703++;
        else if(classCode==704)
            sr704++;
        else if(classCode==801)
            sr801++;
        else if(classCode==802)
            sr802++;
        else if(classCode==803)
            sr803++;
        else if(classCode==804)
            sr804++;
    }


    static void SelectAttendClass(int attendClass, String id) {

        if (attendClass == 101)
            AttendClass(i101, id);
        else if (attendClass == 102)
            AttendClass(i102, id);
        else if (attendClass == 103)
            AttendClass(i103, id);
        else if (attendClass == 104)
            AttendClass(i104, id);
        else if (attendClass == 201)
            AttendClass(i201, id);
        else if (attendClass == 202)
            AttendClass(i202, id);
        else if (attendClass == 203)
            AttendClass(i203, id);
        else if (attendClass == 204)
            AttendClass(i204, id);
        else if (attendClass == 301)
            AttendClass(i301, id);
        else if (attendClass == 302)
            AttendClass(i302, id);
        else if (attendClass == 303)
            AttendClass(i303, id);
        else if (attendClass == 304)
            AttendClass(i304, id);
        else if (attendClass == 401)
            AttendClass(i401, id);
        else if (attendClass == 402)
            AttendClass(i402, id);
        else if (attendClass == 403)
            AttendClass(i403, id);
        else if (attendClass == 404)
            AttendClass(i404, id);
        else if (attendClass == 501)
            AttendClass(i501, id);
        else if (attendClass == 502)
            AttendClass(i502, id);
        else if (attendClass == 503)
            AttendClass(i503, id);
        else if (attendClass == 504)
            AttendClass(i504, id);
        else if (attendClass == 601)
            AttendClass(i601, id);
        else if (attendClass == 602)
            AttendClass(i602, id);
        else if (attendClass == 603)
            AttendClass(i603, id);
        else if (attendClass == 604)
            AttendClass(i604, id);
        else if (attendClass == 701)
            AttendClass(i701, id);
        else if (attendClass == 702)
            AttendClass(i702, id);
        else if (attendClass == 703)
            AttendClass(i703, id);
        else if (attendClass == 704)
            AttendClass(i704, id);
        else if (attendClass == 801)
            AttendClass(i801, id);
        else if (attendClass == 802)
            AttendClass(i802, id);
        else if (attendClass == 803)
            AttendClass(i803, id);
        else if (attendClass == 804)
            AttendClass(i804, id);
        else
            System.out.println("\nInvalid Choice :(\n");

    }

    static void AttendClass(String[][] db, String id) {

        for (int i=0;i<5;i++) {
            if (Objects.equals(db[i][0], id)) {
                db[i][5] = "Present";
                AttendedFeedback(db,i);
                PrintTable(db); //
                System.out.println("\nThank you for Attending the  Class :)\n");
                break;
            }

        }
    }

    static void AttendedFeedback(String[][] db,int i){

        String feedback;
        int rating;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nPlease Provide a Feedback of the Class:\n");
        feedback=sc.nextLine();
        db[i][7]=feedback;
        System.out.println("\nRate Our Class:\n(1: Very dissatisfied, 2: Dissatisfied, 3: Ok, 4: Satisfied, 5: Very Satisfied)\n");
        rating=sc.nextInt();
        while(rating<1||rating>5){
            System.out.print("\nEnter a Value Between 1 and 5 :\t");
            rating=sc.nextInt();
        }
        db[i][8]=Integer.toString(rating);

    }


    static void MonthlyReportSelect(int month){

        switch (month){

            case 1:
                for (String[][] items: new String[][][]{i101, i102, i103, i104, i201, i202, i203, i204}){
                    System.out.print("Week 1\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{i201, i202, i203, i204}){
                    System.out.print("Week 2\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{i301, i302, i303, i304}){
                    System.out.print("Week 3\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{i401, i402, i403, i404}){
                    System.out.print("Week 4\t\t");
                    MonthlyReport(items);
                }
                break;
            case 2:
                for (String[][] items: new String[][][]{i501, i502, i503, i504}){
                    System.out.print("Week 5\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{i601, i602, i603, i604}){
                    System.out.print("Week 6\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{i701, i702, i703, i704}){
                    System.out.print("Week 7\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{i801, i802, i803, i804}){
                    System.out.print("Week 8\t\t");
                    MonthlyReport(items);
                }
                break;

            default:
                System.out.println("\nMonth Doesnt Exist :(\n");
                Report.MonthlyReportView();

        }


    }

    static void MonthlyReport(String[][] db){

        int noCustomers=0;
        float avgRating=0;
        System.out.println(db[0][2]);
        for(int i=0;i<5;i++){
            if(db[i][5]=="Present"){
                noCustomers++;
                avgRating+=Float.parseFloat(db[i][8]);
            }
        }
        avgRating/=noCustomers;
        System.out.println("\nNumber of Customers Present:\t"+noCustomers+"\nAverage Rating of the Class:\t"+avgRating+"\n");

    }



//

    static void ChampionReportSelect(int month){

        int highIncome=0,spinRevenue=0,bodysculptRevenue=0,zumbaIncome=0,yogaRevenue=0;


        switch (month){

            case 1:
                for (String[][] items: new String[][][]{i101, i201, i301, i401})
                    spinRevenue+=ChampionReport(items);
                System.out.println("Spin\t\t\t\t"+spinRevenue);

                for (String[][] items: new String[][][]{i102, i202, i302, i402})
                    bodysculptRevenue+=ChampionReport(items);
                System.out.println("Bodysculpt\t\t\t\t"+bodysculptRevenue);

                for (String[][] items: new String[][][]{i103, i203, i303, i403})
                    zumbaIncome+=ChampionReport(items);
                System.out.println("Zumba\t\t\t\t"+zumbaIncome);

                for (String[][] items: new String[][][]{i104, i204, i304, i404})
                    yogaRevenue+=ChampionReport(items);
                System.out.println("Yoga\t\t\t"+yogaRevenue);
                break;
            case 2:
                for (String[][] items: new String[][][]{i501, i601, i701, i801})
                    spinRevenue+=ChampionReport(items);
                System.out.println("Spin\t\t\t\t"+spinRevenue);

                for (String[][] items: new String[][][]{i502, i602, i702, i802})
                    bodysculptRevenue+=ChampionReport(items);
                System.out.println("Bodysculpt\t\t\t\t"+bodysculptRevenue);

                for (String[][] items: new String[][][]{i503, i603, i703, i803})
                    zumbaIncome+=ChampionReport(items);
                System.out.println("Zumba\t\t\t\t"+zumbaIncome);

                for (String[][] items: new String[][][]{i504, i604, i704, i804})
                    yogaRevenue+=ChampionReport(items);
                System.out.println("Yoga\t\t\t"+yogaRevenue);
                break;

            default:
                System.out.println("\nMonth Doesnt Exist :(\n");
                Report.ChampionReportView();
        }

        //Highest Income
        for( int items : new int[]{spinRevenue, bodysculptRevenue, zumbaIncome, yogaRevenue}){
            if(items>highIncome)
                highIncome=items;
        }
        System.out.print("\nHighest Income Class:\t");
        if(highIncome==spinRevenue)
            System.out.print("Spin\t\t");
        if(highIncome==bodysculptRevenue)
            System.out.print("Bodysculpt\t\t");
        if(highIncome==zumbaIncome)
            System.out.print("Zumba\t\t");
        if(highIncome==yogaRevenue)
            System.out.print("Yoga\t\t");



    }

    static int ChampionReport(String[][] db){

        int noCustomers=0;
        for(int i=0;i<5;i++){
            if(db[i][5]=="Present"){
                noCustomers++;
            }
        }
        return (noCustomers*Integer.parseInt(db[0][6]));

    }


    static void PrintTable(String[][] db) {

        System.out.println();
        System.out.println("\nID\t\tName\t\tClass\t\t\tDay\t\t\tTime\t\tStatus\t\tPrice\t\tReview\t\tRating");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        for (String[] items : db) {
            for (String item : items)
                System.out.print(item + "\t\t");
            System.out.println();
        }
    }

}
