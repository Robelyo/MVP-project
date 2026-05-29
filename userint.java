public class userint extends player {
    private String symb;
    private int score;

    userint(String name, String symb,int score) {
        super(name);
        this.symb=symb;
        this.score=score;
    }

    public String getsymb(){
        return symb;
    }
    public int getscore(){
        return score;
    }
    public void setsymb(String symb){
        if (symb.equals("X")||symb.equals("O")){
            this.symb=symb;
        }
    }
    public void addscore(){
        score++;
    }
    @Override
    public void displayinfo(){
        System.out.println("Player: "+getname()+" Symbol: "+symb+" Score: "+score);
    }
}
