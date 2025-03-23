package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea10UD06App {

	public static void main(String[] args) {
		//Se crea la variable que se guardara como un new int de uno de nuestro metodos
		int[] numeros = new int[dimensionArray()];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		int maximo = 0;
		maximo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor maximo del Array"));
		System.out.println(maximo);
		int minimo = 0;
		minimo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor minimo del Array"));
		System.out.println(minimo);
		valorRandomPrimos(numeros, minimo, maximo);
		

		for (int i = 0; i < numeros.length; i++) {
			if (i == 0) {
				System.out.print( "Los numeros primos son: {[" + i + "] =" + numeros[i] + ", ");
			} else if (i == numeros.length - 1) {
				System.out.print( "[" + i + "] = " + numeros[i] + "}");
			} else {
				System.out.print( "[" + i + "] =" + numeros[i]+ ", ");
			}
		}
	
		//mayo(numeros))
		JOptionPane.showMessageDialog(null, "El numero mayor es: " + buscarMayor(numeros));
	}
	
/*Se creo un metodo para introducir el tamaño del array
 * donde decimos que nos devuelva el valor dimension que es donde se 
 * guardara el valor ingresado por el usuario
 */
	private static int dimensionArray() { // Metodo para ingresar el tamaño del array
		int dimension = 0;
		dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del que quieres el Array"));
		return dimension;
	}
	/* Se crea un metodo para hacer el random
	 * donde le ponemos que sus parametros son un array llamado numero
	 * y 2 enteros los cuales son el maximo y minimo del rango donde 
	 * se sacara el numero random
	 */
	private static void valorRandomPrimos(int[] numeros, int minimo, int maximo) {
		/*mediante bucle for le asignamos a la variable i un valor de 0
		 * y le decimos que mientras sea menos que el numero de array se itere
		 * y decimos que esa iteracion se guardara en numeros con el entero i que es
		 * el valor del array. Y le diremos que este array es igual a 
		 * el valor del metodo que crearemos para sacber cual es el numero
		 * primo o no
		 */
		for (int i = 0; i < numeros.length; i++) { //El error estaba en que se ponia <= y era < que length
			numeros[i] = numPrimo(minimo, maximo);

		}
	}
	/*Se crea el metodo para iterar y crear la operacion
	 * aritmetica para sacar el random.
	 *  mediante un bucle que le dira que itere
	 *  mientras el numero random que nos da el metodo anterior
	 *   sea primo o en este caso sea true
	 */
	private static int numPrimo(int minimo, int maximo) { // En este metodo sacaremos el numero primo
		int num = 0;
		boolean esPrimo = false;
		while (!esPrimo) { //Se crea un bucle ya que el condicional no aplicaria las iteraciones que necesitamos
			//para que me de el random en solo numeros primos 
			num = (int) (Math.random() * (maximo - minimo + 1) + minimo);
			esPrimo = esPrimo(num); //true o false
		}
		return num;
	}
/* Metodo boolean para determinar si es primo o no
 * DEcimos que ela variable primosino es true y el valor es menor o igual a 1
 * es false y nos debe devolver primosino
 */
	public static boolean esPrimo(int valorPrimo) {
		boolean primoSiNo = true;
		if (valorPrimo <= 1) {
			primoSiNo = false;
			return primoSiNo;
		} 
		/* Mediante un bucle for le decimos que calcule el numero primo 
		y lo itere. Y SI el valor dividido entre 2 es igual que 0
		este sera false y nos debe retornar la variable primosino
		Cumpliendo el bucle este nod devuelve primoSino que seria true
		*/
		for (int i = 2; i <= Math.sqrt(valorPrimo); i++) {
			if (valorPrimo % i == 0) {
				primoSiNo = false;
				return primoSiNo;
			}
		}
		return primoSiNo;
	}
/* Metodo para buscar el valor mayor
 * Asignaremos un entero donde mediante un bucle for le decimos que
 * el entero dentro del bucle es igual a 0 este debe ser menor que 
 * el array numeros y SI el array es mayor que el entero creado diremos que 
 * el entero es igual al array y nos debe devolver la varible mayor.
 */
	private static int buscarMayor(int[] numeros) {
		int mayor = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		return mayor;
	}
}
