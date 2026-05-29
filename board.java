public class board {
    
    elements E1=new elements();
    elements E2=new elements();
    elements E3=new elements();
    elements E4=new elements();
    elements E5=new elements();
    elements E6=new elements();
    elements E7=new elements();
    elements E8=new elements();
    elements E9=new elements();

    public void showboard(){
        System.out.println("        +---+---+---+");
        System.out.println("        |"+E1.type+"|"+E2.type+"|"+E3.type+"|");
        System.out.println("        +---+---+---+");
        System.out.println("        |"+E4.type+"|"+E5.type+"|"+E6.type+"|");
        System.out.println("        +---+---+---+");
        System.out.println("        |"+E7.type+"|"+E8.type+"|"+E9.type+"|");
        System.out.println("        +---+---+---+");
    }
    public void showboard(String header,String footer){
        System.out.println("");
        System.out.println(header);
        System.out.println("");
        showboard();
        System.out.println("");
        System.out.println(footer);
        System.out.println("");
    }
}
