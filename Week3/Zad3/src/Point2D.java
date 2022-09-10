public class Point2D {
// Klasa ta powinna mieć dwa prywatne pola określające współrzędne x oraz y,
    private int x;
    private int y;

    public Point2D(){
    }

//Konstruktor dwuargumentowy pozwalający zainicjalizować wartości pól x, y;
    public Point2D(int x , int y){
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

//metodę przesuń, która przesuwa punkt o podaną wartość
    public void move(int a ,int b){
        x = a + x;
        y = b + y;
    }

}
