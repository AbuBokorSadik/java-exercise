public class MinutesToYearsDaysCalculator {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printYearsAndDays(long minutes){
        if (minutes >= 0){
            long days = minutes / 1440l;
            long years = days / 365l;
            days = days % 365l;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        }else {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
    }

}
