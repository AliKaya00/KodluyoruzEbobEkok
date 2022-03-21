import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        int a, b ,ebob = 1, ekok =1;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a number: ");
        a= input.nextInt();
        System.out.println("Insert another number: ");
        b=input.nextInt();
        int k = a;

        while (k<=a && k<=b){
            if (a%k==0 && b%k==0){
                ebob=k;
                ekok= (a*b)/ebob;
                break;
            }
            k--;

        }
        System.out.println("Ebob: " + ebob + "\nEkok: " + ekok);

    }
}
