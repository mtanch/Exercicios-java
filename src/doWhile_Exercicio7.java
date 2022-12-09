import java.util.Scanner;
public class doWhile_Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("---SUM OF ODD AND EVEN---");
		System.out.println("\nHow many numbers will be entered: \n");
		Integer tamanhoDaMatriz = entrada.nextInt();
		Integer[] matriz = new Integer[tamanhoDaMatriz];
		Integer sumEven = 0;
		Integer sumOdd = 0;
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		Integer[] even = new Integer[10];
		Integer[] odd = new Integer [10];
		
		System.out.println("enter the numbers: ");
		
		do {
			matriz[i] = entrada.nextInt();
			
			Boolean moduloPar = (matriz[i] % 2 == 0);
			
			if (moduloPar) {
				even[i] = matriz[i];
			} else {
				odd[i] = matriz[i];
			}
			
			i++;
		} while (i < matriz.length);
		
		do {
			
			if (even[j] == null) {
				even[j] = 0;
			}
			sumEven += even[j];
			
			j++;
			
		} while (j < even.length);
		
		do {
			
			if (odd[k] == null) {
				odd[k] = 0;
			}
			sumOdd += odd[k];
			
			k++;
			
		} while (k < odd.length);
		
		System.out.println(sumEven);
		System.out.println(sumOdd);
		
		entrada.close();
	}
}

//int number;
//char choice;
//int evenSum = 0;
//int oddSum = 0;
//
//do
//{
//    System.out.print("Enter the number ");
//    number = console.nextInt();
//
//    if( number % 2 == 0)
//    {
//        evenSum += number;
//    }
//    else
//    {
//        oddSum += number;
//    }
//
//    System.out.print("Do you want to continue y/n? ");
//    choice = console.next().charAt(0);
//    
//}while(choice=='y' || choice == 'Y');
//
//System.out.println("Sum of even numbers: " + evenSum);
//System.out.println("Sum of odd numbers: " + oddSum);

//		Write a program that reads a set of integers, and then prints the sum of the even and odd integers.