import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int []arr={1,2,3,3,3,0,1,4,8,4,7,2,1,7};
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            int index=arr[i];

            if(arr[index]<0)
            System.out.print(index + " ");

            arr[index]= -arr[index];
        }
    }
}
