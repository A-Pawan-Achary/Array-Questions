import java.util.Arrays;

public class BinarySearch {
    public static int Search(int []arr,int key){
        int low=0,high=arr.length-1,mid=0;

        while(low <= high){
            mid=(low+high)/2;
            if(key == arr[mid]){
                return mid;
            }else if(key < arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={11,1,21,33,5,8,12,13};
        Arrays.sort(arr);
        
        System.out.println(Search(arr, 33));
        
    }
}
