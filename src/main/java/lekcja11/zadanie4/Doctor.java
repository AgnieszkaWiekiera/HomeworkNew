package lekcja11.zadanie4;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Doctor {
    public static Set<String> workPlaceSearcher(List<String> specializations){

        Set<String> uniqueSpecializations = specializations.stream()
                .flatMap(s->Arrays.stream(s.split(":")))
                .filter(s->!s.equals("Szpital") && !s.equals("Przychodnia"))
                .collect(Collectors.toSet());
        return uniqueSpecializations;
    }

    public static void main(String[] args) {
        List<String> specializations = Arrays.asList(
                "Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra",
                "Przychodnia:Internista:Laryngolog:Pediatra"
        );
        System.out.println(workPlaceSearcher(specializations));
    }
}
