package swing;

import java.util.Arrays;

public class ArrayUtil {
    public static <T> T[] combineArrays(T[] arr1, T[] arr2) {
        int length = arr1.length + arr2.length;
        T[] result = Arrays.copyOf(arr1, length);
        
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};

        Integer[] combined = combineArrays(arr1, arr2);

        for (Integer num : combined) {
            System.out.println(num);
        }
    }
}
