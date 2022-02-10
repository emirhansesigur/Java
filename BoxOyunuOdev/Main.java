public class Main {
    public static void main(String[] args) {
        // dovuscu 2 tane ve match ekle
        Fighter f1 = new Fighter("A", 10, 125, 90,50);
        Fighter f2 = new Fighter("B", 20, 85, 95, 50);

        Match match = new Match(f1, f2, 90, 95);
        match.run();
    }
}
