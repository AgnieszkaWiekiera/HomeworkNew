package lekcja4.zadanie4;

public class SmallFont implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}