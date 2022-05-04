package ge.itvet.conditions;

public class Calendar {
    private int firstWeekDayOfYear;


    public Calendar(int firstWeekDayOfYear) {
        this.firstWeekDayOfYear = setInBounds(firstWeekDayOfYear);
    }

    public static String weekDayName(int weekDay) {
        String name;

        switch (weekDay) {
            case 1:
                name = "ორშაბათი";
                break;
            case 2:
                name = "სამშაბათი";
                break;
            case 3:
                name = "ოთხშაბათი";
                break;
            case 4:
                name = "ხუთშაბათი";
                break;
            case 5:
                name = "პარასკევი";
                break;
            case 6:
                name = "შაბათი";
                break;
            case 7:
                name = "კვირა";
                break;
            default: {
                name = "არასწორი პარამეტრი";
                System.out.println("თქვენ უნდა გადმოსცეთ რიცხვი [1-7] შუალედში." + " თქვენს მიერ გადმოცემული რიცხვია " + weekDay + '.');
            }
        }

        return name;
    }

    public String weekDayName() {
        return weekDayName(this.firstWeekDayOfYear);
    }

    public int weekDayAfterDays(int day) {
        return setInBounds(this.firstWeekDayOfYear + day);
    }

    private int setInBounds(int value) {
        int val = Math.abs(value) % 7;
        return val == 0 ? 7 : val;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1800) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

}









