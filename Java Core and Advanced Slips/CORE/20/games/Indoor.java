package games;

public class Indoor {
    protected String player;

    public Indoor() {
    }

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