import java.util.*;
public class Main {

	public static void main(String[] args) {
		int i=0,r=0;
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("donnez un nombre positif");
			r= s.nextInt();
			if (r==0) {
				break;
			} else if (r<0) {
				System.out.println("svp positif");
			}else {
				System.out.println("sa racine carrée est : "+Math.sqrt(r));
			}
		}
	}

}