/* 
take 7 character as an input Print only owels from the array.
*/

import java.io.*;
import java.util.*;
class Arr_assign_4 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char arr[] = {'a', 'e', 'i', 'o', 'u'};

        int size = 15;
        System.out.println("Enter 7 character (seperated by space.) :");
        String str_arr =  br.readLine();
        StringTokenizer st = new StringTokenizer(str_arr, " ");

        char arr1[] = new char[size];
        int k = 0;
        while(st.hasMoreTokens()){
            char str = (st.nextToken()).charAt(0);
            arr1[k] = str;
            k++;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr1.length; j++){
                if(arr[i] == (arr1[j])){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
