/* 
take size of array from user and also take integer element from user print product of odd index only.
*/

import java.io.*;
import java.util.*;
class Arr_assign_3 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter size(length) of an array :- ");
        int len = Integer.parseInt(br.readLine());

        System.out.print("Enter elements of an array (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");

        int arr[] = new int[len];
        int multi = 1;
        for(int i = 0; i < len; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if(i % 2 != 0)
                multi *= num;
        }
        System.out.println("Product of element at odd index in an array is :- " + multi);
    }
}
