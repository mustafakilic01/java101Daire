import java.util.Scanner;
public class daireCevreAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yarıcap,merkezacı;
        double pisayısı, dilimalan;
        pisayısı = 3.14;

        //Kullanıcıdan yarı çapın değerini ve merkez açısının ölçüsünü istemeliyiz.
        System.out.print("Hesaplanmasını istediğiniz dairenin YARI ÇAPI'nı giriniz: ");
        yarıcap = input.nextInt();
        System.out.print("Hesaplanmasını istediğiniz dairenin MERKEZ AÇISININ ÖLÇÜSÜ'nü giriniz: ");
        merkezacı = input.nextInt();

        //Hesaplanacak olan Pİ sayısı kullanıcıya belirtilmeli.
        System.out.println("Hesaplamada kullanılan Pİ sayısı değeri: " + pisayısı);

        //Kullanıcıdan alınan değerler ile artık formül üzerinden hesaplamayı yapmalıyız.
        dilimalan = (pisayısı*(yarıcap*yarıcap)*merkezacı) / 360;

        //BUlunan alanın ekrana yazdırılması.
        System.out.println("<<<<< Daire Diliminin Alanı >>>>>>");
        System.out.println("--------" + dilimalan + "---------");

    }
}
