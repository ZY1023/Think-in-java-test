//test initializaiton of an array

import java.util.*;

public class ArrayInitialization{
   public static void main(String[] args){
     int[] a;
     Random rand = new Random(47);
     a = new int[rand.nextInt(20)];
     System.out.println("length of a =" + a.length);
     System.out.println(Arrays.toString(a));//Arrays.toString() is part of the standard java.util library, which produces a printable version of a one-dimensional array.
   }
}