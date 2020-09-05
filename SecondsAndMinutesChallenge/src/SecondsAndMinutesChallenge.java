public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MASSEGE = "Invalid Value";
    public static void main(String[] args) {
        String getOutput;
        getOutput = getDurationString(3909);
        System.out.println(getOutput);
        getOutput = getDurationString(65,9);
        System.out.println(getOutput);
        getOutput = getDurationString(-40);
        System.out.println(getOutput);

    }
    public static String getDurationString(long minutes, long seconds){

        if ((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))){

            long hours = minutes / 60;
            minutes = minutes % 60;

            String hoursString = hours + "h ";
            if (hours < 10){
                hoursString = "0" + hoursString;
            }
            String minutesString = minutes + "m ";
            if (minutes < 10){
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10){
                secondsString = "0" + secondsString;
            }

            return  hoursString + minutesString + secondsString;
        }

        return INVALID_VALUE_MASSEGE;
    }
    public static String getDurationString(long seconds){

        if (seconds >= 0){

            long minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes,seconds);
        }

        return INVALID_VALUE_MASSEGE;
    }
}
