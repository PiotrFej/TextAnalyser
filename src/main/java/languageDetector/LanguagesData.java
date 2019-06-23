package languageDetector;

import java.util.HashMap;
import java.util.Map;

public class LanguagesData {

    public static final Map<Character, LetterStat> polishMap = new HashMap<>();
    public static final Map<Character, LetterStat> englishMap = new HashMap<>();
    public static final Map<Character, LetterStat> germanMap = new HashMap<>();
    public static final Map<Character, LetterStat> spanishMap = new HashMap<>();
    public static final Map<Character, LetterStat> frenchhMap = new HashMap<>();

    static {
        polishMap.put('a', new LetterStat(10.503, LetterType.TYPICAL));
        polishMap.put('b', new LetterStat(1.74, LetterType.TYPICAL));
        polishMap.put('c', new LetterStat(3.895, LetterType.TYPICAL));
        polishMap.put('d', new LetterStat(3.725, LetterType.TYPICAL));
        polishMap.put('e', new LetterStat(7.352, LetterType.TYPICAL));
        polishMap.put('f', new LetterStat(0.143, LetterType.TYPICAL));
        polishMap.put('g', new LetterStat(1.731, LetterType.TYPICAL));
        polishMap.put('h', new LetterStat(1.015, LetterType.TYPICAL));
        polishMap.put('i', new LetterStat(8.328, LetterType.TYPICAL));
        polishMap.put('j', new LetterStat(1.836, LetterType.TYPICAL));
        polishMap.put('k', new LetterStat(2.753, LetterType.TYPICAL));
        polishMap.put('l', new LetterStat(2.564, LetterType.TYPICAL));
        polishMap.put('m', new LetterStat(2.515, LetterType.TYPICAL));
        polishMap.put('n', new LetterStat(6.237, LetterType.TYPICAL));
        polishMap.put('o', new LetterStat(6.667, LetterType.TYPICAL));
        polishMap.put('p', new LetterStat(2.445, LetterType.TYPICAL));
        polishMap.put('r', new LetterStat(5.243, LetterType.TYPICAL));
        polishMap.put('s', new LetterStat(5.224, LetterType.TYPICAL));
        polishMap.put('t', new LetterStat(2.475, LetterType.TYPICAL));
        polishMap.put('u', new LetterStat(2.062, LetterType.TYPICAL));
        polishMap.put('v', new LetterStat(0.012, LetterType.TYPICAL));
        polishMap.put('w', new LetterStat(5.813, LetterType.TYPICAL));
        polishMap.put('x', new LetterStat(0.004, LetterType.TYPICAL));
        polishMap.put('y', new LetterStat(3.206, LetterType.TYPICAL));
        polishMap.put('z', new LetterStat(4.852, LetterType.TYPICAL));

        polishMap.put('ą', new LetterStat(0.699, LetterType.SPECIAL));
        polishMap.put('ć', new LetterStat(0.743, LetterType.SPECIAL));
        polishMap.put('ę', new LetterStat(1.035, LetterType.SPECIAL));
        polishMap.put('ł', new LetterStat(2.109, LetterType.SPECIAL));
        polishMap.put('ń', new LetterStat(0.362, LetterType.SPECIAL));
        polishMap.put('ó', new LetterStat(1.141, LetterType.SPECIAL));
        polishMap.put('ś', new LetterStat(0.814, LetterType.SPECIAL));
        polishMap.put('ź', new LetterStat(0.078, LetterType.SPECIAL));
        polishMap.put('ż', new LetterStat(0.706, LetterType.SPECIAL));
    }

    static {
        englishMap.put('a', new LetterStat(8.167, LetterType.TYPICAL));
        englishMap.put('b', new LetterStat(1.492, LetterType.TYPICAL));
        englishMap.put('c', new LetterStat(2.782, LetterType.TYPICAL));
        englishMap.put('d', new LetterStat(4.253, LetterType.TYPICAL));
        englishMap.put('e', new LetterStat(12.702, LetterType.TYPICAL));
        englishMap.put('f', new LetterStat(2.228, LetterType.TYPICAL));
        englishMap.put('g', new LetterStat(2.015, LetterType.TYPICAL));
        englishMap.put('h', new LetterStat(6.094, LetterType.TYPICAL));
        englishMap.put('i', new LetterStat(6.966, LetterType.TYPICAL));
        englishMap.put('j', new LetterStat(0.153, LetterType.TYPICAL));
        englishMap.put('k', new LetterStat(0.772, LetterType.TYPICAL));
        englishMap.put('l', new LetterStat(4.025, LetterType.TYPICAL));
        englishMap.put('m', new LetterStat(2.406, LetterType.TYPICAL));
        englishMap.put('n', new LetterStat(6.749, LetterType.TYPICAL));
        englishMap.put('o', new LetterStat(7.507, LetterType.TYPICAL));
        englishMap.put('p', new LetterStat(1.929, LetterType.TYPICAL));
        englishMap.put('q', new LetterStat(0.095, LetterType.TYPICAL));
        englishMap.put('r', new LetterStat(5.987, LetterType.TYPICAL));
        englishMap.put('s', new LetterStat(6.327, LetterType.TYPICAL));
        englishMap.put('t', new LetterStat(9.056, LetterType.TYPICAL));
        englishMap.put('u', new LetterStat(2.758, LetterType.TYPICAL));
        englishMap.put('v', new LetterStat(0.978, LetterType.TYPICAL));
        englishMap.put('w', new LetterStat(2.360, LetterType.TYPICAL));
        englishMap.put('x', new LetterStat(0.150, LetterType.TYPICAL));
        englishMap.put('y', new LetterStat(1.974, LetterType.TYPICAL));
        englishMap.put('z', new LetterStat(0.074, LetterType.TYPICAL));
    }

