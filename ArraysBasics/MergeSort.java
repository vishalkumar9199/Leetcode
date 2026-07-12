import java.util.*;
public class MergeSort {
    public static int[]merge(int[]arr1,int[]arr2){
        int[]merged=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int index=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                merged[index]=arr1[i];
                index++;
                i++;
            }else{
                merged[index]=arr2[j];
                index++;
                j++;
            }
        }
        while(i<arr1.length){
            merged[index]=arr1[i];
            index++;
            i++;
        }
        while(j<arr2.length){
            merged[index]=arr2[j];
            index++;
            j++;
        }
        return merged;
    }
    public static int[]mergeSort(int[]arr){
        if(arr.length==1) return arr;
        int midIndex=arr.length/2;
        int[]left=mergeSort(Arrays.copyOfRange(arr, 0, midIndex));
        int[]right=mergeSort(Arrays.copyOfRange(arr, midIndex, arr.length));

        return merge(left, right);
    }
    public static void main(String[] args) {
         int[]arr1={1,3,8,3,47,78,90,100,12,45};
         int[]ans=mergeSort(arr1);
         System.out.println(Arrays.toString(ans));
    }
}
