package org.example;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/////////////////////////////Array////////////////////////

//public class App {
//
//    public static void main(String[] args) {
//    Double[] array = new Double[5];
//    array[0] = 2.44;
//    array[1] = 3.2;
//    array[2] = 4.23;
//
//    System.out.println(array[0]);
//
//    String[] StringArray = new String[]{"Mariusz", "Dariusz", "Mirek", "Zenek"};
//    System.out.println(StringArray[0]);
//    System.out.println(StringArray[1]);
//    StringArray[1] = "Tomasz";
//    System.out.println(StringArray[1]);
//    }
//}

/////////////////////////////PETLA FOR////////////////////////
//public class App {
//
//    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 100){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println();
//
//        for ( int n = 1; n <= 100; n = n + 2  ){
//            System.out.println(n);
//        }
//    }
//}

/////////////////////////////WYPISYWANIE ELEMNETOW ARRAYA////////////////////////
//public class App {
//
//    public static void main(String[] args) {
//     String[] Array = new String[]{"Mariusz", "Dariusz", "Ela", "Bela"};
//     for (Integer i = 0; i < Array.length; i++){
//         System.out.println(Array[i]);
//     }
//        System.out.println();
//
//     for (String list : Array){
//         System.out.println(list);
//     }
//
//        System.out.println();
//
//        for (Integer i = 0; i < Array.length; i++) {
//        String elemet = Array[i];
//        System.out.println((i + 1) + ". " + elemet);
//        }
//
//    }
//}

///////////////////////////////LISTY////////////////////////
//public class App {
//
//    public static void main(String[] args) {
//        ArrayList<String> listofString = new ArrayList<>();
//        listofString.add("Mateo");
//        listofString.add("Dariusz");
//        listofString.add("Mariusz");
//        listofString.add("Janusz");
//
//        for (String element : listofString){
//            System.out.println(element);
//        }
//
//        System.out.println();
//        listofString.remove(0);
//        listofString.remove("Janusz");
//
//        for (Integer n = 0; n < listofString.size(); n++ ){
//            System.out.println((n + 1) + ". " + listofString.get(n));
//        }
//        System.out.println();
//// Sposoby tworzenia array list
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("X");
//        list1.add("Y");
//        list1.add("Z");
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.addAll(List.of(new String[]{"X", "Y", "Z"}));
//
//        ArrayList<String> list3 = new ArrayList<>(List.of(new String[]{"X", "Y", "Z"}));
//
//        for (String show : list3){
//            System.out.println(show);
//        }
//
//        System.out.println();
//
//        ArrayList<String> list4 = new ArrayList<>(list3);
//        ArrayList<String> list5 = list3;
//
//        list4.add("K");
//
//        for (String a : list4){
//            System.out.println(a);
//        }
//        System.out.println();
//
//        for (String b : list5){
//            System.out.println(b);
//        }
//
//        System.out.println();
//
//        ArrayList<Integer> integers = new ArrayList<>(List.of(new Integer[]{-4 ,72 ,4 ,5, 45}));
//
//
//        integers.remove((Object) 72);
//        integers.remove(0);
//        for (Integer a : integers){
//            System.out.println(a);
//        }
//    }
//}

/////////////////////////////LISTY USUWANIE////////////////////////
//public class App {
//
//    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>(List.of(new Integer[]{1, 3, 5132, 213, 3, 1, 3, 87, 3, 3, 3}));
//        while (integers.contains(3)){
//            integers.remove((Object) 3);
//        }
//
//        for (Integer a : integers){
//            System.out.println(a);
//        }
//
//    }
//}

///////////////////////////// ZADANIA ///////////////////////
//
///Zadanie 1
// Zadanie MinMaxAvgDla danej tablicy liczb całkowitych, napisz kod, który:
//    wyświetli najmniejszą wartość w tej tablicy (minimum)
//    wyświetli największą wartość w tej tablicy (maximum)
//    wyświetli średnią arytmetyczną wartości tej tablicy (average)

