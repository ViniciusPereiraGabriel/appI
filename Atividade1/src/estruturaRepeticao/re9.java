
package estruturaRepeticao;

public class re9 {
    public static void main(String[] args) {
        int contador = 0;
        int multiplicador = 1;
        
        while(multiplicador <= 10){
            System.out.println("tabuada do "+multiplicador + ":");
            while(contador <=10){
                System.out.println(multiplicador*contador);
                System.out.println(" ");
                contador++;
            }
            
            System.out.println();
            multiplicador++;
            contador = 0;
        }
    }
}
