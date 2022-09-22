public class Functions {
    private static int aa;
    private static int ba;
    private static int ca;

    public Functions(int a, int b, int c) {
        aa = a;
        ba = b;
        ca = c;
    }

    public static void sum() {
        int sum = aa + ba + ca;
        System.out.println("sum = " + sum);

    }

    public static void power() {
        int power = (int) Math.pow(aa, ba);
        System.out.println("a ^ b = " + power);
    }

    public static int getAa() {
        return aa;
    }

    public static int getBa() {
        return ba;
    }

    public static int getCa() {
        return ca;
    }

    public static void factional() {
        int result = 1;
        if (aa == 0){
            System.out.printf("Silnia %d = " + result , aa);
        }
        else {
            for (int i = 1 ; i <= aa; i++){
                result = result * i;
            }
            System.out.printf("Silnia %d = " + result , aa);
        }
    }



    public String toString() {
        return "Function {a = " + aa + ", b = " + ba + ", c = " + ca + " }";
    }

}
