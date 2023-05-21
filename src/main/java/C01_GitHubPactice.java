import java.util.List;
import java.util.Scanner;

public class C01_GitHubPactice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli kelime");
        String s = scan.next();

        String str = "";
        //1.Way forloop cozum

        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            //  str = str + s.substring(i, i+1);


            System.out.print(ch);

        }
        //  System.out.println(str);

        System.out.println();

        //2.Way stringbuilder

        StringBuilder sbl = new StringBuilder(s);
        System.out.println(sbl.reverse());


        System.out.println("***************");

        List<String> lst =  List.of(s.split(""));
        // lst.stream().map(StringBuilder::reverse()).forEach(System.out::print);




        // kullanicidan adini soyadini alin ve krefdi karti bilgilerini alin asagidaki gibi yazdirin

        //  M***** S*****
        //  **** **** **** 1234

        System.out.println("Adini soyadinizi girin");
        String bos = scan.nextLine();
        String adSoyad = scan.nextLine();
        System.out.println("banka kart nosunu giirn");
        String bankKart = scan.nextLine();


        String yeniAd = (adSoyad.split(" ")[0].substring(0,1).toUpperCase() )+ (adSoyad.split(" ")[0].substring(1).replaceAll("[A-Za-z]","*" ));
        String yeniSoyad = (adSoyad.split(" ")[1].substring(0,1).toUpperCase() )+ (adSoyad.split(" ")[1].substring(1).replaceAll("[A-Za-z]","*" ));

        String yeniBankKart = "**** **** ****  " + bankKart.substring(bankKart.length()-4);

        System.out.println(yeniAd + " " + yeniSoyad + "\n" + yeniBankKart);

        // System.out.println(yeniAd + " " + yeniSoyad );
    }
}

