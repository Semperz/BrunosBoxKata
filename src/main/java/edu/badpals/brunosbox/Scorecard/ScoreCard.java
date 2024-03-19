package edu.badpals.brunosbox.Scorecard;

public class ScoreCard {
    private String color = "";
    private String redCorner= "";
    private String blueCorner= "";
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

    @Override
    public String toString() {
        return "\t\t\t" + color + '\n' +
                "\t\t" + getRedCorner() + '\t' + getBlueCorner() + '\n'

                ;
    }
}
