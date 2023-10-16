/* 
take size of array from user and also take integer element from user print profuct of even elements.
*/

import java.io.*;
import java.util.*;
class Arr_assign_2 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size(lenght) of array :- ");
        int len = Integer.parseInt(br.readLine());

        System.out.print("Enter array elements (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");

        int multi = 1;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if(num % 2 == 0)
                multi *= num;
        }
        System.out.println("Product of even numbers in an array is :- " + multi);
    }
}
