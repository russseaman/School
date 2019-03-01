public class grammarParse {
    private String g1;
    private String g2;
    private String g3;
    private String g4;
    private String g5;

    public grammarParse(String g1, String g2, String g3, String g4, String g5) {
        super();
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
        this.g4 = g4;
        this.g5 = g5;
    }

    public String getG1() {
        return g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public String getG2() {
        return g2;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public String getG3() {
        return g3;
    }

    public void setG3(String g3) {
        this.g3 = g3;
    }

    public String getG4() {
        return g4;
    }

    public void setG4(String g4) {
        this.g4 = g4;
    }

    public String getG5() {
        return g5;
    }

    public void setG5(String g5) {
        this.g5 = g5;
    }

    @Override
    public String toString() {
        return "g1: " + g1 + "g2: " + g2 + "g3: " + g3 + "g4: " + g4 + "g5: " + g5;
    }
}