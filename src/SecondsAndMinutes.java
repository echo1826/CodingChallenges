public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(63, 59));
    }
    // naive way
//    public static String getDurationString(int seconds) {
//        if(seconds < 0) {
//            return "Invalid amount of seconds";
//        }
//
//        int minutes = 0;
//        int hours = 0;
//        if(seconds >= 60) {
//            minutes =  seconds/60;
//            seconds = seconds % 60;
//            if(minutes >= 60) {
//                hours = minutes/60;
//                minutes = minutes % 60;
//                return hours + "h " + minutes + "m " + seconds + "s";
//            }
//            return hours + "h " + minutes + "m " + seconds + "s";
//        }
//        return hours + "h " + minutes + "m " + seconds + "s";
//    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid amount of seconds";
        }
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds < 0 || seconds > 59) {
            return "Invalid amount of seconds";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
