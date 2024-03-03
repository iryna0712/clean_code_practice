package listing_2_1;

public class GuessStatisticsMessage {

    public static final String PLURAL_POSTFIX = "s";
    public static final String PLURAL_VERB = "are";
    public static final String SINGLE_VERB = "is";
    public static final String ZERO_COUNTER = "no";

    private String verb;
    private String number;
    private char candidate;
    private String pluralModifier;

    private GuessStatisticsMessage() {}

    public static GuessStatisticsMessage createFromCandidateCount(char candidate, int count) {
        GuessStatisticsMessage message = new GuessStatisticsMessage();

        boolean single = (count == 1);

        message.setVerb(single ? SINGLE_VERB : PLURAL_VERB);
        message.setNumber(count == 0 ? ZERO_COUNTER : String.valueOf(count));
        message.setPluralModifier(single ? "" : PLURAL_POSTFIX);
        message.setCandidate(candidate);

        return message;
    }

    public char getCandidate() {
        return candidate;
    }

    public void setCandidate(char candidate) {
        this.candidate = candidate;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPluralModifier() {
        return pluralModifier;
    }

    public void setPluralModifier(String pluralModifier) {
        this.pluralModifier = pluralModifier;
    }

    @Override
    public String toString() {
        return String.format("There %s %s '%s'%s", verb, number, candidate, pluralModifier);
    }
}