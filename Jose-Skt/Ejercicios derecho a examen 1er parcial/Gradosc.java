import java.util.*;
public class Gradosc {
	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	double c=0, f=0, k=0;
	System.out.println("Ingrese los grados centigrados que se encuentran");
	c =sc.nextDouble();
	k=c+273.15;
	f=(c*1.8)+32;
	System.out.println("Los grrados C a Fahrenheit son: " +f+ "\nY en temperatura absoluta son: "+k );
}
}