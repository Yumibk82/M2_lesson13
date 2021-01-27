import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size");
        int size = input.nextInt();
        int[] list = new int[size];

        System.out.println("Enter "+list.length);
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("List is ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int k = 0; k <list.length&&needNextPass; k++) {
                needNextPass = false;
            for (int i = 0; i < list.length-1; i++) {
                if(list[i]>list[i+1]){
                    System.out.println("Swap "+list[i]+" with "+list[i+1]);
                int temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;

                needNextPass = true;
                }
            }
            if(needNextPass ==false){
                System.out.println("List after sort the "+k);
                for (int j = 0; j < list.length; j++) {
                    System.out.println(list[j]);
                }
                System.out.println();
            }
        }

    }
}
