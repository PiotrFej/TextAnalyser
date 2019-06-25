package statistics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TenLongestWordsOccuredOnlyOnce implements I_Statistic {

    @Override
    public List<String> analize(String text) {

       /* return I_Statistic.getWordsMap(text)
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .sorted((x, y) -> x.getKey().length().compareTo(y.getKey().length()))
                .limit(10)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());*/

        return I_Statistic.getWordsMap(text)
                .entrySet()
                .stream()
                .filter(x -> x.getValue() ==1)
                .sorted((x, y) -> y.getKey().length() - x.getKey().length())
                .limit(10)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        /*return result
                .entrySet()
                .stream()
                .sorted((x, y) -> x.getKey().length().compareTo(y.getKey().length()))
                .collect(Collectors.toList());*/
    }

    @Override
    public String interpret(String text)
    {
        return "Najdluzsze slowa wystepujace w tekscie to: " + analize(text);
    }
}
