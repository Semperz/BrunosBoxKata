package edu.badpals.brunosbox.Rounds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KockdownRoundTest {

    @Test
    public void TestKnockRound(){
        KnockdownRound round = new KnockdownRound("8 - 10");
        round.boxerRoundScore();
        assertEquals(10, round.getBlueBoxerScore());
        assertEquals(8, round.getRedBoxerScore());
    }

    @Test
    public void TestKnockRoundTwo(){
        KnockdownRound round = new KnockdownRound("10 - 8");
        round.boxerRoundScore();
        assertEquals(8, round.getBlueBoxerScore());
        assertEquals(10, round.getRedBoxerScore());
    }
}
