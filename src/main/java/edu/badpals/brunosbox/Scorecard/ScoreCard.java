package edu.badpals.brunosbox.Scorecard;

import edu.badpals.brunosbox.Rounds.RegularRound;
import edu.badpals.brunosbox.Rounds.Round;

import java.util.ArrayList;
import java.util.List;


public class ScoreCard {
    private String color = "";
    private String redCorner= "";
    private String blueCorner= "";
    private String[] judgeScoreCard;
    private List<Round> rounds = new ArrayList<>();
    public ScoreCard(String color) {
        this.color = color;
    }

    public void setRCorner(String redCorner) {
        this.redCorner = redCorner;
    }

    public void setBCorner(String blueCorner) {
        this.blueCorner = blueCorner;
    }

    public String getRedCorner() {
        return redCorner;
    }

    public String getBlueCorner() {
        return blueCorner;
    }
    public String getRedBoxerFinalScore() {
        return "";
    }

    public String getBlueBoxerFinalScore() {
        return "";
    }

    @Override
    public String toString() {
        return "\t\t\t   " + color + '\n' +
                "\t     " + getBlueCorner() + "\t" + getRedCorner() + '\n' +
                "\tRound\tScore\tRound\tScore\tRound\n" +
                "\tScore\tTotal\t\tTotal\tScore"+ "\n"+
                "\t" + getRounds().get(0).getRedBoxerScore() + "\t\t" + "1" + "\t\t" + getRounds().get(0).getBlueBoxerScore() + "\n"
                ;
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        this.judgeScoreCard = judgeScoreCard;
        this.roundMaker();
    }
    void roundMaker(){
        for (String round : this.judgeScoreCard){
            Round actualRound = new RegularRound(round);
            this.rounds.add(actualRound);
        }
    }

    public List<Round> getRounds() {
        return rounds;
    }
}
