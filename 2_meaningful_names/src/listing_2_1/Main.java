package listing_2_1;

public class Main {

    public static void main(String[] args) {
        printGuessStatistics('C', 1);
        printGuessStatistics('B', 3);
        printGuessStatistics('A', 0);
    }

    private static void printGuessStatistics(char candidate, int count) {
        GuessStatisticsMessage message = GuessStatisticsMessage.createFromCandidateCount(candidate, count);
        System.out.println(message);
    }

}
