import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int counter = 0;
        while(true){
            System.out.print("enter 1 to push 2 to pop : ");
            int key = sc.nextInt();
            if(key == 1){
                System.out.print("enter Value to push : ");
                a[counter++]=sc.nextInt();
            }else if(key == 2){
                for(int i=1;i<counter;i++){
                    b[i-1] = a[i];
                }
                for(int i=0;i<counter-1;i++){
                    a[i]=b[i];
                }
                counter--;
            }else{
                System.out.println("Invalid Value");
                continue;
            }
            for(int i=0;i<counter;i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
