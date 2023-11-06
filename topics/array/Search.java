public class Search {
    public static void main(String[] args) {
        int[] arr = {1,12,34,56,14,57,88,99};
        int key = 88;
        System.out.println(LS(arr, key));
        System.out.println(BS(arr, key));
    }
    public static int LS(int[] arr, int key){
        // O(n)
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key) return i;
        }
        return -1;
    }
    public static int BS(int[] arr, int key){
        // O(logn)
        int start = 0;
        int end = arr.length - 1;
        int mid = -1;
        
        while(start <= end){
            mid = start + (end - start) / 2;
            
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return mid;
    }
}
