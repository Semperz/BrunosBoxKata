package edu.badpals.brunosbox;

import edu.badpals.brunosbox.Rounds.RegularRound;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularRoundTest {

    @Test
    public void TestRegularRound1(){
        RegularRound round = new RegularRound("9 - 10");
        round.boxerRoundScore();
        assertEquals(10, round.getBlueBoxerScore());
        assertEquals(9, round.getRedBoxerScore());
    }
}
