import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
           printIncreasing(n);
        }

    public static void printIncreasing(int n){ //n=5
        if(n==0){
            return;
        }
        //output = 1 2 3 4 5
        printIncreasing(n-1);
        System.out.println(n);
    }

}