    static {
        germanMap.put('a', new LetterStat(6.516, LetterType.TYPICAL));
        germanMap.put('b', new LetterStat(1.886, LetterType.TYPICAL));
        germanMap.put('c', new LetterStat(2.732, LetterType.TYPICAL));
        germanMap.put('d', new LetterStat(5.076, LetterType.TYPICAL));
        germanMap.put('e', new LetterStat(16.396, LetterType.TYPICAL));
        germanMap.put('f', new LetterStat(1.656, LetterType.TYPICAL));
        germanMap.put('g', new LetterStat(3.009, LetterType.TYPICAL));
        germanMap.put('h', new LetterStat(4.577, LetterType.TYPICAL));
        germanMap.put('i', new LetterStat(6.550, LetterType.TYPICAL));
        germanMap.put('j', new LetterStat(0.268, LetterType.TYPICAL));
        germanMap.put('k', new LetterStat(1.417, LetterType.TYPICAL));
        germanMap.put('l', new LetterStat(3.437, LetterType.TYPICAL));
        germanMap.put('m', new LetterStat(2.534, LetterType.TYPICAL));
        germanMap.put('n', new LetterStat(9.776, LetterType.TYPICAL));
        germanMap.put('o', new LetterStat(2.594, LetterType.TYPICAL));
        germanMap.put('p', new LetterStat(0.670, LetterType.TYPICAL));
        germanMap.put('q', new LetterStat(0.018, LetterType.TYPICAL));
        germanMap.put('r', new LetterStat(7.003, LetterType.TYPICAL));
        germanMap.put('s', new LetterStat(7.270, LetterType.TYPICAL));
        germanMap.put('t', new LetterStat(6.154, LetterType.TYPICAL));
        germanMap.put('u', new LetterStat(4.166, LetterType.TYPICAL));
        germanMap.put('v', new LetterStat(0.846, LetterType.TYPICAL));
        germanMap.put('w', new LetterStat(1.921, LetterType.TYPICAL));
        germanMap.put('x', new LetterStat(0.034, LetterType.TYPICAL));
        germanMap.put('y', new LetterStat(0.039, LetterType.TYPICAL));
        germanMap.put('z', new LetterStat(1.134, LetterType.TYPICAL));

        germanMap.put('ä', new LetterStat(0.578, LetterType.SPECIAL));
        germanMap.put('ö', new LetterStat(0.443, LetterType.SPECIAL));
        germanMap.put('ß', new LetterStat(0.307, LetterType.SPECIAL));
        germanMap.put('ü', new LetterStat(0.995, LetterType.SPECIAL));
    }

    static {
        spanishMap.put('a', new LetterStat(11.525, LetterType.TYPICAL));
        spanishMap.put('b', new LetterStat(2.215, LetterType.TYPICAL));
        spanishMap.put('c', new LetterStat(4.019, LetterType.TYPICAL));
        spanishMap.put('d', new LetterStat(5.010, LetterType.TYPICAL));
        spanishMap.put('e', new LetterStat(12.181, LetterType.TYPICAL));
        spanishMap.put('f', new LetterStat(0.692, LetterType.TYPICAL));
        spanishMap.put('g', new LetterStat(1.768, LetterType.TYPICAL));
        spanishMap.put('h', new LetterStat(0.703, LetterType.TYPICAL));
        spanishMap.put('i', new LetterStat(6.247, LetterType.TYPICAL));
        spanishMap.put('j', new LetterStat(0.493, LetterType.TYPICAL));
        spanishMap.put('k', new LetterStat(0.011, LetterType.TYPICAL));
        spanishMap.put('l', new LetterStat(4.967, LetterType.TYPICAL));
        spanishMap.put('m', new LetterStat(3.157, LetterType.TYPICAL));
        spanishMap.put('n', new LetterStat(6.712, LetterType.TYPICAL));
        spanishMap.put('o', new LetterStat(8.683, LetterType.TYPICAL));
        spanishMap.put('p', new LetterStat(2.510, LetterType.TYPICAL));
        spanishMap.put('q', new LetterStat(0.877, LetterType.TYPICAL));
        spanishMap.put('r', new LetterStat(6.871, LetterType.TYPICAL));
        spanishMap.put('s', new LetterStat(7.977, LetterType.TYPICAL));
        spanishMap.put('t', new LetterStat(4.632, LetterType.TYPICAL));
        spanishMap.put('u', new LetterStat(2.927, LetterType.TYPICAL));
        spanishMap.put('v', new LetterStat(1.138, LetterType.TYPICAL));
        spanishMap.put('w', new LetterStat(0.017, LetterType.TYPICAL));
        spanishMap.put('x', new LetterStat(0.215, LetterType.TYPICAL));
        spanishMap.put('y', new LetterStat(1.008, LetterType.TYPICAL));
        spanishMap.put('z', new LetterStat(0.467, LetterType.TYPICAL));

        spanishMap.put('á', new LetterStat(0.502, LetterType.SPECIAL));
        spanishMap.put('é', new LetterStat(0.433, LetterType.SPECIAL));
        spanishMap.put('í', new LetterStat(0.725, LetterType.SPECIAL));
        spanishMap.put('ñ', new LetterStat(0.311, LetterType.SPECIAL));
        spanishMap.put('ó', new LetterStat(0.827, LetterType.SPECIAL));
        spanishMap.put('ú', new LetterStat(0.168, LetterType.SPECIAL));
        spanishMap.put('ü', new LetterStat(0.012, LetterType.SPECIAL));
    }

