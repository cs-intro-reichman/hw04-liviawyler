public class ArrayOps {
    public static void main(String[] args) {
    
        int[] testCase1 = {1, 0, 3};

       System.out.println(findMissingInt(testCase1)); 
    }
    
    public static int findMissingInt (int [] array) {

        int n = array.length;
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int index = 0; index < array.length; index++){
                if (array[index] == i) {
                    found = true; 
                }
            }
            if (found == false) {
                return i;
            }
            }
            return -1;
        }

     
    public static int secondMaxValue(int [] array) {
        int largest, secondLargest;

        largest = secondLargest = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }
        }
        return secondLargest;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int n = array1.length;
        int m = array2.length;
 
        for (int i = 1; i < n; i++ ) { // first array check
           for (int j = 0; j < m; j++) { // second array check
            if (array1[i] == array2[j]) {
                break;
            }
            else if (j == (m - 1)) {
                return false;
            }
           }
        }
      
        for (int j = 1; j < m; j++ ) { // first array check
            for (int i = 0; i < n; i++) { // second array check
             if (array2[j] == array1[i]) {
                 break;
             }
             else if (i == (n - 1)) {
                 return false;
             }
            }
         }
        return true;
    }
        for (int index1 = 0; index1 < array2.length; index1++){
            int fromArray = array2[index1];
            boolean inIt = true;
            for (int index2 = 0; index2 < array1.length; index2++){
                if (fromArray == array1[index2]) {
                    inIt = true;
                }
            }
            if (inIt == false) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSorted(int [] array) {

        if (array.length <= 1) {
            return true;
        }
    
        boolean increaseOrDecrease = array[0] < array[1];

        for (int i = 1; i < array.length; ++i) {
            if (increaseOrDecrease) {
                if (array[i - 1] > array[i]) {
                    return false;
                }
            } else {
                if (array[i - 1] < array[i]) {
                    return false;
                }
            }
        }
        return true;
    }

}
