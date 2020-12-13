/*
* https://www.geeksforgeeks.org/array-rotation/
* */
public class Program_For_Array_Rotation {

    public static void rotateArray(RotationType rotation_type,int pivot, int[] arr){
        if(pivot >= arr.length) return;
        if(RotationType.LEFT.equals(rotation_type)){
            while(pivot > 0) {
                int t = arr[0];
                for (int i = 0; i <= arr.length; i++) {
                    if (i == arr.length - 1){
                        arr[i] = t;
                        break;
                    }
                    arr[i] = arr[i + 1];
                }
                pivot--;
            }
        }
        else if(RotationType.RIGHT.equals(rotation_type)){

            while(pivot > 0) {
                int t = arr[arr.length-1];
                for(int i = arr.length-1; i >= 0; i--){
                    if(i == 0){
                        arr[i] = t;
                        break;
                    }
                    arr[i] = arr[i-1];
                }
                pivot--;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        rotateArray(RotationType.LEFT,2,arr);
        int x = 0;
        while(x < arr.length){
            System.out.print(arr[x] + " ");
            x++;
        }
        System.out.println();
        rotateArray(RotationType.RIGHT,2,arr);
        int y = 0;
        while(y < arr.length){
            System.out.print(arr[y] + " ");
            y++;
        }
    }

}

enum RotationType{
    LEFT,RIGHT
}
