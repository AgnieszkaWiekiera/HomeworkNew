package lekcja4.zadanie7;

public class DayOfWeekName {
    public static String getDayOfWeekName(DayOfWeek dayOfWeek){
        switch (dayOfWeek) {
            case MONDAY:
                return "Poniedziałek";
            case TUESDAY:
                return "Wtorek";
            case WEDNESDAY:
                return "Środa";
            case THURSDAY:
                return "Czwartek";
            case FRIDAY:
                return "Piątek";
            case SATURDAY:
                return "Sobota";
            case SUNDAY:
                return "Niedziela";
            default:
                return "Błędny dzień tygodnia";
        }
    }
}