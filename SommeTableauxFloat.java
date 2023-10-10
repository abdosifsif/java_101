package java_101;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		float []T1;
		float[] T3;
		float[] T2;
		T1 = new float [5];
		T2 = new float [5];
		T3 = new float [T1.length];
		Scanner s = new Scanner(System.in);
		System.out.println("Remplissez T1 avec 5 floats ");
		for (int j = 0; j < T2.length; j++) {
			T1[j]=s.nextFloat();
		}
		//show the cases of T1
		for (int j = 0; j < T1.length; j++) {
			System.out.print(T1[j]+":");
		}
		System.out.println();
		System.out.println("Remplissez T2 avec 5 floats ");
		for (int j = 0; j < T2.length; j++) {
			T2[j]=s.nextFloat();
		}
		//show the cases of T2
		for (int j = 0; j < T2.length; j++) {
			System.out.print(T2[j]+":");
		}
		System.out.println();
//		filling T3
		for (int j = 0; j < T3.length; j++) {
			T3[j]=T1[j]+T2[j];
		}
		//show the cases of T3
		System.out.println("l'affichage de T3:");
		for (int j = 0; j < T3.length; j++) {
			System.out.print(T3[j]+":");
		}
	}

}			