// public class App {
//
//    public static void main(String[] args) {
//
//        Integer[] array = new Integer[]{10, -50, -8, 90, 1005};
//
//        Integer minValue = Integer.MAX_VALUE;
//
//        for (Integer a = 0; a < array.length; a++) {
//            if (array[a] < minValue) {
//                minValue = array[a];
//            }
//        }
//        System.out.println("MinValue: " + minValue);
//
//        Integer maxValue = Integer.MIN_VALUE;
////        System.out.println(maxValue);
//        for (Integer b = 0; b < array.length; b++) {
//            if (array[b] > maxValue) {
//                maxValue = array[b];
//            }
//        }
//        System.out.println("MaxValue: " + maxValue);
//
//        Integer sum = 0;
//
//        for (Integer c = 0; c < array.length; c++) {
//            sum += array[c];
//        }
//        Integer average = sum/ array.length;
//        System.out.println("Average: " + average );
//    }
//}

//Zadanie 2 Find
// Dla danej tablicy liczb całkowitych, napisz kod, który wyświetli index,
// na którym znajduje się wpisana przez użytkownika liczba. Jeżeli tej liczby nie ma w tablicy, wyświetl -1.
//
//public class App {
//
//    public static void main(String[] args) {
//
//        Integer[] array = new Integer[]{10, -50, -8, 90, 1005};
//        Integer check = 90;
//        Integer index = -1;
//
//
//        for (Integer a = 0; a < array.length; a++){
//            if (array[a] == check){
//                index = a;
//            }
//        }
//        System.out.println(index);
//    }
//}


//Zadanie 3 Reverse
// Dla danej tablicy liczb całkowitych, napisz kod, który wypisze wszystkie
// jej wartości od ostatniej do pierwszej (odwrotna tablica).

//public class App {
//
//    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>(List.of(new Integer[]{ 10, -50, -8, 90, 1005 }));
//        for (Integer i = integers.size() - 1; i >= 0 ; i--){
//            System.out.println(integers.get(i));
//        }
//
//        System.out.println();
//
//        Integer[] array = new Integer[]{10, -50, -8, 90, 1005};
//        for (Integer a = array.length - 1; a >= 0; a--){
//            System.out.println((a + 1) + "." + array[a]);
//        }
//    }
//}

//Zadanie 4 Compare (extra)
//Dla danych dwóch tablic liczb całkowitych, napisz kod, który sprawdzi, czy te dwie tablice są identyczne
//(czyli mają taką samą ilość elementów, i te elementy są takie same, w tej samej kolejności) i wyświetli odpowiedź na ekranie.

//public class App {
//
//    public static void main(String[] args) {
//
//        Integer[] array = new Integer[]{10, -50, -8, 90, 1005};
//        Integer[] array2 = new Integer[]{100, -50, -8, 90, 1005};
//        boolean areidentical = true;
//
//        if (array.length != array2.length){
//            areidentical = false;
//        }
//        else {
//            for (Integer a = 0; a < array.length; a++){
//                Integer firstElement = array[a];
//                Integer secondElemet = array2[a];
//                if (firstElement != secondElemet){
//                    areidentical = false;
//                    break;
//                }
//            }
//        }
//        if (areidentical){
//            System.out.println("Arrays are identical!");
//        }
//        else {
//            System.out.println("Arrays are diffrent!");
//        }
//    }
//}

/////////////////////////////METODY////////////////////////
//public class App {
//
//    public static void main(String[] args) {
//        int[] array = new int[]{10, -50, -8, 90, 1005};
//        printArray(array);
//        array[0] = 50;
//        array[2] = 50;
//        printArray(array);
//
//        int[] array2 = new int[]{120, -2, -332, 123, 12};
//        printArray(array2);
//    }
//
//    public static void printArray(int[] parameter){
//        for (int element: parameter){
//            System.out.println(element);
//        }
//        System.out.println();
//    }
//}

/////////////////////////////VOID BEZZWROTNA////////////////////////
//public class App {
//
//    public static void main(String[] args) {
//        Integer[] array = new Integer[]{10, -50, -8, 90, 1005};
//        Integer[] array2 = new Integer[]{120, -5231, -8, 90, 12005, 23323, -2323923};
//
//        min(array);
//        min(array2);
//        max(array);
//        max(array2);
//        ave(array);
//        ave(array2);
//
//    }
//    public static void min(Integer[] minarray ){
//        Integer minValue = Integer.MAX_VALUE;
//        for (Integer i = 0; i < minarray.length; i++ ){
//            if (minarray[i] < minValue){
//                minValue = minarray[i];
//            }
//        }
//        System.out.println("Min Value: " + minValue);
//    }
//
//    public static void max(Integer[] maxarray){
//        Integer maxValue = Integer.MIN_VALUE;
//        for (Integer i = 0; i < maxarray.length; i++){
//            if (maxarray[i]> maxValue){
//                maxValue =maxarray[i];
//            }
//        }
//        System.out.println("Max Value: " + maxValue);
//    }
//    public static void ave(Integer[] average){
//       Integer sum = 0;
//        for (Integer i = 0; i < average.length; i++){
//            sum += average[i] ;
//        }
//        Integer score = sum/ average.length;
//        System.out.println("Averagde array value: " + score);
//    }
//
//}

