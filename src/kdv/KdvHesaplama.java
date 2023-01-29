package kdv;
        import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double prb,prb2,prb3,KDV;

        System.out.print("Ürünün Fiyatını Giriniz :  ");
        prb = sc.nextDouble();

        KDV = 0.18;
        prb2 = prb * KDV;
        prb3 = prb2 + prb ;


        System.out.println("Ürün Fiyatı :" + prb);
        System.out.println("KDV :  " + KDV );
        System.out.println("KDV tutarı :" + prb2);
        System.out.println("KDV'li tutar :" + prb3);


    }
}
