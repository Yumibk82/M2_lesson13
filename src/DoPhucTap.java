import java.util.LinkedList;
import java.util.Scanner;

public class DoPhucTap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string ");
        String str = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if(list.size()> max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
            for (Character ch :max) {
                System.out.println(ch);
            }
            System.out.println();
        }
    }
}
/* Analyze the time complexity of the program:
+ 01 outer loop = n;
+ 01 inner loop = n-1;
+ 01 simple statement =1;
+ 01 single loop * 01 simple statement = 1;
T(n) = (n * (n-1)) + 1 + 1;
     = O(n^2) + O(n);

 */