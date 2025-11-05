public class GameApp {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Player p = new Player("Player" + i);
            // p becomes unreachable after each iteration
        }

        // Suggest garbage collection
        System.gc();

        // Pause to allow GC to run
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method completed.");
    }
}