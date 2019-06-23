package languageDetector;

public class LetterStat {

    private double percent;
    private LetterType type;

    public LetterStat(double percent, LetterType type) {
        this.percent = percent;
        this.type = type;
    }

    public double getPercent() {
        return percent;
    }

    public LetterType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "LetterStat{" +
                "percent=" + percent +
                ", type=" + type +
                '}';
    }
}
