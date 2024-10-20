import java.util.Scanner;

public class M1_02_Pedro_Castellano_Gonzalez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operacion1, operacion2, operacion3, operacion4;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca 3 numeros enteros:");
		
		int numero1=teclado.nextInt(), numero2=teclado.nextInt(), numero3=teclado.nextInt();
		
		operacion1=numero1*numero2/numero3;
		operacion2=(numero1*numero2)%numero3;
		operacion3=2*(numero1+numero3-numero2)/(numero2*numero3);
		operacion4=((numero1*numero3)+(numero2%numero1))/numero1-numero3;
		
		teclado.close();
		
		System.out.println("la operacion 1 da como resultado:"+operacion1);
		System.out.println("la operacion 2 da como resultado:"+operacion2);
		System.out.println("la operacion 3 da como resultado:"+operacion3);
		System.out.println("la operacion 4 da como resultado:"+operacion4);
		
		

	}

}
