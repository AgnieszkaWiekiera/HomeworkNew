package lekcja6.zadanie8;

public class PeselValidator {
    public static void main(String[] args) {
        validatePESEL("9708140465r");
    }

    public static boolean validatePESEL(String pesel) {
        try {
            validateCorrectData(pesel);
            return true;
        } catch (WrongTypeOfDataException ex) {
            return false;
        } catch (IllegalLengthException ex) {
            return false;
        }
    }

    private static void validateCorrectData(String pesel) throws WrongTypeOfDataException, IllegalLengthException {
        if (!pesel.matches("[0-9]+")) {
            throw new WrongTypeOfDataException("Dozwolone są tylko liczby");
        }
        if (pesel.length() != 11) {
            throw new IllegalLengthException("Nieprawidłowa liczba znaków.");
        }
    }
}