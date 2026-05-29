public class player {
    private String name;

    player(String name) {
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void displayinfo(){
        System.out.println("Player: "+name);
    }
    
}
