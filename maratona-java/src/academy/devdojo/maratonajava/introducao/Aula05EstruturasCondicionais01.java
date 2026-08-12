package academy.devdojo.maratonajava.introducao;
public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade>=18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode vender bebida alcoólica.");
        }else{
            System.out.println("Não pode vender bebida.");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não pode vender bebida alcoólica.");
        }
        System.out.println("Fora do If");
    }
}
