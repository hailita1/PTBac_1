import java.util.Scanner;

public class PTBac_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Phuong trinh bac nhat da nhap la y= " + a + "x " + b + " = 0");
        if (a==0){
            System.out.println("Phuong trinh vo so nghiem");
        }
        if (b == 0) {
            System.out.print("x = "+0);
        }
        if (b != 0){
            System.out.print("x = "+-b/a);
        }
    }
}
