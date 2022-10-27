import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, nPassword;
        int select;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız");
        } else
            System.out.print("Bilgileriniz Yanlış.\nŞifrenizi sıfırlamak için 1 e basınız :");
        select = Integer.parseInt(inp.nextLine());
        if (select == 1) {
            System.out.print("Yeni şifrenizi giriniz :");
            nPassword = inp.nextLine();
            if ((nPassword.equals("java123")) || (nPassword.equals(password))) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            } else {
                System.out.println("Şife Oluşturuldu");
            }
        } else {
            System.out.println("Şifreniz sıfırlanmadı.");
        }


    }
}




