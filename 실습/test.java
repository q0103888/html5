package 실습;
import java.util.Scanner;
public class test{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("정수 2개를 입력해주세요");
		a = input.nextInt();
		b = input.nextInt();
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else if(a == b){
		    System.out.println("==");
        }
        System.out.println("안녕하세여");
    }

}