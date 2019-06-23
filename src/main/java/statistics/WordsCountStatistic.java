package statistics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;

public class WordsCountStatistic implements I_Statistic
{

    @Override
    public Long analize(String text) {
        return I_Statistic.getWordsMap(text)
                .values()
                .stream()
                .reduce(Long::sum)
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public String interpret(String text) {

        Map<String, Long> finalMap = new LinkedHashMap<>();

         I_Statistic.getWordsMap(text)
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                .reversed())
                .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

         return finalMap
                 .entrySet()
                 .stream()
                 .limit(10)
                 .toString();


    }

}
