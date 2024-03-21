package edu.badpals.brunosbox.Scorecard;

import edu.badpals.brunosbox.Rounds.RegularRound;
import edu.badpals.brunosbox.Rounds.Round;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScoreCardTest {

    private String[] data = {"9 - 10",
            "9 - 10",
            "9 - 10",
            "9 - 10",
            "10 - 9",
            "10 - 9",
            "10 - 9",
            "9 - 10",
            "10 - 9",
            "9 - 10"};
    @Test
    public void roundMakerTest(){

        ScoreCard scoreCard = new ScoreCard("WHITE");
        scoreCard.loadJudgeScoreCard(data);
        assertEquals(10,scoreCard.getRounds().size());
        assertTrue(scoreCard.getRounds().get(0).toString().equalsIgnoreCase("9 - 10"));

    }
}
