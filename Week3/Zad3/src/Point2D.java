public class Point2D {
    // Klasa ta powinna mieć dwa prywatne pola określające współrzędne x oraz y,
    private int x; // jak bedzie static to przy kilku pkt bedzie zwracac ostatnia wartosc x
    private int y;

    public Point2D() {
    }

    //Konstruktor dwuargumentowy pozwalający zainicjalizować wartości pól x, y;
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //dwie metody publiczne pozwalające pobrać ich wartości
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //metodę przesuń, która przesuwa punkt o podaną wartość
    public void move(int a, int b) { // jak jest void bez static to można tą metodę uzyć przy zmianie np nowego pkt po kropce startPont.move(a,b) jak setter
        this.x = a + x;
        this.y = b + y;
    }

    public String toString() {
        return "Point {x = " + x + ", y = " + y + " }";
    }

}
