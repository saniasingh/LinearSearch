public class LineraSearchDemo {

    public static int linearSearch(int[] arr, int key, int size) {
        for (int i=0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main (String a[]) {
        int array[] = { 101, 20, 35, 6, 701, 90 };
        int size = array.length;
        int keyElement = 6;
        int position = linearSearch(array, keyElement, size);
        if(position==-1) {
            System.out.println("Element is not found in the given array");
        } else {
            System.out.println("Element is found at " + position);
        }
    }
    
}
