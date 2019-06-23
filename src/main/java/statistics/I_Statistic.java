package statistics;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface I_Statistic <T>
{
    T analize(String text);

    String interpret(String text);

    static Map<String, Long> getWordsMap (String text)
    {
       /*return Arrays.stream(text.replace("[,./()?!-]", " ")
                .split("\\s"))        //\\s = jakikolwiek bialy znak
                .map(word -> word.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/

        return Arrays.stream(text
                .toLowerCase()
                .split("[/. -]|\\r?\\n"))
                .map(x->x.replaceAll("[^\\p{LD}\\s]",""))
                .filter(x->!x.matches(""))
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));


    }


}
