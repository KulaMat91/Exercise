public class Zad3 {
    public static void main( String[] args ) {
        Point2D pointStart = Vector2D.pointStart(2,3);
        System.out.println(pointStart);
        Point2D pointEnd = Vector2D.pointEnd(5,5);
        System.out.println(pointEnd);
        Vector2D.vectorLenght(pointStart,pointEnd);
        Vector2D.moveVector(pointStart,pointEnd,1,1);//moveVector - metoda z static
        Vector2D.vectorLenght(pointStart,pointEnd);
        Vector2D.scaleLenght(pointStart,pointEnd,4);



        System.out.println("\nNEW POINT");
        Point2D point1 =new Point2D(2, 4);
        System.out.println(point1);
        point1.move(1,1);//move - metoda z bez static
        System.out.println(point1);

        // JAK JEST STATIC W METODZIE TO MOŻNA JEJ UŻYĆ NP W INNEJ KLASIE, JAK NIE MA TO MOŻNA TĄ METODE UŻYĆ W OBIEKCIE PO KROPCE




    }
}
