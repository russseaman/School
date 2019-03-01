public class tableParse {

    private int state;
    private String action1;
    private String action2;
    private String action3;
    private String action4;
    private String action5;
    private String action6;
    private String gotoE;
    private String gotoT;
    private String gotoF;

    public tableParse(int state, String action1, String action2, String action3, String action4, String action5,
            String action6,String gotoE, String gotoT, String gotoF) {
        super();
        this.state = state;
        this.action1 = action1;
        this.action2 = action2;
        this.action3 = action3;
        this.action4 = action4;
        this.action5 = action5;
        this.action6 = action6;
        this.gotoE = gotoE;
        this.gotoT = gotoT;
        this.gotoF = gotoF;
    }

    public tableParse(String string) {
	}

	public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getAction1() {
        return action1;
    }

    public void setAction1(String action1) {
        this.action1 = action1;
    }

    public String getAction2() {
        return action2;
    }

    public void setAction2(String action2) {
        this.action2 = action2;
    }

    public String getAction3() {
        return action3;
    }

    public void setAction3(String action3) {
        this.action3 = action3;
    }

    public String getAction4() {
        return action4;
    }

    public void setAction4(String action4) {
        this.action4 = action4;
    }

    public String getAction5() {
        return action5;
    }

    public void setAction5(String action5) {
        this.action5 = action5;
    }

    public String getAction6() {
        return action6;
    }

    public void setAction6(String action6) {
        this.action6 = action6;
    }

    public String getGotoE() {
        return gotoE;
    }

    public void setGotoE(String gotoE) {
        this.gotoE = gotoE;
    }

    public String getGotoT() {
        return gotoT;
    }

    public void setGotoT(String gotoT) {
        this.gotoT = gotoT;
    }

    public String getGotoF() {
        return gotoF;
    }

    public void setGotoF(String gotoF) {
        this.gotoF = gotoF;
    }

    @Override
    public String toString() {
        return "State: " + state + "Action1: " + action1 + "Action2: " + action2 + "Action3: " + action3 + "Action4: "
                + action4 + "Action5: " + action5 + "Action6: " + action6 + "GOTO_E: " + gotoE + "GOTO_T: " + gotoT
                + "GOTO_F: " + gotoF;
    }
}