import java.util.Scanner;
public class recursiveuslma {
    static int power(int a, int b){
        int result = 1;
        for (int i=1; i<=b;i++){
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs giriniz: ");
        int b = input.nextInt();
        power(a,b);
        System.out.print("Sonuç :"+power(a,b));
    }
}
