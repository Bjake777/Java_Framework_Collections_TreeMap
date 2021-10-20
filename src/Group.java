public class Group implements Comparable<Group> {
    private Day day;
    private int hour;
    private int minute;

    public Group(Day day, int hour, int minute) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return day + " " + hour + ":" + minute;
    }

    @Override
    public int compareTo(Group o) {
        if (day.compareTo(o.day) > 0) {
            return 1;
        } else if (day.compareTo(o.day) < 0) {
            return -1;
        }
        if (hour > o.hour) {
            return 1;
        } else if (hour < o.hour) {
            return -1;
        }
        if (minute > o.minute) {
            return 1;
        } else if (minute < o.minute) {
            return -1;
        }
        return 0;
    }
}