    static {
        frenchhMap.put('a', new LetterStat(7.636, LetterType.TYPICAL));
        frenchhMap.put('b', new LetterStat(0.901, LetterType.TYPICAL));
        frenchhMap.put('c', new LetterStat(3.260, LetterType.TYPICAL));
        frenchhMap.put('d', new LetterStat(3.669, LetterType.TYPICAL));
        frenchhMap.put('e', new LetterStat(14.715, LetterType.TYPICAL));
        frenchhMap.put('f', new LetterStat(1.066, LetterType.TYPICAL));
        frenchhMap.put('g', new LetterStat(0.866, LetterType.TYPICAL));
        frenchhMap.put('h', new LetterStat(0.737, LetterType.TYPICAL));
        frenchhMap.put('i', new LetterStat(7.529, LetterType.TYPICAL));
        frenchhMap.put('j', new LetterStat(0.613, LetterType.TYPICAL));
        frenchhMap.put('k', new LetterStat(0.074, LetterType.TYPICAL));
        frenchhMap.put('l', new LetterStat(5.456, LetterType.TYPICAL));
        frenchhMap.put('m', new LetterStat(2.968, LetterType.TYPICAL));
        frenchhMap.put('n', new LetterStat(7.095, LetterType.TYPICAL));
        frenchhMap.put('o', new LetterStat(5.796, LetterType.TYPICAL));
        frenchhMap.put('p', new LetterStat(2.521, LetterType.TYPICAL));
        frenchhMap.put('q', new LetterStat(1.362, LetterType.TYPICAL));
        frenchhMap.put('r', new LetterStat(6.693, LetterType.TYPICAL));
        frenchhMap.put('s', new LetterStat(7.948, LetterType.TYPICAL));
        frenchhMap.put('t', new LetterStat(7.244, LetterType.TYPICAL));
        frenchhMap.put('u', new LetterStat(6.311, LetterType.TYPICAL));
        frenchhMap.put('v', new LetterStat(1.838, LetterType.TYPICAL));
        frenchhMap.put('w', new LetterStat(0.049, LetterType.TYPICAL));
        frenchhMap.put('x', new LetterStat(0.427, LetterType.TYPICAL));
        frenchhMap.put('y', new LetterStat(0.128, LetterType.TYPICAL));
        frenchhMap.put('z', new LetterStat(0.326, LetterType.TYPICAL));

        frenchhMap.put('à', new LetterStat(0.486, LetterType.SPECIAL));
        frenchhMap.put('â', new LetterStat(0.051, LetterType.SPECIAL));
        frenchhMap.put('ç', new LetterStat(0.085, LetterType.SPECIAL));
        frenchhMap.put('è', new LetterStat(0.271, LetterType.SPECIAL));
        frenchhMap.put('é', new LetterStat(1.504, LetterType.SPECIAL));
        frenchhMap.put('ê', new LetterStat(0.218, LetterType.SPECIAL));
        frenchhMap.put('ë', new LetterStat(0.008, LetterType.SPECIAL));
        frenchhMap.put('î', new LetterStat(0.045, LetterType.SPECIAL));
        frenchhMap.put('ï', new LetterStat(0.005, LetterType.SPECIAL));
        frenchhMap.put('ô', new LetterStat(0.023, LetterType.SPECIAL));
        frenchhMap.put('ù', new LetterStat(0.058, LetterType.SPECIAL));
        frenchhMap.put('û', new LetterStat(0.060, LetterType.SPECIAL));
        frenchhMap.put('œ', new LetterStat(0.018, LetterType.SPECIAL));
    }

}
