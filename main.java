
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        gameart art =new gameart();
        art.welcomeart();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name player 1: ");
        String X = scanner.nextLine();
        System.out.println("Enter your name player 2: ");
        String Y = scanner.nextLine();

        String S1="?";
        String S2="?";

        boolean gamerun=true;

        userint P1=new userint(X,S1,0);
        userint P2=new userint(Y,S2,0);

        player dat1 =P1;
        player dat2 =P2;

        dat1.displayinfo();
        dat2.displayinfo();

        while (gamerun) { 
            
            
            while (!S1.equals("X")&&!S1.equals("O")) { 
                System.out.println("Pick a symbol "+P1.getname()+" (X or O): ");
                S1= scanner.nextLine().toUpperCase();
                if (!S1.equals("X")&&!S1.equals("O")) {
                    System.out.println("INVALID INPUT");
                }
            }

            if(S1.equals("X")){
                S2="O";
            }
            else{
                S2="X";
            }

            P1.setsymb(S1);
            P2.setsymb(S2);

            elements.resetnum();

            board B=new board();

            boolean gameongoing=true;
            boolean turn=false;
            int gnum=0;
            ArrayList<Integer> numbers=new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            numbers.add(9);

            String win=" ";

            while (gameongoing) {
                if (turn==true) {
                    switch(gnum){
                        case 1:
                            B.E1.type=" "+S1+" ";
                            win=S1;
                            break;
                        case 2:
                            B.E2.type=" "+S1+" ";
                            win=S1;
                            break;
                        case 3:
                            B.E3.type=" "+S1+" ";
                            win=S1;
                            break;
                        case 4:
                            B.E4.type=" "+S1+" ";
                            win=S1;
                            break;
                        case 5:
                            B.E5.type=" "+S1+" ";
                            win=S1;
                            break;
                        case 6:
                            B.E6.type=" "+S1+" ";
                            win=S1;
                            break;
                        case 7:
                            B.E7.type=" "+S1+" ";
                            win=S1;
                            break;
                        case 8:
                            B.E8.type=" "+S1+" ";
                            win=S1;
                            break;
                        case 9:
                            B.E9.type=" "+S1+" ";
                            win=S1;
                            break;
                        default:
                    }
                } else {
                    switch(gnum){
                        case 1:
                            B.E1.type=" "+S2+" ";
                            win=S2;
                            break;
                        case 2:
                            B.E2.type=" "+S2+" ";
                            win=S2;
                            break;
                        case 3:
                            B.E3.type=" "+S2+" ";
                            win=S2;
                            break;
                        case 4:
                            B.E4.type=" "+S2+" ";
                            win=S2;
                            break;
                        case 5:
                            B.E5.type=" "+S2+" ";
                            win=S2;
                            break;
                        case 6:
                            B.E6.type=" "+S2+" ";
                            win=S2;
                            break;
                        case 7:
                            B.E7.type=" "+S2+" ";
                            win=S2;
                            break;
                        case 8:
                            B.E8.type=" "+S2+" ";
                            win=S2;
                            break;
                        case 9:
                            B.E9.type=" "+S2+" ";
                            win=S2;
                            break;
                        default:
                }
            }

            B.showboard("     >>}}=='':+:''=={{<<","     >>}}==..:+:..=={{<<");
                
                if(numbers.isEmpty()){
                    break;
                }
                else if ((B.E1.type.equals(B.E3.type)&&B.E2.type.equals(B.E3.type))||(B.E4.type.equals(B.E6.type)&&B.E5.type.equals(B.E6.type))||(B.E7.type.equals(B.E9.type)&&B.E8.type.equals(B.E9.type))||(B.E1.type.equals(B.E7.type)&&B.E4.type.equals(B.E7.type))||(B.E2.type.equals(B.E8.type)&&B.E5.type.equals(B.E8.type))||(B.E3.type.equals(B.E9.type)&&B.E6.type.equals(B.E9.type))||(B.E3.type.equals(B.E7.type)&&B.E5.type.equals(B.E7.type))||(B.E1.type.equals(B.E9.type)&&B.E5.type.equals(B.E9.type))) {
                    break;
                }
                String Z;
                if(turn==false){
                    Z=P1.getname();
                }
                else{
                    Z=P2.getname();
                }
                boolean stop=true;
                while(stop){
                        System.out.println("Pick a grid number "+Z+" (1-9): ");
                        if (scanner.hasNextInt()) {
                            gnum=scanner.nextInt();
                            if(gnum>=1&&gnum<=9){
                                if (numbers.contains(gnum)){
                                    numbers.remove(Integer.valueOf(gnum));
                                    turn=!turn;
                                    break;
                                }
                                else{
                                    System.out.println("Grid is already taken");
                                }
                            }
                            else{
                                System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            System.out.println("INVALID INPUT");
                            scanner.next();
                        }
                        }
                
            }

            System.out.println(":::ROUND OVER:::");
            if (numbers.isEmpty()&&!((B.E1.type.equals(B.E3.type)&&B.E2.type.equals(B.E3.type))||(B.E4.type.equals(B.E6.type)&&B.E5.type.equals(B.E6.type))||(B.E7.type.equals(B.E9.type)&&B.E8.type.equals(B.E9.type))||(B.E1.type.equals(B.E7.type)&&B.E4.type.equals(B.E7.type))||(B.E2.type.equals(B.E8.type)&&B.E5.type.equals(B.E8.type))||(B.E3.type.equals(B.E9.type)&&B.E6.type.equals(B.E9.type))||(B.E3.type.equals(B.E7.type)&&B.E5.type.equals(B.E7.type))||(B.E1.type.equals(B.E9.type)&&B.E5.type.equals(B.E9.type)))) {
                art.drawart();
            }
            else if (win.equals(S1)){
                art.p1wart();
                System.out.println("WINNER IS !!"+P1.getname()+"!!");
                P1.addscore();
            }
            else{
                art.p2wart();
                System.out.println("WINNER IS !!"+P2.getname()+"!!");
                P2.addscore();
            }

            System.out.println("      =)} TOTAL SCORE {(=");
            System.out.println(P1.getname()+": "+P1.getscore());
            System.out.println(P2.getname()+": "+P2.getscore());
            
            boolean run=true;
            while(run){
                art.rematchart();
                System.out.println("(Y/N?): ");
                String rem=scanner.next().toUpperCase().trim();
                if (rem.equals("NO")||rem.equals("N")){
                    gamerun=false;
                    break; 
                }
                else if (rem.equals("YES")||rem.equals("Y")){
                    break;
                }
                else{
                    System.out.println("INVALID INPUT");
                }
            }
            
        }
        scanner.close();
    }
}