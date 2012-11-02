public class Num{
    //This class has stuff to do with
    //Numbers such as date, ordinalization,
    //etc.
    /**
     *Ordinalizes a number
     *EX: 1 => 1st
     *31 => 31st
     *49 => 49th
     *
     */
    public String  ordinalize(int x){
        int y = x%10;
        String end = {"th","st","nd","rd","th","th","th","th","th","th","th"};
        return String.valueOf(x)+end[y];
    }

    /**
     *Converts a date
     *EX: 12,31,2012 => Decemeber 31st 2012
     *
     *
     */
    public String DateCon(int month, int day, int year){
        String months[] = {null,"January","Febuary","March","April","May","June","July","August","September","October", "November","December"};
        return months[month]+ordinalize(day)+String.valueOf(year);
    }

    }
