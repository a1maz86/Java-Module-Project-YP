public class Race {
    public static String leader = "";
    static int distance = 0;

    public static void race() {
        int newDistance = (24 * Car.speed);
        if (newDistance > distance) {
            leader = Car.name;
            distance = newDistance;
        }
    }
}
