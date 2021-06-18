package labs.Lab_1_04;

import java.util.Arrays;

/*
LOOPS AND VERSION CONTROL (LAB 1.04)

1. Write a method in Java to get the difference between the largest and smallest values in an array of integers.
The length of the array must be 1 and above.
2. Write a method in Java to find the smallest and second smallest elements of a given array and print it in the
console.
3. Write a method in Java that resolves this mathematical expression where x and y are two variables pre-set in your
code: x^2 + (4*y/5 - x)^2
*/

public class Main {
    public static void main(String[] args) {

        //1.
        System.out.println("FIRST METHOD");
        int[] intArray1 = {2, 5, 4, 7, 9};
        difference(intArray1);

        //2.
        System.out.println("SECOND METHOD");
        int[] givenArray1 = {4, 6, 8, 10, -2};
        smallest(givenArray1);

        //Object[] givenArray2 = {'a', 't', 'c', 's', 'e'};
        //smallest2(givenArray2);

        //3.
        System.out.println("THIRD METHOD");
        maths(5.6, 6);

    }

    //FIRST METHOD
    public static void difference(int[] intArray){

        /*Let's initialize the maximum to be the minimum integer value that can be represented and minimum
        to be the maximum integer value that can be represented*/
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < intArray.length; i++){
            //If any element is larger than maximum, we'll assign that element to maximum
            if(intArray[i] > maximum){
                maximum = intArray[i];
                //Else if any element is smaller than minimum, we'll assign that element to minimum
            }
            if(intArray[i] < minimum) {
                minimum = intArray[i];
            }
        }
        //Let's print the difference between the largest and the smallest values in the array
        System.out.println("Difference between the largest and smallest values in intArray: "+ (maximum - minimum));


        /*
        Other way to do it:
        Arrays.sort(intArray); //sorting the array
        int minimum = intArray[0]; //declaring the smallest value in the array
        int maximum = intArray[intArray.length - 1]; //declaring the largest value
        System.out.println(maximum - minimum);
        */

    }

    //SECOND METHOD
    public static void smallest(int[] givenArray) {

        //Let's initialize the minElement and secondMin to be the maximum positive integer values that can be represented
        int minElement = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        if (givenArray.length >= 2) { //The array's length must be at least 2
            for (int i = 0; i < givenArray.length; i++) {
                //If any element is smaller than minElement, we'll assign minElement to secondMin and that element to minElement
                if (givenArray[i] < minElement) {
                    secondMin = minElement;
                    minElement = givenArray[i];
                }
            }
            //Let's print minElement and secondMin
            System.out.println("Smallest element in givenArray: " + minElement);
            System.out.println("Second smallest in givenArray: " + secondMin);
        } else { //If the array's length is smaller than 2, an "Error!" will be printed in the console
            System.err.println("Error!");
        }
    }

        /*
        If we wanted to apply the method to any kind of array (e.g. char[]):

        public static void smallest2(Object[] givenArray) {

        Arrays.sort(givenArray); //sorting the array
        Object minElement = givenArray[0]; //declaring the smallest value in the array
        Object secondMin = givenArray[1]; //declaring the second smallest value

        System.out.println("Smallest element in givenArray: " + minElement);
        System.out.println("Second smallest in givenArray: " + secondMin);

        }
    */

    //THIRD METHOD
    public static void maths(double x, double y){

        System.out.println("Solution to the mathematical expression: " + (Math.pow(x, 2) + (Math.pow(4*y/5-x, 2))));
    }

}
