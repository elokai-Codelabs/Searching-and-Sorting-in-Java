import java.util.ArrayList;

public class LinearSearch{
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int find(ArrayList<Integer> a, Integer target) {
        int found = -1;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).equals(target)) {
                found = i;
                break;
            }
        }
        return found;
    }
}