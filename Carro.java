package carro;

public class Carro {
	//atributos
    String nome;
    String marca;
    int ano;
    int vel;
    
    //m�todos
    void acelerar(int acelera��o) {
        vel+=acelera��o;
    }
    
    void freiar(int reduzir) {        
        vel-=reduzir;
    }
    
    void buzinar() {
        System.out.println("bibibi");
    }
}
