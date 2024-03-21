package edu.badpals.brunosbox.Rounds;

public class RegularRound implements Round{
    private String roundScore = "";
    private byte redBoxerScore = 0;
    private byte blueBoxerScore = 0;

    public RegularRound(String roundScore) {
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
        if (this.roundScore == "10 - 9"){
            setRedBoxerScore(10);
            setBlueBoxerScore(9);
        }else{
            setRedBoxerScore(9);
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
