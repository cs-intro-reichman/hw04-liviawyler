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
        for (int index1 = 0; index1 < array1.length; index1++){
            int fromArray = array1[index1];
            boolean inIt = true;
            for (int index2 = 0; index2 < array2.length; index2++){
                if (fromArray == array2[index2]) {
                    inIt = true;
                }
            }
            if (inIt == false) {
                return false;
            }
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
