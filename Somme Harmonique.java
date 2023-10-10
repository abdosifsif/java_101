package java_101;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		float r=0,i=0;
		int n=0;
		Scanner s = new Scanner(System.in);
		System.out.println("donnez un nombre n :");
		n = s.nextInt();
		while (n==0) {
		System.out.println("svp donnez un nombre difference a 0");
		n = s.nextInt();
		}
			while(i!=n) {
				i++;
				r=r+1/i;
			}
			System.out.println("la somme des "+n+" premiers termes de la 'serie harmonique' est: "+r);
	}

}
