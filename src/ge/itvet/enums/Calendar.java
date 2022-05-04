package ge.itvet.enums;

public class Calendar {
    private WeekDay day;

    public Calendar(WeekDay day) {
        this.day = day;
    }

    public static String isWorkDay(WeekDay day) {





        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case FRIDAY:
            case THURSDAY:
                return "სამუშაო";
            case SATURDAY:
            case SUNDAY:
                return "არასამუშაო";
            default:
                return "არასწორი პარამერი";
        }
    }

    //Default
    public Calendar() {
        this(WeekDay.MONDAY);
    }

    public WeekDay getDay() {
        return day;
    }
}
