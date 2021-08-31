package vacuumCleanerRoute;

public class VacuumCleaner {

    public static boolean isRoutedToOrigin(String route) throws Exception {
        int x = 0;
        int y = 0;

        for (char ch : route.toCharArray()) {
            switch (ch) {
                case 'U' -> y++;
                case 'D' -> y--;
                case 'L' -> x--;
                case 'R' -> x++;
                default -> throw new Exception("Not a valid route");
            }
        }
        return (x == 0 && y == 0);
    }
}
