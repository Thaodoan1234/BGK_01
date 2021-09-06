import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        str = sc.nextLine();

   //     printString(str);
        isUppercase(str);
        toTitleCase(str);
        System.out.println(toTitleCase(str));
        System.out.println(toTitle(str));


    }

    //xuất chuỗi
    public static void printString(String str) {
        char kytu;
        for (int i = 0; i < str.length(); i++) {
            kytu = str.charAt(i);
            System.out.print(kytu);
        }
    }

    // số ký tự in hoa trong chuỗi
    public static void isUppercase(String str) {
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                dem = dem + 1;
            }
        }
        System.out.format("Chuỗi có %d ký tự in  hoa\n", dem);
    }

    // viết hoa chữ cái đầu của từ trong chuỗi
    public static String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    // viết hoa ký tự đầu của chuỗi
    public static String toTitle(String s) {
        String s1 = s.substring(0,1).toUpperCase();
        String sTitle = s1 + s.substring(1);
        return sTitle;
    }



}
