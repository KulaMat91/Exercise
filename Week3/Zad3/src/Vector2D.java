public class Vector2D {
//Zad4 - Wykorzystując klasę Point2D, stwórz klasę Vector2D, która pozwala
//zbudować wektor startujący w pewnym punkcie początkowym biegnący
//do punktu końcowego.

    public static Point2D pointStart(int x, int y) {
//        Point2D point2D = new Point2D(x , y);
        return new Point2D(x, y);
    }

    public static Point2D pointEnd(int x, int y) {
        return new Point2D(x, y);
    }

//    public static Point2D pointEnd = new Point2D(5, 8);

    //a)Taki wektor ma metodę, która pozwala obliczyć jego długość.
    public static double vectorLenght(Point2D pointStart, Point2D pointEnd) {
        double xLenght = pointEnd.getX() - pointStart.getX();
        double yLenght = pointEnd.getY() - pointStart.getY();
        double vectorLenght = Math.sqrt(Math.pow(xLenght, 2) + Math.pow(yLenght, 2)); // cast to int (int)
        System.out.println("Vector lenght: " + vectorLenght);
        return vectorLenght;
    }
//Klasa ta powinna również posiadać metodę pozwalającą na:
//b) przesunięcie całego wektora

    public static void moveVector(Point2D pointStart, Point2D pointEnd, int x, int y) {
        pointStart.move(x, y);
        pointEnd.move(x, y);
        System.out.println(pointStart);
        System.out.println(pointEnd);
    }
//c)* metodę do przeskalowania jego długości (przy zachowaniu punktu
//początkowego).

    public static void scaleLenght(Point2D pointStart, Point2D pointEnd, int scale) {
        double newLenght = scale * vectorLenght(pointStart, pointEnd);
        System.out.println("Scale lenght: " + newLenght);


    }


}
