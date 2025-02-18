package UD04JavaBasic;

public class OperadorRelacionesApp {

	public static void main(String[] args) {
		
		int op1=10;
		
		int op2=20;
		
		int op3=10;
		
		boolean result;
		
		result = op1==10 && op2<30;
		// ¿es 10 igual que 10 y es menor que 30? resultado =true
		
		result = op1!=30 || op3==15;
		// ¿Es 10 distinto a 30 o es igual a 10? resultado = true
		
		result = op1!=30 || op3==15 ;
		// ¿es 10 igual que 10 y es 20 menos que 30 o es 10 mayor o igual que 15? resultado = true
				

	}

}
