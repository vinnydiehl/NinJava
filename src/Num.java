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
     * Returns a string with the ordinal form of an integer.
     *
     * <pre>
     * {@code
     * Num.ordinalize(1)   // =&gt; "1st"
     * Num.ordinalize(5)   // =&gt; "5th"
     * Num.ordinalize(12)  // =&gt; "12th"
     * Num.ordinalize(42)  // =&gt; "42nd"
     * Num.ordinalize(44)  // =&gt; "44th"
     * }
     * </pre>
     *
     * @param n the number to be ordinalized
     * @return the ordinal form of {@code n}
     */
    public static String ordinalize(int n) {
        int last = Math.abs(n % 10);

        // If the ones place is 1 through 3, but the tens place isn't 1 (we
        // still want 11-13 to get "th"), use st/nd/rd. Anything else gets
        // "th".
        return n + (
            Math.abs(n % 100) / 10 != 1 && last >= 1 && last <= 3
            ? new String[] {null, "st", "nd", "rd"}[last]
            : "th"
        );
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
