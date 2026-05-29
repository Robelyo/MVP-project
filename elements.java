public class elements {
    protected String type;
    protected int plnum;
    static int num=0;

    elements() {
        num++;
        type=" "+num+" ";
        plnum=0;
    }

    public static void resetnum(){
        num=0;
    }
    
}
