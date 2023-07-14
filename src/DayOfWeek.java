public class DayOfWeek {
    public void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> {
                yield "Monday";
            }
            case 2 -> {
                yield "Tuesday";
            }
            case 3 -> {
                yield "Wednesday";
            }
            case 4 -> {
                yield "Thursday";
            }
            case 5 -> {
                yield "Friday";
            }
            case 6 -> {
                yield "Saturday";
            }
            default -> {
                yield "Invalid Day";
            }
        };

        System.out.println("The number " + day + " is " + dayOfTheWeek + " out of the week");
    }
}
