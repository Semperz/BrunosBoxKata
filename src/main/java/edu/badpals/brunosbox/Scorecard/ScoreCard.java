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
    public byte getRedBoxerFinalScore() {
        byte sumRedScore = rounds.stream()
                .map(Round::getRedBoxerScore)
                .reduce((a ,b) -> (byte) (a + b))
                .get();
        return sumRedScore;
    }

    public byte getBlueBoxerFinalScore() {
        byte sumBlueScore = rounds.stream()
                .map(Round::getBlueBoxerScore)
                .reduce((a ,b) -> (byte) (a + b))
                .get();
        return sumBlueScore;
    }

    @Override
    public String toString() {
        StringBuilder scoreCardHeader = new StringBuilder();
        scoreCardHeader.append("\t\t\t")
                .append(color)
                .append('\n')
                .append("\t     ")
                .append(getBlueCorner())
                .append("  ")
                .append(getRedCorner())
                .append('\n')
                .append("\tRound\tScore\tRound\tScore\tRound\n")
                .append("\tScore\tTotal\t\tTotal\tScore"+ "\n");
        StringBuilder scoreCardBody = new StringBuilder();
        int roundNumber = 0;
        for (Round round: rounds){
            roundNumber++;
            scoreCardBody.append("\t")
            .append(round.getRedBoxerScore())
                    .append("\t\t")
                    .append(roundNumber)
                    .append("\t\t")
                    .append(round.getBlueBoxerScore())
                    .append("\n");
        }
        return scoreCardHeader.append(scoreCardBody).toString();
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