/////////////////////////////RETURN////////////////////////
//public class App {
//
//    public static void main(String[] args) {
//        int[] array = new int[]{10, -50, -8, 90, 1005};
//        int[] array2 = new int[]{120, -5231, -8, 90, 12005, 23323, -2323923};
//
//       int intArrayMin =  min(array);
//       int intArrayMin2 =  min(array2);
//       int intArrayMax = max(array);
//       int intArrayMax2 = max(array2);
//       int intArrayAver = ave(array);
//       int intArrayAver2 = ave(array2);
//
//
//        System.out.println("Min Value: " + intArrayMin);
//        System.out.println("Min Value: " + intArrayMin2);
//        System.out.println("Max Value: " + intArrayMax);
//        System.out.println("Max Value: " + intArrayMax2);
//        System.out.println("Average: " + intArrayAver);
//        System.out.println("Average: " + intArrayAver2);
//
//    }
//    public static int min(int[] minarray ){
//        int minValue = Integer.MAX_VALUE;
//        for (int i = 0; i < minarray.length; i++ ){
//            if (minarray[i] < minValue){
//                minValue = minarray[i];
//            }
//        }
//        return minValue;
//    }
//
//    public static int max(int[] maxarray){
//        int maxValue = Integer.MIN_VALUE;
//        for (int i = 0; i < maxarray.length; i++){
//            if (maxarray[i]> maxValue){
//                maxValue =maxarray[i];
//            }
//        }
//        return maxValue;
//    }
//    public static int ave(int[] average){
//        int sum = 0;
//        for (int i = 0; i < average.length; i++){
//            sum += average[i] ;
//        }
//        int score = sum/ average.length;
//        return score;
//    }
//}

/////////////////////////////ZADANIA METODY////////////////////////
//1. Napisz program, który pyta użytkownika o liczbę całkowitą dodatnią n, i następnie wyświetla n-ty wyraz ciągu Fibonacci'ego.
//2. Napisz program, który pyta użytkownika o liczbę całkowitą dodatnią n i następnie wyświetla liczby
// od 1 do n zgodnie z zasadami wyliczanki FizzBuzz.
//3. Napisz program, który jest prostym kalkulatorem - pyta użytkownika o dwie liczby zmiennoprzecinkowe i
// wybór operacji (dodawanie, odejmowanie, mnożenie, dzielenie), a następnie wyświetla całe działanie i wynik (np 1 + 2 = 3)
//
//We wszystkich zadaniach wykorzystaj metody i zastosuj podział na warstwy Input, Logic, Output -
// w main powinno być możliwie najmniej kodu. Pamiętaj o zasadzie Single Responsibility Principle -
// jedna metoda powinna odpowiadać za jedną czynność


//ZADANIE 1

//import java.util.Scanner;
//
//public class App {
//
//    public static void main(String[] args) {
//        Integer n = getPositiveNumberFromUser();
//        Integer result = calculateFibonacci(n);
//        printResult(n,result);
//    }
//
//    public static Integer getPositiveNumberFromUser(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write number?");
//        Integer userInput = scanner.nextInt();
//
//        if (userInput <= 0){
//            System.out.println("Provide number " + userInput + " is not positive! Displaying results for 1 instead.");
//            return 1;
//        }
//        else {
//            return userInput;
//        }
//    }
//
//    public static Integer calculateFibonacci(Integer n){
//        Integer previousPrevious = 0;
//        Integer previous = 1;
//
//        if (n.equals(1)){
//            return previousPrevious;
//        }
//        else if (n == 2) {
//            return previous;
//        }
//        else {
//            Integer current = 0;
//            for (Integer i = 2; i < n; i++){
//                current =previous + previousPrevious;
//                previousPrevious = previous;
//                previous = current;
//            }
//            return current;
//        }
//    }
//
//    public static void printResult(Integer n, Integer result){
//        System.out.println("Fibonacci sequence result #" + n + " is: " + result);
//    }
//}

