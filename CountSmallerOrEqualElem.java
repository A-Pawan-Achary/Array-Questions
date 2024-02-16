public class CountSmallerOrEqualElem {
    public static int Count(int []arr, int key){

        int count=0;
        for(int i=0; i<arr.length; i++){
            if(key >= arr[i]){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int arr[]={2,5,8,12,16,18,22,27,29,31};
        int key=22;
        System.out.println(Count(arr,key));
    }
}