import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n,number,numberB=0,numberS=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Tane Sayı Gireceksiniz ? : ");
        n=input.nextInt();

        for (int i =1;i <=n;i++){
            System.out.print(i+".Sayıyı Giriniz : ");
            number=input.nextInt();

            if (numberS==0 || numberB==0){
                numberB=number;
                numberS=number;
            }
            if (number>numberB){
                numberB=number;
            }else if (number < numberS){
                numberS=number;
            }


        }
       System.out.println("En Büyük Sayı : " + numberB);
        System.out.println("En Küçük Sayı : " + numberS);

    }
}
