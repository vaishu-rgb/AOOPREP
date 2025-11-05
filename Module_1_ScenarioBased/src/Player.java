public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
        System.out.println("Player created: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Player finalized (GC): " + name);
        super.finalize();
    }
}