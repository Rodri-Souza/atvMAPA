import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		int num1 = scan.nextInt();
        
		System.out.println("Informe outro número:");
		int num2 = scan.nextInt();

    scan.close();

		int res = num1 + num2;
		System.out.println("A soma entre os números é: " + res);
    }
    
}

