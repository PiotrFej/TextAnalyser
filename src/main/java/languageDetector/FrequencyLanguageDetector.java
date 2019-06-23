package languageDetector;

import statistics.I_Statistic;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyLanguageDetector implements I_Statistic <Map<Character, Double>> {
    @Override
    public Map<Character, Double> analize(String text) {
        Map<Character, Long> map = text
                .chars()                    //strumień intów odpowiadający charom - trzeba przekonwertować inty na chary
                .mapToObj(x -> (char) x)    // konwersja int na char
                .map(c -> c.toString().toLowerCase())
                .filter(c -> c.matches("\\p{L}"))   // odfiltrowuje znaki w środku w regexie
                .map(x -> x.charAt(0))      // przekształcenie stringa do chara, bo ten String to jest pojedyncza literka
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        Long total_value = map.values() // to jest map Map<Character, Long>
                .stream()
                .reduce(Long::sum)
                .orElseThrow(IllegalArgumentException::new);

        return map
                .entrySet()
                .stream()
                .collect(Collectors.toMap(e -> e.getKey(),
                        e -> (e.getValue().doubleValue() / total_value) * 100.0));
    }

    @Override
    public String interpret(String text) {
        return null;
    }
}
