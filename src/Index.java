import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;

public class Index {

    static int sr101 = 0, sr102 = 5, sr103 = 2, sr104 = 0, sr201 = 1, sr202 = 3, sr203 = 3, sr204 = 1, sr301 = 5, sr302 = 4, sr303 = 4, sr304 = 0, sr401 = 0, sr402 = 3, sr403 = 0, sr404 = 2, sr501 = 4, sr502 = 3, sr503 = 1, sr504 = 5, sr601 = 4, sr602 = 2, sr603 = 2, sr604 = 3, sr701 = 2, sr702 = 5, sr703 = 4, sr704 = 2, sr801 = 1, sr802 = 0, sr803 = 0, sr804 = 5;

    static String[][] i101 = {
            {"1661", "William", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1772", "Jessica", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1013", "Craig", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1004", "Erin", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1202", "Kevin", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
    };

    static String[][] i102 = {
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };
    static String[][] i103 = {
            {"1286", "Kylee", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1439", "Vincent", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1145", "Danna", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] i104 = {
            {"1049", "Walker", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1728", "Hana", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1661", "William", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1772", "Jessica", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1013", "Craig", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
    };

    static String[][] i201 = {
            {"1004", "Erin", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1202", "Kevin", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1286", "Kylee", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1439", "Vincent", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] i202 = {
            {"1145", "Danna", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"1049", "Walker", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] i203 = {
            {"1728", "Hana", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1661", "William", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] i204 = {
            {"1772", "Jessica", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1013", "Craig", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1004", "Erin", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1202", "Kevin", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };

    static String[][] i301 = {
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] i302 = {
            {"1286", "Kylee", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] i303 = {
            {"1439", "Vincent", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] i304 = {
            {"1145", "Danna", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1049", "Walker", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1728", "Hana", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1661", "William", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1772", "Jessica", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
    };

    static String[][] i401 = {
            {"1013", "Craig", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1004", "Erin", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1202", "Kevin", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1286", "Kylee", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1439", "Vincent", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
    };

    static String[][] i402 = {
            {"1145", "Danna", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"1049", "Walker", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] i403 = {
            {"1728", "Hana", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1661", "William", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1772", "Jessica", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1013", "Craig", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1004", "Erin", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
    };

    static String[][] i404 = {
            {"1202", "Kevin", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1286", "Kylee", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1439", "Vincent", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };

    static String[][] i501 = {
            {"1145", "Danna", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] i502 = {
            {"1049", "Walker", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"1728", "Hana", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] i503 = {
            {"1661", "William", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1772", "Jessica", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1013", "Craig", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1004", "Erin", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] i504 = {
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };

    static String[][] i601 = {
            {"1202", "Kevin", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] i602 = {
            {"1286", "Kylee", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"1439", "Vincent", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"1145", "Danna", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] i603 = {
            {"1049", "Walker", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1728", "Hana", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1661", "William", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] i604 = {
            {"1772", "Jessica", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1013", "Craig", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };

    static String[][] i701 = {
            {"1004", "Erin", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1202", "Kevin", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1286", "Kylee", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] i702 = {
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] i703 = {
            {"1439", "Vincent", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] i704 = {
            {"1145", "Danna", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1049", "Walker", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"1728", "Hana", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };

    static String[][] i801 = {
            {"1661", "William", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1772", "Jessica", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1013", "Craig", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"1004", "Erin", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] i802 = {
            {"1202", "Kevin", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"1286", "Kylee", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"1439", "Vincent", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"1145", "Danna", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"1049", "Walker", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
    };

    static String[][] i803 = {
            {"1728", "Hana", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1661", "William", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1772", "Jessica", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1013", "Craig", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"1004", "Erin", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
    };

    static String[][] i804 = {
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };


    static int SeatAvailable(int classCode) {

        if (classCode == 101)
            return sr101;
        else if (classCode == 102)
            return s12;
        else if (classCode == 103)
            return s13;
        else if (classCode == 104)
            return s14;
        else if (classCode == 201)
            return s21;
        else if (classCode == 202)
            return s22;
        else if (classCode == 23)
            return s23;
        else if (classCode == 24)
            return s24;
        else if (classCode == 31)
            return s31;
        else if (classCode == 32)
            return s32;
        else if (classCode == 33)
            return s33;
        else if (classCode == 34)
            return s34;
        else if (classCode == 41)
            return s41;
        else if (classCode == 42)
            return s42;
        else if (classCode == 43)
            return s43;
        else if (classCode == 44)
            return s44;
        else if (classCode == 51)
            return s51;
        else if (classCode == 52)
            return s52;
        else if (classCode == 53)
            return s53;
        else if (classCode == 54)
            return s54;
        else if (classCode == 61)
            return s61;
        else if (classCode == 62)
            return s62;
        else if (classCode == 63)
            return s63;
        else if (classCode == 64)
            return s64;
        else if (classCode == 71)
            return s71;
        else if (classCode == 72)
            return s72;
        else if (classCode == 73)
            return s73;
        else if (classCode == 74)
            return s74;
        else if (classCode == 81)
            return s81;
        else if (classCode == 82)
            return s82;
        else if (classCode == 83)
            return s83;
        else if (classCode == 84)
            return s84;

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
        else if (classCode == 23)
            AddBooking(name, id, i203,23);
        else if (classCode == 24)
            AddBooking(name, id, i204,24);
        else if (classCode == 31)
            AddBooking(name, id, i301,31);
        else if (classCode == 32)
            AddBooking(name, id, i302,32);
        else if (classCode == 33)
            AddBooking(name, id, i303,33);
        else if (classCode == 34)
            AddBooking(name, id, i304,34);
        else if (classCode == 41)
            AddBooking(name, id, i401,41);
        else if (classCode == 42)
            AddBooking(name, id, i402,42);
        else if (classCode == 43)
            AddBooking(name, id, i403,43);
        else if (classCode == 44)
            AddBooking(name, id, i404,44);
        else if (classCode == 51)
            AddBooking(name, id, i501,51);
        else if (classCode == 52)
            AddBooking(name, id, i502,52);
        else if (classCode == 53)
            AddBooking(name, id, i503,53);
        else if (classCode == 54)
            AddBooking(name, id, i504,54);
        else if (classCode == 61)
            AddBooking(name, id, i601,61);
        else if (classCode == 62)
            AddBooking(name, id, i602,62);
        else if (classCode == 63)
            AddBooking(name, id, i603,63);
        else if (classCode == 64)
            AddBooking(name, id, i604,64);
        else if (classCode == 71)
            AddBooking(name, id, i701,71);
        else if (classCode == 72)
            AddBooking(name, id, i702,72);
        else if (classCode == 73)
            AddBooking(name, id, i703,73);
        else if (classCode == 74)
            AddBooking(name, id, i704,74);
        else if (classCode == 81)
            AddBooking(name, id, i801,81);
        else if (classCode == 82)
            AddBooking(name, id, i802,82);
        else if (classCode == 83)
            AddBooking(name, id, i803,83);
        else if (classCode == 84)
            AddBooking(name, id, i804,84);

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
                    db[i][5] = "Booked";
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
            s12--;
        else if(classCode==103)
            s13--;
        else if(classCode==104)
            s14--;
        else if(classCode==201)
            s21--;
        else if(classCode==202)
            s22--;
        else if(classCode==23)
            s23--;
        else if(classCode==24)
            s24--;
        else if(classCode==31)
            s31--;
        else if(classCode==32)
            s32--;
        else if(classCode==33)
            s33--;
        else if(classCode==34)
            s34--;
        else if(classCode==41)
            s41--;
        else if(classCode==42)
            s42--;
        else if(classCode==43)
            s43--;
        else if(classCode==44)
            s44--;
        else if(classCode==51)
            s51--;
        else if(classCode==52)
            s52--;
        else if(classCode==53)
            s53--;
        else if(classCode==54)
            s54--;
        else if(classCode==61)
            s61--;
        else if(classCode==62)
            s62--;
        else if(classCode==63)
            s63--;
        else if(classCode==64)
            s64--;
        else if(classCode==71)
            s71--;
        else if(classCode==72)
            s72--;
        else if(classCode==73)
            s73--;
        else if(classCode==74)
            s74--;
        else if(classCode==81)
            s81--;
        else if(classCode==82)
            s82--;
        else if(classCode==83)
            s83--;
        else if(classCode==84)
            s84--;
    }




    static int[] SearchId(String id) {

        int[] idClassCode = new int[32];
        int found = 0, i;

        //i101
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i101[i][0])&&(!Objects.equals(i101[i][5], "Attended"))) {
                idClassCode[found] = 101;
                found++;
                break;
            }
        }
        //i102
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i102[i][0])&&(!Objects.equals(i102[i][5], "Attended"))) {
                idClassCode[found] = 102;
                found++;
                break;
            }
        }
        //i103
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i103[i][0])&&(!Objects.equals(i103[i][5], "Attended"))) {
                idClassCode[found] = 103;
                found++;
                break;
            }
        }
        //i104
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i104[i][0])&&(!Objects.equals(i104[i][5], "Attended"))) {
                idClassCode[found] = 104;
                found++;
                break;
            }
        }
        //i201
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i201[i][0])&&(!Objects.equals(i201[i][5], "Attended"))) {
                idClassCode[found] = 201;
                found++;
                break;
            }
        }
        //i202
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i202[i][0])&&(!Objects.equals(i202[i][5], "Attended"))) {
                idClassCode[found] = 202;
                found++;
                break;
            }
        }
        //i203
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i203[i][0])&&(!Objects.equals(i203[i][5], "Attended"))) {
                idClassCode[found] = 23;
                found++;
                break;
            }
        }
        //i204
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i204[i][0])&&(!Objects.equals(i204[i][5], "Attended"))) {
                idClassCode[found] = 24;
                found++;
                break;
            }
        }
        //i301
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i301[i][0])&&(!Objects.equals(i301[i][5], "Attended"))) {
                idClassCode[found] = 31;
                found++;
                break;
            }
        }
        //i302
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i302[i][0])&&(!Objects.equals(i302[i][5], "Attended"))) {
                idClassCode[found] = 32;
                found++;
                break;
            }
        }
        //i303
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i303[i][0])&&(!Objects.equals(i303[i][5], "Attended"))) {
                idClassCode[found] = 33;
                found++;
                break;
            }
        }
        //i304
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i304[i][0])&&(!Objects.equals(i304[i][5], "Attended"))) {
                idClassCode[found] = 34;
                found++;
                break;
            }
        }
        //i401
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i401[i][0])&&(!Objects.equals(i401[i][5], "Attended"))) {
                idClassCode[found] = 41;
                found++;
                break;
            }
        }
        //i402
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i402[i][0])&&(!Objects.equals(i402[i][5], "Attended"))) {
                idClassCode[found] = 42;
                found++;
                break;
            }
        }
        //i403
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i403[i][0])&&(!Objects.equals(i403[i][5], "Attended"))) {
                idClassCode[found] = 43;
                found++;
                break;
            }
        }
        //i404
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i404[i][0])&&(!Objects.equals(i404[i][5], "Attended"))) {
                idClassCode[found] = 44;
                found++;
                break;
            }
        }
        //i501
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i501[i][0])&&(!Objects.equals(i501[i][5], "Attended"))) {
                idClassCode[found] = 51;
                found++;
                break;
            }
        }
        //i502
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i502[i][0])&&(!Objects.equals(i502[i][5], "Attended"))) {
                idClassCode[found] = 52;
                found++;
                break;
            }
        }
        //i503
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i503[i][0])&&(!Objects.equals(i503[i][5], "Attended"))) {
                idClassCode[found] = 53;
                found++;
                break;
            }
        }
        //i504
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i504[i][0])&&(!Objects.equals(i504[i][5], "Attended"))) {
                idClassCode[found] = 54;
                found++;
                break;
            }
        }
        //i601
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i601[i][0])&&(!Objects.equals(i601[i][5], "Attended"))) {
                idClassCode[found] = 61;
                found++;
                break;
            }
        }
        //i602
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i602[i][0])&&(!Objects.equals(i602[i][5], "Attended"))) {
                idClassCode[found] = 62;
                found++;
                break;
            }
        }
        //i603
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i603[i][0])&&(!Objects.equals(i603[i][5], "Attended"))) {
                idClassCode[found] = 63;
                found++;
                break;
            }
        }
        //i604
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i604[i][0])&&(!Objects.equals(i604[i][5], "Attended"))) {
                idClassCode[found] = 64;
                found++;
                break;
            }
        }
        //i701
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i701[i][0])&&(!Objects.equals(i701[i][5], "Attended"))) {
                idClassCode[found] = 71;
                found++;
                break;
            }
        }
        //i702
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i702[i][0])&&(!Objects.equals(i702[i][5], "Attended"))) {
                idClassCode[found] = 72;
                found++;
                break;
            }
        }
        //i703
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i703[i][0])&&(!Objects.equals(i703[i][5], "Attended"))) {
                idClassCode[found] = 73;
                found++;
                break;
            }
        }
        //i704
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i704[i][0])&&(!Objects.equals(i704[i][5], "Attended"))) {
                idClassCode[found] = 74;
                found++;
                break;
            }
        }
        //i801
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i801[i][0])&&(!Objects.equals(i801[i][5], "Attended"))) {
                idClassCode[found] = 81;
                found++;
                break;
            }
        }
        //i802
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i802[i][0])&&(!Objects.equals(i802[i][5], "Attended"))) {
                idClassCode[found] = 82;
                found++;
                break;
            }
        }
        //i803
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i803[i][0])&&(!Objects.equals(i803[i][5], "Attended"))) {
                idClassCode[found] = 83;
                found++;
                break;
            }
        }
        //i804
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, i804[i][0])&&(!Objects.equals(i804[i][5], "Attended"))) {
                idClassCode[found] = 84;
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

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 102) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 103) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 104) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 201) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 202) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 23) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 24) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 31) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 32) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 33) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 34) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 41) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 42) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 43) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 44) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 51) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 52) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 53) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 54) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 61) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 62) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 63) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 64) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 71) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 72) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 73) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 74) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 81) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 82) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 83) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 84) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
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
        else if (cancelClass == 23)
            CancelClass(i203, id,23);
        else if (cancelClass == 24)
            CancelClass(i204, id,24);
        else if (cancelClass == 31)
            CancelClass(i301, id,31);
        else if (cancelClass == 32)
            CancelClass(i302, id,32);
        else if (cancelClass == 33)
            CancelClass(i303, id,33);
        else if (cancelClass == 34)
            CancelClass(i304, id,34);
        else if (cancelClass == 41)
            CancelClass(i401, id,41);
        else if (cancelClass == 42)
            CancelClass(i402, id,42);
        else if (cancelClass == 43)
            CancelClass(i403, id,43);
        else if (cancelClass == 44)
            CancelClass(i404, id,44);
        else if (cancelClass == 51)
            CancelClass(i501, id,51);
        else if (cancelClass == 52)
            CancelClass(i502, id,52);
        else if (cancelClass == 53)
            CancelClass(i503, id,53);
        else if (cancelClass == 54)
            CancelClass(i504, id,54);
        else if (cancelClass == 61)
            CancelClass(i601, id,61);
        else if (cancelClass == 62)
            CancelClass(i602, id,62);
        else if (cancelClass == 63)
            CancelClass(i603, id,63);
        else if (cancelClass == 64)
            CancelClass(i604, id,64);
        else if (cancelClass == 71)
            CancelClass(i701, id,71);
        else if (cancelClass == 72)
            CancelClass(i702, id,72);
        else if (cancelClass == 73)
            CancelClass(i703, id,73);
        else if (cancelClass == 74)
            CancelClass(i704, id,74);
        else if (cancelClass == 81)
            CancelClass(i801, id,81);
        else if (cancelClass == 82)
            CancelClass(i802, id,82);
        else if (cancelClass == 83)
            CancelClass(i803, id,83);
        else if (cancelClass == 84)
            CancelClass(i804, id,84);
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
            s12++;
        else if(classCode==103)
            s13++;
        else if(classCode==104)
            s14++;
        else if(classCode==201)
            s21++;
        else if(classCode==202)
            s22++;
        else if(classCode==23)
            s23++;
        else if(classCode==24)
            s24++;
        else if(classCode==31)
            s31++;
        else if(classCode==32)
            s32++;
        else if(classCode==33)
            s33++;
        else if(classCode==34)
            s34++;
        else if(classCode==41)
            s41++;
        else if(classCode==42)
            s42++;
        else if(classCode==43)
            s43++;
        else if(classCode==44)
            s44++;
        else if(classCode==51)
            s51++;
        else if(classCode==52)
            s52++;
        else if(classCode==53)
            s53++;
        else if(classCode==54)
            s54++;
        else if(classCode==61)
            s61++;
        else if(classCode==62)
            s62++;
        else if(classCode==63)
            s63++;
        else if(classCode==64)
            s64++;
        else if(classCode==71)
            s71++;
        else if(classCode==72)
            s72++;
        else if(classCode==73)
            s73++;
        else if(classCode==74)
            s74++;
        else if(classCode==81)
            s81++;
        else if(classCode==82)
            s82++;
        else if(classCode==83)
            s83++;
        else if(classCode==84)
            s84++;
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
        else if (attendClass == 23)
            AttendClass(i203, id);
        else if (attendClass == 24)
            AttendClass(i204, id);
        else if (attendClass == 31)
            AttendClass(i301, id);
        else if (attendClass == 32)
            AttendClass(i302, id);
        else if (attendClass == 33)
            AttendClass(i303, id);
        else if (attendClass == 34)
            AttendClass(i304, id);
        else if (attendClass == 41)
            AttendClass(i401, id);
        else if (attendClass == 42)
            AttendClass(i402, id);
        else if (attendClass == 43)
            AttendClass(i403, id);
        else if (attendClass == 44)
            AttendClass(i404, id);
        else if (attendClass == 51)
            AttendClass(i501, id);
        else if (attendClass == 52)
            AttendClass(i502, id);
        else if (attendClass == 53)
            AttendClass(i503, id);
        else if (attendClass == 54)
            AttendClass(i504, id);
        else if (attendClass == 61)
            AttendClass(i601, id);
        else if (attendClass == 62)
            AttendClass(i602, id);
        else if (attendClass == 63)
            AttendClass(i603, id);
        else if (attendClass == 64)
            AttendClass(i604, id);
        else if (attendClass == 71)
            AttendClass(i701, id);
        else if (attendClass == 72)
            AttendClass(i702, id);
        else if (attendClass == 73)
            AttendClass(i703, id);
        else if (attendClass == 74)
            AttendClass(i704, id);
        else if (attendClass == 81)
            AttendClass(i801, id);
        else if (attendClass == 82)
            AttendClass(i802, id);
        else if (attendClass == 83)
            AttendClass(i803, id);
        else if (attendClass == 84)
            AttendClass(i804, id);
        else
            System.out.println("\nInvalid Choice :(\n");

    }

    static void AttendClass(String[][] db, String id) {

        for (int i=0;i<5;i++) {
            if (Objects.equals(db[i][0], id)) {
                db[i][5] = "Attended";
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
            if(db[i][5]=="Attended"){
                noCustomers++;
                avgRating+=Float.parseFloat(db[i][8]);
            }
        }
        avgRating/=noCustomers;
        System.out.println("\nNumber of Customers Attended:\t"+noCustomers+"\nAverage Rating of the Class:\t"+avgRating+"\n");

    }



//

    static void ChampionReportSelect(int month){

        int highIncome=0,yogaIncome=0,boxfitIncome=0,zumbaIncome=0,aquaciseIncome=0;


        switch (month){

            case 1:
                for (String[][] items: new String[][][]{i101, i201, i301, i401})
                    yogaIncome+=ChampionReport(items);
                System.out.println("Yoga\t\t\t\t"+yogaIncome);

                for (String[][] items: new String[][][]{i102, i202, i302, i402})
                    boxfitIncome+=ChampionReport(items);
                System.out.println("Box Fit\t\t\t\t"+boxfitIncome);

                for (String[][] items: new String[][][]{i103, i203, i303, i403})
                    zumbaIncome+=ChampionReport(items);
                System.out.println("Zumba\t\t\t\t"+zumbaIncome);

                for (String[][] items: new String[][][]{i104, i204, i304, i404})
                    aquaciseIncome+=ChampionReport(items);
                System.out.println("Aquacise\t\t\t"+aquaciseIncome);
                break;
            case 2:
                for (String[][] items: new String[][][]{i501, i601, i701, i801})
                    yogaIncome+=ChampionReport(items);
                System.out.println("Yoga\t\t\t\t"+yogaIncome);

                for (String[][] items: new String[][][]{i502, i602, i702, i802})
                    boxfitIncome+=ChampionReport(items);
                System.out.println("Box Fit\t\t\t\t"+boxfitIncome);

                for (String[][] items: new String[][][]{i503, i603, i703, i803})
                    zumbaIncome+=ChampionReport(items);
                System.out.println("Zumba\t\t\t\t"+zumbaIncome);

                for (String[][] items: new String[][][]{i504, i604, i704, i804})
                    aquaciseIncome+=ChampionReport(items);
                System.out.println("Aquacise\t\t\t"+aquaciseIncome);
                break;

            default:
                System.out.println("\nMonth Doesnt Exist :(\n");
                Report.ChampionReportView();
        }

        //Highest Income
        for( int items : new int[]{yogaIncome, boxfitIncome, zumbaIncome, aquaciseIncome}){
            if(items>highIncome)
                highIncome=items;
        }
        System.out.print("\nHighest Income Class:\t");
        if(highIncome==yogaIncome)
            System.out.print("Yoga\t\t");
        if(highIncome==boxfitIncome)
            System.out.print("Box Fit\t\t");
        if(highIncome==zumbaIncome)
            System.out.print("Zumba\t\t");
        if(highIncome==aquaciseIncome)
            System.out.print("Aquacise\t\t");



    }

    static int ChampionReport(String[][] db){

        int noCustomers=0;
        for(int i=0;i<5;i++){
            if(db[i][5]=="Attended"){
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
