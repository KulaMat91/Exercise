package org.exampleD1.EXP1exceptions;

public class Main {
    public static void main(String[] args) {

        //Array out of band exceptions
        String[] array = new String[]{"One", "Two", "Three"};
//        System.out.println(array[3]);
//        getArrayElement(array, 3);
//        Integer x = Integer.parseInt("t");

//        Blok try catch
        try {
            String s = getArrayElement(array, 3);
            System.out.println(s);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Given index is out of arrays bounds");
        }
        catch (NullPointerException e){
            System.err.println("Given array is null!");
        }
        catch (Exception e) {
            //catch (Exception e) - ten blok się wykonaa kiedy załapie obojetną jaką exception
            System.out.println(e.getMessage());
        }
        finally {
            //this block executes always
            System.out.println("It will always be here ");
        }
    }


    public static String getArrayElement(String[] array, int index) throws ArrayIndexOutOfBoundsException, NullPointerException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index not supposed to be of this value!");//wyrzucanie wyjątków
        } else {
            return array[index];
        }
    }
}
