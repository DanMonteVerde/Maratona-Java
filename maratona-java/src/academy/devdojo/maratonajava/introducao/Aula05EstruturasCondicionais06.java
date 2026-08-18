package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dado os valores de de 1 a 7, imprima se é dia util ou final de semana
        //Considerando 1 como domingo
                byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("O dia é Domingo - Final de semana!");
                break;
            case 2:
                System.out.println("O dia é Segunda - Dia util!");
                break;
            case 3:
                System.out.println("O dia é terça - Dia util!");
                break;
            case 4:
                System.out.println("O dia é quarta - Dia util!");
                break;
            case 5:
                System.out.println("O dia é Quinta - Dia util!");
                break;
            case 6:
                System.out.println("O dia é Sexta - Dia util!");
                break;
            case 7:
                System.out.println("O dia é Sábado - Final de semana!");
                break;
            default:
                System.out.println("[ERRO]");
                break;
        }
    }
}
