package edu.badpals.brunosbox.Rounds;

public class RoundFactory {

    public static Round getRound(String roundScore){

        if(roundScore == null){
            return null;
        }
        if(roundScore.indexOf("9") != -1){
            return new RegularRound(roundScore);
        } else if(roundScore.indexOf(",") == -1){
            return new KnockdownRound(roundScore);
        }
        return null;
    }
}
