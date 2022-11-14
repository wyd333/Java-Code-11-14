import java.util.Scanner;

public class AddTenNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入若干个数，每输入一个数由回车确认，以数字0结束操作");
        int sum = 0;
        int input = 0;
        do {
            input = reader.nextInt();
            sum += input;
        }while(input != 0);
        System.out.println(sum);
    }
}
