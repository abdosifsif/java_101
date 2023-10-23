package tp;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

        System.out.print("Donner le taux de TVA pour tous les articles :");
        float t = s.nextFloat();
        Article.TauxTVA=t;
        System.out.println("Le taux TVA est:"+t+"%");
        Article A1 =new Article();
        System.out.print("Article 1:");
        A1.AfficherArticle();
        System.out.println("Article 2:");
        System.out.print("Donner la référence:");
        int r = s.nextInt();
        System.out.print("Donner la désignation:");
        String d  = scn.nextLine();
        System.out.print("Donner le prix HT:");
        float p = s.nextFloat();
        Article A2 = new Article (r,d,p,t);
        A2.AfficherArticle();
        System.out.println("Article 3:");
        System.out.print("Donner la référence:");
        int r3 = s.nextInt();
        System.out.print("Donner la désignation:");
        String d3  = scn.nextLine();
        Article A3 = new Article(r3, d3);
        A3.AfficherArticle();
        Article A4 = new Article(A2);
        System.out.println("Article 42:");
        A4.AfficherArticle();
        

    }
    
}
