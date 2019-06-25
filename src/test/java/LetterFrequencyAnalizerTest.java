import languageDetector.FrequencyLanguageDetector;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import statistics.I_Statistic;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

    public class LetterFrequencyAnalizerTest {

        private I_Statistic analizer;

        @Before
        public void before() {
            analizer = new FrequencyLanguageDetector();
        }

        @Test
        public void testSimple1() {
            String text = "Ala ma kota";
            Map<Character, Double>  expectedFrequency = new HashMap<>();
            expectedFrequency.put('a', (4.0 / 9.0) * 100.0);
            expectedFrequency.put('l', (1.0 / 9.0) * 100.0);
            expectedFrequency.put('m', (1.0 / 9.0) * 100.0);
            expectedFrequency.put('k', (1.0 / 9.0) * 100.0);
            expectedFrequency.put('o', (1.0 / 9.0) * 100.0);
            expectedFrequency.put('t', (1.0 / 9.0) * 100.0);
            Map<Character, Double>  actualFrequency = (Map<Character, Double>) analizer.analize(text);
            assertThat(actualFrequency.size()).isEqualTo(expectedFrequency.size());
            assertThat(actualFrequency.entrySet().stream()
                    .allMatch(item -> Math.abs(item.getValue() - expectedFrequency.get(item.getKey())) <= 0.01)
            ).isTrue();
        }

        @Test
        public void testCapitalLetters() {
            String text = "AdaM Ewa PIOTR WoJciech";
            Map<Character, Double>  expectedFrequency = new HashMap<>();
            expectedFrequency.put('a', (3.0 / 20.0) * 100.0);
            expectedFrequency.put('d', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('m', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('e', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('w', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('p', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('i', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('o', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('t', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('r', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('j', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('c', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('h', (1.0 / 20.0) * 100.0);
            Map<Character, Double>  actualFrequency = (Map<Character, Double>) analizer.analize(text);
            assertThat(actualFrequency.size()).isEqualTo(expectedFrequency.size());
            assertThat(actualFrequency.entrySet().stream()
                    .allMatch(item -> Math.abs(item.getValue() - expectedFrequency.get(item.getKey())) <= 0.01)
            ).isTrue();
        }

        @Test
        public void testPunctuation1() {
            String text = "AdaM, :Ewa: [PIOTR] (WoJciech)";
            Map<Character, Double>  expectedFrequency = new HashMap<>();
            expectedFrequency.put('a', (3.0 / 20.0) * 100.0);
            expectedFrequency.put('d', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('m', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('e', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('w', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('p', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('i', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('o', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('t', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('r', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('j', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('c', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('h', (1.0 / 20.0) * 100.0);
            Map<Character, Double> actualFrequency = (Map<Character, Double>) analizer.analize(text);
            assertThat(actualFrequency.size()).isEqualTo(expectedFrequency.size());
            assertThat(actualFrequency.entrySet().stream()
                    .allMatch(item -> Math.abs(item.getValue() - expectedFrequency.get(item.getKey())) <= 0.01)
            ).isTrue();
        }

        @Test
        public void testPunctuation2() {
            String text = "AdaM , Ewa : PIOTR \' \"WoJciech ;";
            Map<Character, Double> expectedFrequency = new HashMap<>();
            expectedFrequency.put('a', (3.0 / 20.0) * 100.0);
            expectedFrequency.put('d', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('m', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('e', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('w', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('p', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('i', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('o', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('t', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('r', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('j', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('c', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('h', (1.0 / 20.0) * 100.0);
            Map<Character, Double> actualFrequency = (Map<Character, Double>) analizer.analize(text);
            assertThat(actualFrequency.size()).isEqualTo(expectedFrequency.size());
            assertThat(actualFrequency.entrySet().stream()
                    .allMatch(item -> Math.abs(item.getValue() - expectedFrequency.get(item.getKey())) <= 0.01)
            ).isTrue();
        }

        @Test
        public void testPolishLetters() {
            String text = "AdaM , Ewa : PIOźą \' \"Wożciech ;";
            Map<Character, Double> expectedFrequency = new HashMap<>();
            expectedFrequency.put('a', (3.0 / 20.0) * 100.0);
            expectedFrequency.put('d', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('m', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('e', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('w', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('p', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('i', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('o', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('ź', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('ą', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('ż', (1.0 / 20.0) * 100.0);
            expectedFrequency.put('c', (2.0 / 20.0) * 100.0);
            expectedFrequency.put('h', (1.0 / 20.0) * 100.0);
            Map<Character, Double> actualFrequency = (Map<Character, Double>) analizer.analize(text);
            assertThat(actualFrequency.size()).isEqualTo(expectedFrequency.size());
            assertThat(actualFrequency.entrySet().stream()
                    .allMatch(item -> Math.abs(item.getValue() - expectedFrequency.get(item.getKey())) <= 0.01)
            ).isTrue();
        }

        @Ignore
        @Test
        public void testEmpty() {
            String text = "";
            Map<Character, Double> expectedFrequency = new HashMap<>();
            Map<Character, Double> actualFrequency = (Map<Character, Double>) analizer.analize(text);
            assertThat(actualFrequency.size()).isEqualTo(expectedFrequency.size());
            assertThat(actualFrequency.entrySet().stream()
                    .allMatch(item -> Math.abs(item.getValue() - expectedFrequency.get(item.getKey())) <= 0.01)
            ).isTrue();
        }

        @Ignore
        @Test
        public void testNull() {
            String text = null;
            Map<Character, Double> expectedFrequency = new HashMap<>();
            Map<Character, Double> actualFrequency = (Map<Character, Double>) analizer.analize(text);
            assertThat(actualFrequency.size()).isEqualTo(expectedFrequency.size());
            assertThat(actualFrequency.entrySet().stream()
                    .allMatch(item -> Math.abs(item.getValue() - expectedFrequency.get(item.getKey())) <= 0.01)
            ).isTrue();
        }

    }
