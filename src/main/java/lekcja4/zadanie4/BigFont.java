package lekcja4.zadanie4;

public class BigFont implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}