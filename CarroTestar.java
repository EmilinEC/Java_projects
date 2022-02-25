package carro;

public class CarroTestar {

	public static void main(String [] args) {
		
        Carro c1 = new Carro();
        
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2012;
        c1.vel = 60;

        c1.acelerar(10);

        System.out.println("velocidade: " + c1.vel + "km/h");
        
        c1.freiar(30);
        
        System.out.println("velocidade: " +c1.vel + "km/h");
        
      

	}

}
