package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario  = 6000;
        String msgDoar = "Eu vou doar 500 pro DevDojo";
        String msgNaoDoar = "Ainda não tenho condições, mas vou ter!";

        String result = salario > 5000 ? msgDoar : msgNaoDoar;
        
        boolean possoComprar = salario > 5000 ? true : false;



        System.out.println(result);

    }
}
