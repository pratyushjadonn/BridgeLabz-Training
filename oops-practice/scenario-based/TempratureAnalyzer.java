package scenario.based;

public class TempratureAnalyzer {
	public static void analyze(float[][] temp) {
        float hottestAvg = temp[0][0];
        float coldestAvg = temp[0][0];
        int hottestDay = 0;
        int coldestDay = 0;

        for (int i = 0; i < 7; i++) {
            float sum = 0;
            for (int j = 0; j < 24; j++) {
                sum += temp[i][j];
            }
            float avg = sum / 24;

            System.out.println("Day " + (i + 1) + " Average: " + avg);

            if (avg > hottestAvg) {
                hottestAvg = avg;
                hottestDay = i;
            }

            if (avg < coldestAvg) {
                coldestAvg = avg;
                coldestDay = i;
            }
        }

        System.out.println("Hottest Day: Day " + (hottestDay + 1));
        System.out.println("Coldest Day: Day " + (coldestDay + 1));
    }

    public static void main(String[] args) {
        float[][] temperature = new float[7][24];

        analyze(temperature);
    }

}
