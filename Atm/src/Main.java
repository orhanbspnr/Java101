import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;
        Scanner input = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && (password.equals("java123"))) {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoş Geldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para mikatrı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2 :
                            System.out.print("Para mikatrı : ");
                            price = input.nextInt();
                            if(price > balance){
                                System.out.println("Yetersiz bakiye !");
                            }else{
                            balance -=price;
                            }
                            break;
                        case 3 :
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı ve şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }

    }
}