
package condicionalif;

public class if5 {
    public static void main(String[] args) {
        double livroLinux;
        double livroBancos;
        
        livroLinux = 58.60;
        livroBancos = 56.75;
        
        double total = livroLinux + livroBancos;
        System.out.println("O preço total é "+total);
        
        if(total<120){
            System.out.println("O preço está bom");
        }else{
            System.out.println("O preço está salgado");
        }
    }
 
}
