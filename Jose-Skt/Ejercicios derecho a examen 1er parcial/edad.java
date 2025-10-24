import java.util.*;
public class edad {
	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	int a=0, b=0;
	System.out.println("Ingrese el año de nacimiento");
	a =sc.nextInt();
	b=2025-a;
	System.out.println("Tiene " +b+ " años");
}
}