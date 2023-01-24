package lekcja2.zadanie4;

public class AgeConfirm {

    public static String getAgeDescription(int userAge) {
        if (userAge >= 18) {
            return "Pełnoletni";
        } else if (userAge > 0 && userAge < 18) {
            return "Niepełnoletni";
        } else {
            return "Błąd";
        }
    }
}
