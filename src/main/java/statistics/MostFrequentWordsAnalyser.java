package statistics;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentWordsAnalyser implements I_Statistic <List<String>>
{

    @Override
    public List<String> analize(String text) {
        return I_Statistic.getWordsMap(text)
                .entrySet()
                .stream()
                .sorted((x, y) -> y.getValue().compareTo(x.getValue()))
                .limit(10)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    @Override
    public String interpret(String text) {
        return "Najpopularniejsze slowa to: " + analize(text) + ".";
    }
}