//ZADANIE 2

//import java.util.Scanner;
//
//public class App {
//
//    public static void main(String[] args) {
//        Integer n = getPositiveNumberFromUser();
//        String[] messages = getMessagesArray(n);
//        printMessages(messages);
//    }
//
//    public static Integer getPositiveNumberFromUser(){
//        System.out.println("Write a positive number: ");
//        Scanner scanner = new Scanner(System.in);
//        Integer userInput = scanner.nextInt();
//        if (userInput <= 0){
//            System.out.println("Provide number " + userInput + " is not positive! Displaying results for 1 instead.");
//            return 1;
//        }
//        else {
//            return userInput;
//        }
//    }
//
//    public static String[] getMessagesArray(Integer n) {
//        String[] messages = new String[n];
//
//        for (Integer i = 0; i < n; i++) {
//            String message = getMessage(i + 1);
//            messages[i] = message;
//        }
//        return messages;
//    }
//
//    public static  String getMessage(Integer number){
//        if (number % 15 == 0) {
//            return "FizzBuzz";
//        }
//        else if (number % 3 == 0) {
//            return "Fizz";
//        }
//        else if (number % 5 == 0) {
//            return "Buzz";
//        }
//        else {
//            return number.toString();
//        }
//    }
//
//    public static void printMessages(String[] messages) {
//        for (String message : messages) {
//            System.out.println(message);
//        }
//    }
//}

