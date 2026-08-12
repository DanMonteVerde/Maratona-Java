package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("O dia é Domingo!");
                break;
            case 2:
                System.out.println("O dia é Segunda!");
                break;
            case 3:
                System.out.println("O dia é terça!");
                break;
            case 4:
                System.out.println("O dia é quarta!");
                break;
            case 5:
                System.out.println("O dia é Quinta!");
                break;
            case 6:
                System.out.println("O dia é Sexta!");
                break;
            case 7:
                System.out.println("O dia é Sábado!");
                break;
            default:
                System.out.println("[ERRO]");
                break;
        }

        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Mulher");
                break;
            case 'H':
                System.out.println("Homen");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
