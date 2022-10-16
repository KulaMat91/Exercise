package org.exampleD2.EXP2Functional;

public class Calculator {
    private final Double a;
    private final Double b;

    public Calculator(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Double runCalculation(CalculatorFuntions function) {
        return function.calculate(a, b);
    }

    public Calculator runCalculations(CalculatorFuntions functionA, CalculatorFuntions functionB) {
        Double newA = functionA.calculate(a, b);
        Double newB = functionB.calculate(a, b);
        return new Calculator(newA, newB);
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public static void example() {
        Calculator calculator = new Calculator(10.0, 5.0);

        //Traditional approach - define a class AdditionFunction ,create an instance, pass the instance as parameter
        AdditionFunction additionFunction = new AdditionFunction();
        Double addResult = calculator.runCalculation(additionFunction);
        System.out.println(addResult);
        System.out.println("////////////////////////////////////////////////");

        //Anonymous approach - pass an anonymous implementation of the CalculatorFunction interface as parameter
        Double subResult = calculator.runCalculation(new CalculatorFuntions() {
            @Override
            public Double calculate(Double a, Double b) {
                return a - b;
            }
        });
        System.out.println(subResult);

        System.out.println("////////////////////////////////////////////////");


        // Lambda approach with variable - implement the CalculatorFunction interface with a lambda expression
        // and store it in a variable, then pass it as a parameter
        /*
        @Override
        public Double calculate(Double a, Double b) {
            return a * b;
        }
        */
        CalculatorFuntions mulFunction = (a, b) -> a * b;
        Double mulResult = calculator.runCalculation(mulFunction);
        System.out.println(mulResult);

        System.out.println("////////////////////////////////////////////////");

        //Lambda approach without variable - implement the Calculator Function interface directly as a parameter
        Double divResult = calculator.runCalculation((a, b) -> a / b);
        System.out.println(divResult);


        System.out.println("////////////////////////////////////////////////");


        // Calculation sequence
        //A = 100, B=50, A+B =150 --> new A
        //B --> new B
        //A * B = 7500 --> new A
        // B -> 3
        //A / B = 2500
        //B*2 = 15000-> new A
        //result = A + B

        //Imperative approach
        Calculator calc = new Calculator(100.0, 50.0);
        calc = new Calculator(calculator.runCalculation((a, b) -> a + b), calc.getB());
        calc = new Calculator(calculator.runCalculation((a, b) -> a * b), 3.0);
        calc = new Calculator(calc.runCalculation((a, b) -> a / b), calc.runCalculation((a, b) -> b * 2));
        Double result = calc.runCalculation((a, b) -> a + b);
        System.out.println(result);

        System.out.println("////////////////////////////////////////////////");

        //Lancuchowo
        //Functional Approach

//        Double functionalResult = new Calculator(100.0, 50.0)
//                .runCalculations((a, b) -> a + b, (a, b) -> b)
//                .runCalculations((a, b) -> a * b, (a, b) -> 3.0)
//                .runCalculations((a, b) -> a / b, (a, b) -> 2)
//                .runCalculations((a, b) -> a / b);
//
//        System.out.println(functionalResult);


    }
}
