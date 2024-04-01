package edu.badpals.brunosbox.Rounds;

public class PointsDeducted implements Round{
    private String roundScore = "";
    private byte redBoxerScore = 0;
    private byte blueBoxerScore = 0;

    public PointsDeducted(String roundScore) {
        this.roundScore = roundScore;
        this.boxerRoundScore();
    }

    public void setRedBoxerScore(int redBoxerScore) {
        this.redBoxerScore = (byte)redBoxerScore;
    }

    public void setBlueBoxerScore(int blueBoxerScore) {
        this.blueBoxerScore = (byte)blueBoxerScore;
    }

    /*Reducir visibilidad*/
    public void boxerRoundScore(){
        if (this.roundScore.endsWith("1")){
            setRedBoxerScore(10);
            setBlueBoxerScore(8);
        }else{
            setRedBoxerScore(8);
            setBlueBoxerScore(10);
        }
    }

    public byte getRedBoxerScore() {
        return redBoxerScore;
    }

    public byte getBlueBoxerScore() {
        return blueBoxerScore;
    }

    @Override
    public String toString(){
        return this.roundScore;
    }
}

