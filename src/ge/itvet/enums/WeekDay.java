package ge.itvet.enums;

public enum WeekDay {
    TUESDAY("სამშაბათი", 2),
    WEDNESDAY("ოთხშაბათი", 3),
    THURSDAY("ხუთშაბათი", 4),
    FRIDAY("პარასკევი", 5),
    SATURDAY("შაბათი", 6),
    MONDAY("ორშაბათი", 1),
    SUNDAY("კვირა", 7);
    private String geoName;
    private int index;

    WeekDay(String geoName, int index) {
        this.index = index;
        this.geoName = geoName;
    }

    public String getGeoName() {
        return geoName;
    }

    public int getIndex() {
        return index;
    }
}
