public class Cylinder {
    public static double getVolume(int radius, double height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius) {
        return Math.PI * radius * 2;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}