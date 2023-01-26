package lekcja6.zadanie8;

public class PeselValidator {
    public static void main(String[] args) {
        String pesel = "9708140465r";
        try {
            validatePESEL(pesel);
            System.out.println("PESEL " + pesel + " jest poprawny");
        } catch (WrongTypeOfDataException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalLengthException ex) {
            System.out.println(ex.getMessage());
        }
    }
    private static void validatePESEL(String pesel) throws WrongTypeOfDataException, IllegalLengthException {
        if (!pesel.matches("[0-9]+")) {
            throw new WrongTypeOfDataException("Dozwolone są tylko liczby");
        }
        if (pesel.length() != 11) {
            throw new IllegalLengthException("Nieprawidłowa liczba znaków.");
        }
    }
}