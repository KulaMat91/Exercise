public class MathFunctions {

    public MathFunctions(){
    }

    public static void printSum(int a, int b, int c){
        int sum = a +  b + c;
        System.out.println("Sum= " + a + " + "+  b + " + " + c + " = " + sum);
    }

    public static void printMultiply(int a, int b, int c){
        int multiply = a * b * c;
        System.out.println("Multiply= " + a + " * "+  b + " * " + c + " = " + multiply);
    }

    public static void printPower(int a, int b){
        int power = 1;
        for (int i = b ; i > 0 ;i--){
            power = power * a;
        }
        System.out.println("Power: " + a + "^" + b + " = " + power);
    }

    public static void printFactorial(int a){
        int result = 1;
        int counter = 1;
        if(a == 0) {
            System.out.println(result);
        }
        else {
            while (counter <= a) {
                result = result * counter;
                counter++;
            }
            System.out.println("Silnia " + a + " = " + result);
          }
    }
//    funcA – do obliczania wartości funkcji f(x)=3∗a^2+7∗ab+1.5∗b
    public static void printFuncA(double a, double b){

        double f = 3 * Math.pow(a,2) + 7 * a * b + 1.5 * b;
        System.out.println("f(x) = " + f);
    }
}
