import java.util.*;
public class Metros2 {
   	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	double m=0, pies=0.3048, inch=0.0254, rp=0, ri=0;
	System.out.println("Introduzca los metros a convertir a pies y pulgadas");
	m = sc.nextDouble();
	rp=m*pies;
	ri=m*inch;
	System.out.println("Los metros son iguales a " +rp+  " pies\n Y en pulgadas son iguales " +ri+ " pulgadas");
}
}
