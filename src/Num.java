public class Num {
    //This class has stuff to do with
    //Numbers such as date, ordinalization,
    //etc.

    public static final String[] MONTHS = {
        null,
        "January", "Febuary", "March", "April",
        "May", "June", "July", "August",
        "September", "October", "November", "December"
    };

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
     * Creates a human readable date out of the month, day, and year numbers.
     *
     * <pre>
     * {@code
     * Num.dateString(3, 4, 2012)   // =&gt; "March 4th, 2012"
     * Num.dateString(12, 1, 2012)  // =&gt; "December 1st, 2012"
     * }
     * </pre>
     *
     * @param month the number of the month
     * @param day the day of the month
     * @param year the year
     * @return a human readable date formed from the number inputs
     */
    public static String dateString(int month, int day, int year) {
        return String.format(
            "%s %s, %d",
            MONTHS[month],
            ordinalize(day),
            year
        );
    }
}
