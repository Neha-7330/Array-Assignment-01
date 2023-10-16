/* 
take 10 input from the user and print only elements that are divisible by 5.
*/
import java.io.*;
class Arr_assign_5 {

    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter 10 elements");
        int len = 10;

        int arr[] = new int[len];
        for(int i = 0; i < len; i++){
            System.out.print("Enter a element :- ");
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        for(int i = 0; i < len; i++){
            if(arr[i] % 5 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
