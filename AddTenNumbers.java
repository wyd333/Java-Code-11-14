import java.util.Scanner;

public class AddTenNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("���������ɸ�����ÿ����һ�����ɻس�ȷ�ϣ�������0��������");
        int sum = 0;
        int input = 0;
        do {
            input = reader.nextInt();
            sum += input;
        }while(input != 0);
        System.out.println(sum);
    }
}
