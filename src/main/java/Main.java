import languageDetector.FrequencyLanguageDetector;
import statistics.MostFrequentWordsAnalyser;
import statistics.TenLongestWordsOccuredOnlyOnce;
import statistics.WordsCountStatistic;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {

        String text = FileReader.getText("panTadeusz.txt");
        WordsCountStatistic wcs = new WordsCountStatistic();
        MostFrequentWordsAnalyser mfwa = new MostFrequentWordsAnalyser();
        TenLongestWordsOccuredOnlyOnce longest = new TenLongestWordsOccuredOnlyOnce();
        FrequencyLanguageDetector fld = new FrequencyLanguageDetector();

       //wcs.analize(text);
        System.out.println(wcs.interpret(text));

        //mfwa.analize(text);
        System.out.println(mfwa.interpret(text));

        //longest.analize(text);
        System.out.println(longest.interpret(text));

        System.out.println(fld.interpret(text));







    }
}
