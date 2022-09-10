public class VarArgsExample {
    public static void main(String[] args) {
        System.out.println(multiply(1,2,3,4));
    }
//vararg definiujemy wpisuyjac wielokropek (3 kropki) po nazwie typu argumentu
    public static int multiply(int arg0, int... args){
        int result = arg0;
        for (int i = 0; i < args.length; i++){
            result *= args[i];
        }
        return result;
    }
}
