package lekcja7.zadanie7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class TrainingEvaluatorTest {

    @Test
    void shouldGetGoodScore() {
        //given
        double weightedScore = 1.5d;
        //when
        String getOverallScore = TrainingEvaluator.getOverallScore(weightedScore);
        //then
        Assertions.assertEquals("dobra", getOverallScore);
    }

    @Test
    void shouldGetVeryGoodScore() {
        //given
        double weightedScore = 2.5;
        //when
        String getOverallScore = TrainingEvaluator.getOverallScore(weightedScore);
        //then
        Assertions.assertEquals("bardzo dobra", getOverallScore);
    }

    @Test
    void shouldGetExcellentScore() {
        //given
        double weightedScore = 3.2;
        //when
        String getOverallScore = TrainingEvaluator.getOverallScore(weightedScore);
        //then
        Assertions.assertEquals("doskonała", getOverallScore);
    }

    @Test
    void shouldGetLowScore() {
        //given
        double weightedScore = 1.1;
        //when
        String getOverallScore = TrainingEvaluator.getOverallScore(weightedScore);
        //then
        Assertions.assertEquals("niska", getOverallScore);
    }

    @Test
    void shouldGetOverallScoreWithNullWeightedScore() {
        try {
            TrainingEvaluator.getOverallScore(null);
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Brak danych wejściowych.", e.getMessage());
        }
    }
}