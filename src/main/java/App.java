import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        str = sc.nextLine();

   //     printString(str);
        isUppercase(str);

    }

    public static void printString(String str) {
        char kytu;
        for (int i = 0; i < str.length(); i++) {
            kytu = str.charAt(i);
            System.out.print(kytu);
        }
    }

    public static void isUppercase(String str) {
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                dem = dem + 1;
            }
        }
        System.out.format("Chuỗi có %d ký tự in  hoa\n", dem);
    }

}
