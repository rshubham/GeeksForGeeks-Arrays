import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Subarray_with_given_sum {

    static void findSubArray(int[] arr, int S){
        int prefixSum = 0, startIndex = 0, endIndex = 0;

        for(int i =0; i < arr.length; i++){
            prefixSum += arr[i];
            endIndex = i;
            while(prefixSum > S) {
                prefixSum -= arr[startIndex];
                startIndex++;

            }
            if(prefixSum == S) {
                for(int x = startIndex; x <= endIndex; x++){
                    System.out.print(arr[x]+" ");
                }
                System.out.println();
            }
        }
        if(prefixSum != S) {
            System.out.println(-1);
            return;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        int testCaseCount = reader.nextInt();
        while(testCaseCount > 0){
            int arraySize = reader.nextInt();
            int S = reader.nextInt();
            int[] arr = new int[arraySize];
            for(int x = 0; x < arraySize; x++){
                arr[x] = reader.nextInt();
            }
            findSubArray(arr,S);
            testCaseCount--;
        }


    }

}
