/* 
take size of array from user and also take integer elements from the user and print sum of odd elements.
*/

import java.io.*;
import java.util.*;
class Arr_assign_1{

    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter lenght of array :- ");
        int len = Integer.parseInt(br.readLine());

        int sum = 0;
        int arr[] = new int[len];
        System.out.print("Enter Array Elements (seperated by space):- ");  
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");  
        
        for(int i = 0; i < len ; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if(num % 2 != 0)
                sum += num;
        }
        
        /*for(int i = 0; i < len; i++){
            System.out.print("Enter the number :- ");
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            if(num % 2 != 0)
                sum += num;
        }*/

        System.out.println("Sum of odd elements in an array is :- " + sum);

    }
}