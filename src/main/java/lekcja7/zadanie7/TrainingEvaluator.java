package lekcja7.zadanie7;

public class TrainingEvaluator {
    private static final double LENGTH_WEIGHT = 1;
    private static final double CALORIES_WEIGHT = 2;
    private static final double HEART_RATE_WEIGHT = 3;

    private static double evaluate(Double length, Double calories, Double heartRate) {
        if (length == null || calories == null || heartRate == null) {
            throw new IllegalArgumentException("Wszystkie parametry muszą być dostarczone");
        }
        double lengthScore = getLengthScore(length);
        double caloriesScore = getCaloriesScore(calories);
        double heartRateScore = getHeartRateScore(heartRate);

        double weightedScore = (lengthScore * LENGTH_WEIGHT + caloriesScore * CALORIES_WEIGHT + heartRateScore * HEART_RATE_WEIGHT) / (LENGTH_WEIGHT + CALORIES_WEIGHT + HEART_RATE_WEIGHT);
        return weightedScore;
    }

    private static double getLengthScore(Double length) {
        if (length == null) {
            throw new IllegalArgumentException("Brak danych wejściowych.");
        }else if (length < 30) {
            return 1;
        } else if (length <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    private static double getCaloriesScore(Double calories) {
        if (calories == null) {
            throw new IllegalArgumentException("Brak danych wejściowych.");
        } else if (calories <= 300) {
            return 1;
        } else if (calories < 400) {
            return 2;
        } else {
            return 3;
        }
    }

    private static double getHeartRateScore(Double heartRate) {
        if (heartRate == null) {
            throw new IllegalArgumentException("Brak danych wejściowych.");
        } else if (heartRate < 160) {
            return 3;
        } else if (heartRate <= 175) {
            return 2;
        } else {
            return 1;
        }
    }

    public static String getOverallScore(Double weightedScore) {
        if (weightedScore == null) {
            throw new IllegalArgumentException("Brak danych wejściowych.");
        }else if (weightedScore < 1.2) {
            return "niska";
        } else if (weightedScore < 2) {
            return "dobra";
        } else if (weightedScore < 3) {
            return "bardzo dobra";
        } else {
            return "doskonała";
        }
    }

    public static void main(String[] args) {
        System.out.println("Efektywność treningu: " + getOverallScore(evaluate(46.0, 350.0, 177.0)));
        System.out.println(evaluate(40.0, 315.0, 190.0));
    }
}
