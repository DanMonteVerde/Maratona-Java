package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Fusca";
        carro.ano = 1969;
        carro.modelo = "Sport"; 

        System.out.println("Nome: "+carro.nome+" Modelo: "+carro.modelo + " Ano: "+carro.ano);

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.ano = 1980;
        carro2.modelo = "Quadrado";

        System.out.println("Nome: "+carro2.nome+" Modelo: "+carro2.modelo + " Ano: "+carro2.ano);

        carro = carro2;

        System.out.println("Nome: "+carro.nome+" Modelo: "+carro.modelo + " Ano: "+carro.ano);
        System.out.println("Nome: "+carro2.nome+" Modelo: "+carro2.modelo + " Ano: "+carro2.ano);

    }
}
  