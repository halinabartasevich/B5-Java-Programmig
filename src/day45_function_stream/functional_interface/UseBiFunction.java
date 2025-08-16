package day45_function_stream.functional_interface;

import my_util.FunctionsUtil;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/*
    BiFunction <T, U, R>
        - The abstract method in this functional interface:
            - it accepts TWO any type of object (T t, U u)
            - it returns ONE any type of object (R)

            - R apply(T t, U u);
 */
public class UseBiFunction {
    public static void main(String[] args) {
        // Lambda Expression ---- > () -> {}

        // Implement BiFunction function which take 2 numbers and return the biggest one
        BiFunction <Integer, Integer, Integer> findBiggest = (num1, num2) -> {
            return num1 > num2 ? num1 : num2;
        };

        System.out.println(findBiggest.apply(20, 30));
        System.out.println(findBiggest.apply(40, 30));

        System.out.println("**************************************");

        System.out.println(FunctionsUtil.findBiggest.apply(20, 60));
        System.out.println(FunctionsUtil.findBiggest.apply(900, 60));


        System.out.println("**************************************");
        // Implement BiFunction function to take List of String and List of Integer and return Map of String and Integer
        BiFunction <List<String>, List<Integer>, Map<String, Integer>> makeMap = (list1, list2) -> {

            Map <String, Integer> map = new LinkedHashMap<>();

            if (list1.size() == list2.size()) {
                for (int i = 0; i < list1.size(); i++) {
                    map.put(list1.get(i), list2.get(i));
                }
            } else {
                throw new RuntimeException("Lists are not same size!");
            }

            return map;
        };

        List <String> list1 = new LinkedList<>(Arrays.asList("Tom", "Jerry"));
        List <Integer> list2 = new LinkedList<>(Arrays.asList(10, 20));

        System.out.println(makeMap.apply(list1, list2));

        /*
            Tom - 10
            Jerry - 20
         */


    }

    /*
            BiPredicate <T>
                - The abstract method in this functional interface:
                    - it accepts TWO any type of object
                    - it returns a boolean value

                    - boolean test(T t, U u);
         */
    public static class UseBiPredicate {
        public static void main(String[] args) {
            //Implement function which check if given number is in the Array
            // Lambda Expression ---- > () -> {}
            BiPredicate<Integer, Integer []> contains = (num, numArr) -> {
                boolean result = false;

                for ( Integer eachNum : numArr) {
                    if ( eachNum == num ){
                        result = true;
                        break;
                    }
                }

                return result;
            };

            Integer [] arr = {1, 2, 3, 4, 5};
            System.out.println( contains.test(9, arr) );
            System.out.println( contains.test(2, arr) );


            System.out.println("*************************************");
            System.out.println(FunctionsUtil.contains.test(9, arr));
            System.out.println(FunctionsUtil.contains.test(4, arr));



        }
    }
}