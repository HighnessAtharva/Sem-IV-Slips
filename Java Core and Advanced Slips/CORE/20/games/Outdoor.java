package games;

public class Outdoor {
    protected String player;
    public Outdoor(String p) {
        player = p;
    }

    public void display() {
        System.out.println(player);
    }

    protected void finalize() {
        System.out.println("Terminating Outdoor...");
    }
}
