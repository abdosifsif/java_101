


public class Article {
        private int Référence ;
        private String Désignation ;
        private float PrixHT;
        public static float  TauxTVA;
    
    public  Article (){
        Référence = 0;
        Désignation = "";
        PrixHT =0;
        
        
        
    }
     public Article (int r,String d,float p,float t){
        Référence = r;
        Désignation = d;
        PrixHT =p;
     }
     public  Article(int r , String d){
         Référence=r;
         Désignation = d;
         PrixHT =0;
     }
     public  Article (Article A){
        Référence = A.Référence;
        Désignation = A.Désignation;
        PrixHT =A.PrixHT;
        
        
    }
     public float CalculerPrixTTC(){
         return  PrixHT +(PrixHT*TauxTVA/100);
     }
     public void AfficherArticle() {
         System.out.println("Référence :"+Référence);
         System.out.println("Désignation :"+Désignation);
         System.out.println("PrixHT :"+PrixHT);
         System.out.println("Le prix TTC est "+CalculerPrixTTC());

 
     }
     
}
