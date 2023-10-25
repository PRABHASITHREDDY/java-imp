import java.util.Scanner;

public class stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int a[] = new int[n];
        int counter = 0;
        // for(int i=0;i<n;i++){
        //     a[i] = sc.nextInt();
        // }
        while(true){
            System.out.println("enter 1 to push 2 to pop");
            int key = sc.nextInt();
            if(key == 1){
                System.out.println("enter Value to push ");
                 a[counter++] = sc.nextInt();
            }else if(key == 2){
                 a[--counter] = 0;
            }
            for(int i=0;i<counter;i++){
                System.out.println(a[i]);
            }
        }
    }
}
