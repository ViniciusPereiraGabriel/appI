/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comParametro;

public class Parametro {
    private int n1 , n2;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
 
    int calcularatributo(int resposta){
        
       this.setN1(10);
       this.setN2(20);
       
       return (this.n1 + this.n2)/resposta;
       
    }
}