//ZADANIE 3 Kalkulator

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class App {
//
//    public static void main(String[] args) {
//        Double a = getDoubleFromUSerInput("Please input first number:");
//        String operator = getOperatorFromUserInput();
//        Double b = getDoubleFromUSerInput("Please input second number:");
//        Double result = calculate(a, b, operator);
//        displayCalculation(a, b, result , operator);
//
//
//    }
//
//    public static Double getDoubleFromUSerInput(String messages){
//        System.out.println(messages);
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextDouble();
//    }
//
//    public static String getOperatorFromUserInput (){
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> validOperator = new ArrayList<>(List.of(new String[]{ "+", "-", "*", "/" }));
//        String userInput = "";
//
//        while (validOperator.contains(userInput) == false) { // do momentu jak bedzie to falszywe
//            System.out.println("Please input an operator [+, -, *, /]");
//            userInput = scanner.nextLine();
//        }
//        return  userInput;
//    }
//
//
//
//    public static Double calculate(Double a, Double b, String operator) {
//        return switch (operator) {
//            case "+" -> add(a, b);
//            case "-" -> sub(a, b);
//            case "*" -> mul(a, b);
//            case "/" -> div(a, b);
//            default -> 0.0;
//        };
//    }
//
//    public static Double add(Double a, Double b) {
//        return a + b;
//    }
//
//    public static Double sub(Double a, Double b) {
//        return a - b;
//    }
//
//    public static Double mul(Double a, Double b) {
//        return a * b;
//    }
//
//    public static Double div(Double a, Double b) {
//        if (b == 0.0) {
//            return 0.0;
//        }
//        else {
//            return a / b;
//        }
//    }
//
//    public static void displayCalculation(Double a, Double b, Double result, String operator){
//        if (operator.equals("/") && b == 0.0){
//            System.out.println("Divison by 0 is not permitted!");
//        }
//        else {
//            System.out.println(a + " "  + operator + " "+ b + " = " + result);
//        }
//
//    }
//}


/////////////////////////////TABLICE 2 WYMIAROWE////////////////////////


//public class App {
//
//    public static void main(String[] args) {
//        String[] array1D = new String[5];
//        for(Integer i = 0; i< array1D.length; i++){
//            array1D[i] = "X";
//        }
//
//        for(Integer i = 0; i< array1D.length; i++){
//            System.out.print(array1D[i] + " ");
//        }
//
//        for (String a : array1D ){
//            System.out.println(a);
//        }
//        System.out.println();
//        String[][] array2D = new String[5][5];
//        for (Integer i = 0; i < array2D.length; i++ ){
//            for (Integer j = 0; j < array2D[i].length; j++){
//                array2D[i][j]="X";
//            }
//        }
//        for (Integer i = 0; i < array2D.length; i++){
//            for (Integer j = 0; j < array2D[i].length; j++){
//            System.out.print(array2D[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}


/////////////////////////////TABLICE 2 WYMIAROWE////////////////////////


//
//public class App {
//
//    public static void main(String[] args) {
//        Integer width =3;
//        Integer height =3;
//        String[][] board = gerCleanBoard(width, height);
//        displayBoard(board);
//
//    }
//
//    public static String[][] gerCleanBoard(Integer width, Integer height){
//        String[][] board = new String[height][width];
//
//        for (Integer i = 0; i < board.length; i++){
//            for (Integer j = 0; j < board[i].length; j++){
//                board[i][j] = "#";
//            }
//        }
//        return board;
//    }
//
//    public static void displayBoard(String[][] board){
//        System.out.print(' ');
//        for (Integer i = 0; i < board[0].length; i++){
//            char letter = (char)(i + 65); // zeby dostac litere A
//            System.out.print(letter + " ");
//        }
//        System.out.println();
//
//        for (Integer i = 0; i < board.length; i++){
//            System.out.println((i + 1) + " ");
//            for (Integer j = 0; j < board[i].length; j++){
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

////////////////////////////HASHSET////////////////////////



//public class App {
//
//    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(5);
//        set.remove(5);
//
//        for (Integer a : set){
//            System.out.println(a);
//        }
//    }
//}

////////////////////////////HASHMAP////////////////////////

//public class App {
//
//    public static void main(String[] args) {
//        HashMap<String, Integer> groceryList = new HashMap<>();
//        groceryList.put("chips", 2);
//        groceryList.put("milk", 1);
//        groceryList.put("eggs", 12);
//        Integer a = groceryList.get("milk");
//        System.out.println(a);
//        for (String item : groceryList.keySet()){
//            Integer amount = groceryList.get(item);
//            System.out.println(item + ": " + amount);
//        }
//
//        for (Integer amount : groceryList.values()){
//            System.out.println(amount);
//        }
//
//        for (Map.Entry<String, Integer> entry : groceryList.entrySet()){
//            String item = entry.getKey();
//            Integer amount = entry.getValue();
//            System.out.println(item + ": " + amount);
//        }
//
//        HashMap<String, String[]> dictionary = new HashMap<>();
//        dictionary.put("Samochód", new String[] { "Car", "Automobile" });
//        dictionary.put("Książka", new String[] { "Book" });
//
//        for (String word : dictionary.keySet()){
//            String[] translate = dictionary.get(word);
//            System.out.println(word + " = " + translate);
//        }
//
//    }
//}

////////////////////////////STRINGI////////////////////////
//public class App {
//
//    public static void main(String[] args) {
//    String a = "Hello";
//    String b = "World";
//
//    String c = a + b;
//    String formatted = String.format("%s, %s", a, b);
//// %s - string
//// %d - integer
//// %f - float
//    String emailTrmplate = "Hello %s, thank you for purchasing %s your package will be deliverde in %d days";
//    String email = String.format(emailTrmplate, "Mateusz", "XBOX", 5);
//
//
//    System.out.printf(emailTrmplate, "Matuesz","XBOX", 5);
//    System.out.println();
//    System.out.println(email);
//
////        Splitowanie stringow
//        String text = "This is a sentancee seperated by spaces.";
//        String[] splitText = text.split(" ");
//        for (String s: splitText){
//            System.out.println(s);
//        }
//        System.out.println(splitText[3]);
//    }
//}

///////////////////    Podmienianie stringow
//public class App {
//
//    public static void main(String[] args) {
//
//        String text = "This,is a,sentancee,seperated by spaces.";
//        String  cleanText = text.replace(","," ").replace("."," ");
//        cleanText = cleanText.replace("This","That");
//        System.out.println(cleanText);
//        String[] splitText = text.split(" ");
//        for (String a : splitText){
//            System.out.println(a);
//        }
//
////  Obcinanie niepotrzzebnych znakow w stringach - trim
//
//        String unTrimText = "                   Software Academy";
//        String trimmedText = unTrimText.trim();
//        System.out.println(trimmedText);
//
//    }
//
//}

//////////////Char - pojedynczy znak - string tablica charow

//public class App {
//
//    public static void main(String[] args) {
//
//        String word = "Hello World";
//        String  s = word.toLowerCase().replace(" ", "");
//        System.out.println(s);
//        System.out.println(word);
//        for (char c : word.toCharArray()){
//            System.out.println(c);
//        }
//        System.out.println();
//        for (Integer a = 0; a < word.length(); a++){
//            char c = word.charAt(a);
//            System.out.println(c);
//        }
//    }
//}

////////////////////////////ZADANIA////////////////////////
//Zad 1. Palindrome - zwraca true, jeżeli dany string odczytany od tyłu jest identyczny do oryginalnego
//        (np. Anna, Testset, Racecar, Norma is as selfless as I am, Ron.
//Zad 2. Anagram - zwraca true, jeżeli dane dwa stringi składają się z dokładnie tych samych liter
//(np. Tom Marvolo Riddle - I am Lord Voldemort, Rocket Boys - October Sky
//
//Zadanie 3 .Heterogram - zwraca true, jeżeli w danym stringu żadna litera się nie powtarza
// (np. uncopyrightables, ambidexterously, flamethrowing ) - na char stringi, potem na tablice set i porownac czy sie powtarzaja
//
//Zadnie 4.Pangram - zwraca true, jeżeli dany string zawiera wszystkie litery alfabetu łacińskiego
//(np. The quick brown fox jumps over a lazy dog, Jackdaws love my big sphinx of quartz)
public class App {

    public static void main(String[] args) {
//    testPalindromes();
//    testAnagram();
//    testHeterogram();
        testPangram();


    }

// Czyszczenie stringow do malych liter i bez spacji
    public static String cleanString(String s){
        return s.toLowerCase().replace(" ","")
                .replace(",","").replace(".","");
    }

//    Sprawdzanie czy na tych samych miejscach są te same liter od końca
    public static Boolean palindrome(String s){
        char[] charArray = cleanString(s).toCharArray(); // zamienia czystego stringa na array char
        for (int i = 0; i < charArray.length; i++){
            int j = charArray.length - i - 1; // od konca liczenie ma 4 litery string a ostatnia wartość to 3 bo zaczyna się od zera char[3] = lenght 4
            if (charArray[i] != charArray[j]){
                return false;
            }
        }
        return true;
    }
    public static  void testPalindromes(){
        HashMap<String,Boolean> testCases = new HashMap<>();
        testCases.put("Anna", true);
        testCases.put("Testset", true);
        testCases.put("Racecar", true);
        testCases.put("Norma is as selfless as I am, Ron.", true);
        testCases.put("Annie", false);
        testCases.put("Racemobile", false);
//        Wypisywanie po kolei stringow  i booelanow z HashMapy
        for (Map.Entry<String, Boolean> entry: testCases.entrySet()){
            String s = entry.getKey();
            Boolean expectedResult = entry.getValue();
            Boolean actualResult = palindrome(s);// po kolei bierze te stringi i sprawdza w programie palindrome
            if (expectedResult == actualResult){
                System.out.printf("%s case - correct", s);
            }
            else {
                System.out.printf("%s case - incorrect", s);
            }
            System.out.println();
        }
    }


//////////////////////////ANAGRAM//////////////
// Sprawdza ile jest tych smych liter w danym stringu i uwrzuca je do HasMap
    public static  HashMap<String,Integer> getLetterStats(String s){
        HashMap<String, Integer> letters = new HashMap<>();
        for (Integer i = 0; i < s.length(); i++){
            String letter = "" + s.charAt(i); // rozbija na pojeyncze litery string
            if (letters.containsKey(letter)){
                Integer oldAmount = letters.get(letter); // liczba dla danego chara
                letters.replace(letter, oldAmount + 1); // dodaje ilość jeżeli są np 2 takie same litery
            }
            else {
                letters.put(letter,1);
            }
        }
        return letters;
    }

//
    public static Boolean anagram(String a, String b){
        HashMap<String, Integer> lettersA = getLetterStats(cleanString(a));
        HashMap<String, Integer> lettersB = getLetterStats(cleanString(b));
        for (String key : lettersA.keySet()){
            if (lettersB.containsKey(key) == false){ // jezeli zawiera to prawda czyli jezeli rowna się false to ten if jest nieprawdziwy
                return false;
            }
            Integer valueA = lettersA.get(key);
            Integer valueB = lettersB.get(key);
            if (valueA.equals(valueB) == false){
                return false;
            }
        }
        return true;
    }


    public static  void testAnagram(){
        HashMap<String[], Boolean> testCases = new HashMap<>(); // hash mapa ze stringow w postaci arraya i booleana
        testCases.put(new String[] { "Tom Marvolo Riddle", "I am Lord Voldemort" }, true);
        testCases.put(new String[] { "Tom Marvolo Riddle", "I am Lort Voldemort" }, false);
        testCases.put(new String[] { "Rocket Boys", "October Sky" }, true);
        testCases.put(new String[] { "Rocket Boys", "October Sk" }, false);
        //        Wypisywanie po kolei stringow(arraya)  i booelanow z HashMapy
        for (Map.Entry<String[], Boolean> entry :testCases.entrySet()){
            String a = entry.getKey()[0]; // wypiuje danego stringa  z arraya
            String b = entry.getKey()[1];
            Boolean expectedResult = entry.getValue();
            Boolean actualResult = anagram(a,b);

            if (expectedResult == actualResult){
                System.out.printf("%s , %s case - correct", a, b);
            }
            else {
                System.out.printf("%s , %s case - incorrect", a, b);
            }
            System.out.println();
        }
    }


//////////////////////////HETEROGRAM//////////////


//    Ustawia danego Stringa w set z charów
    public static HashSet<String> getLettersSet(String s){

        String [] lettersArray = new String[s.length()]; // array o długosci stringa
        char[] charArray = s.toCharArray(); // array z pojedynczych charow ze stringa

        for (Integer i = 0; i< charArray.length; i++){
            lettersArray [i] = "" + charArray[i]; // zamienia arary z chara na array ze stringa aby mozna bylo zrobić HashSet<String> a nie <char>
        }
        return new HashSet<>(List.of(lettersArray));
    }

    public static Boolean heterogram(String s) {
        String cleanString = cleanString(s);
        HashSet<String> letterSet = getLettersSet(cleanString);

        return cleanString.length() == letterSet.size(); // jezeli to prawda to zwroci tru jezeli nie to false
    }

    public static void testHeterogram() {
        HashMap<String, Boolean> testCases = new HashMap<>();
        testCases.put("uncopyrightables", true);
        testCases.put("flamethrowing", true);
        testCases.put("uuncopyrightables", false);
        testCases.put("flamethrowingg", false);

        for (Map.Entry<String, Boolean> entry : testCases.entrySet()) {
            String s = entry.getKey(); // wypiuje danego stringa  z arraya
            Boolean expectedResult = entry.getValue();
            Boolean actualResult = heterogram(s);

            if (expectedResult == actualResult) {
                System.out.printf("%s ,  case - correct", s);
            } else {
                System.out.printf("%s , case - incorrect", s);
            }
            System.out.println();
        }
    }

    ////////////////////////PANGRAM//////////////

    public static Boolean pangram(String s){
        String cleanString = cleanString(s);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        HashSet<String> letterString = getLettersSet(cleanString); // string na HashSeta
        HashSet<String> letterAlphabet = getLettersSet(alphabet);

        for (String letter: letterString){
            letterAlphabet.remove(letter); //Hash set po kolei i usuwa te litery ktore sa
        }
        return letterAlphabet.size() == 0;
    }
    public static void testPangram() {
        HashMap<String, Boolean> testCases = new HashMap<>();
        testCases.put("The quick brown fox jumps over a lazy dog", true);
        testCases.put("Jackdaws love my big sphinx of quartz", true);
        testCases.put("The quick brown fo jumps over a lazy dog", false);
        testCases.put("Jackdaws love my big sphinx of uartz", false);

        for (Map.Entry<String, Boolean> entry : testCases.entrySet()) {
            String s = entry.getKey();
            Boolean expectedResult = entry.getValue();
            Boolean actualResult = pangram(s);

            if (expectedResult == actualResult) {
                System.out.printf("%s case - correct", s);
            }
            else {
                System.out.printf("%s case - incorrect", s);
            }

            System.out.println();
        }
    }
}