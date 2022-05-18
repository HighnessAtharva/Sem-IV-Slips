package games;

public class Indoor {
    // variable player and Constructor have to be STRICTLY PUBLIC otherwise you will get an error when accessing them from main package. 
    public String player;
    public Indoor(String p) {
        player = p;
    }
    public void display() {
        System.out.println(player);
    }
    protected void finalize() {
        System.out.println("Terminating Indoor...");
    }
}