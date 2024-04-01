package edu.badpals.brunosbox.Rounds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointsDeductedTest {
    @Test
    public void TestPointsDeduced(){
        PointsDeducted round = new PointsDeducted("1, 8 - 10");
        round.boxerRoundScore();
        assertEquals(10, round.getBlueBoxerScore());
        assertEquals(8, round.getRedBoxerScore());
    }

    @Test
    public void TestPointsDeducedTwo(){
        PointsDeducted round = new PointsDeducted("10 - 8 ,1");
        round.boxerRoundScore();
        assertEquals(8, round.getBlueBoxerScore());
        assertEquals(10, round.getRedBoxerScore());
    }
}
