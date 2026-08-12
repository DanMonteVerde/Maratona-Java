package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;
        double valorApagar;

        if (salario >= 0 && salario <= 34712) {
            valorApagar = salario * 0.097;
        }else if (salario >= 34713 && salario <= 68507) {
            valorApagar = salario * 0.3735;
        }else{
            valorApagar = salario * 0.495;
        }
        System.out.println(valorApagar);
    }
}
