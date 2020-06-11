public class Euler19 {
    public static void main(String[] args) {
        int day = 1;
        boolean leapYear = false;
        int leapYearCounter = 0;
        int year = 1901;
        int counter = 0;
        while (true) {
            if (year == 2001) break;
            if (year % 4  == 0) leapYear = true;
            if (year % 400 == 0) leapYear = false;

            int january, february = 0, march, april, may, june, july, august, september, october, november, december;

            for (january = 0; january < 31; january++) {
                if (january == 0 && day % 7 == 0) counter++;
                day++;
            }

            if (leapYear) leapYearCounter = 29;
            else leapYearCounter = 28;
            for (february = 0; february < leapYearCounter; february++) {
                if (february == 0 && day % 7 == 0) counter++;
                day++;
            }

            for (march = 0; march < 31; march++) {
                if (march == 0 && day % 7 == 0) counter++;
                day++;
            }
            for (april = 0; april < 30; april++) {
                if (april == 0 && day % 7 == 0) counter++;
                day++;
            }
            for (may = 0; may < 31; may++) {
                if (may == 0 && day % 7 == 0) counter++;
                day++;
            }
            for (june = 0; june < 30; june++) {
                if (june == 0 && day % 7 == 0) counter++;
                day++;
            }
            for (july = 0; july < 31; july++) {
                if (july == 0 && day % 7 == 0) counter++;
                day++;
            }
            for (august = 0; august < 31; august++) {
                if (august == 0 && day % 7 == 0) counter++;
                day++;
            }
            for (september = 0; september < 30; september++) {
                if (september == 0 && day % 7 == 0) counter++;
                day++;
            }
            for (october = 0; october < 31; october++) {
                if (october == 0 && day % 7 == 0) counter++;
                day++;
            }
            for (november = 0; november < 30; november++) {
                if (november == 0 && day % 7 == 0) counter++;
                day++;
            }
            for (december = 0; december < 31; december++) {
                if (december == 0 && day % 7 == 0) counter++;
                day++;
            }
            year++;

        }
        System.out.println(counter);
    }
}
