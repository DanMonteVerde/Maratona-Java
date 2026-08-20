package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        float valorCarro = 35000;
        int cont = 1;

        while (cont <= valorCarro) {
            if (valorCarro/cont > 1000) {
                cont++;
            }else{
                break;
            }
        }

        System.out.println("A quantidade de parcelas é: "+cont);

        
    }
}
