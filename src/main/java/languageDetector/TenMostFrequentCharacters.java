package languageDetector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TenMostFrequentCharacters {


    public List<Map.Entry<Character, Double>> analize(String text) {
        Map<Character, Long> map = text
                .chars()
                .mapToObj(x -> (char) x)
                .map(c -> c.toString().toLowerCase())
                .filter(c -> c.matches("\\p{L}"))
                .map(x -> x.charAt(0))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        Long total = map.values()
                .stream()
                .reduce(Long::sum)
                .orElseThrow(IllegalAccessError::new);

        Map<Character, Double> map2 = map
                .entrySet()
                .stream()
                .collect(Collectors.toMap(x -> x.getKey(),
                        x -> x.getValue().doubleValue() / total * 100.0));


        return map2
                .entrySet()
                .stream()
                .sorted((a, b) -> a.getValue().compareTo(a.getValue()))
                .limit(10)
                .collect(Collectors.toList())
                ;
    }


    public String interpret(String text) {
        return "10 najczesciej wystepujacych liter to kolejno: " + analize(text);
    }
}
