import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1,9,4.5,6.6,5.7,-4.5};
        selectionSort(list);
            System.out.println((Arrays.toString(selectionSort(list))));
        }
    public static double[] selectionSort(double[] list){
        for (int i = 0; i < list.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < list.length; j++) {
                if(list[j]<list[minIndex]){
                    minIndex =j;

                    double temp=list[minIndex];
                    list[minIndex]=list[i];
                    list[i]=temp;
                }
            }
        }
        return list;
    }
}
