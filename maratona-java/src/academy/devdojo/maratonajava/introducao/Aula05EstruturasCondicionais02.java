package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 infantil
        //idade >= 15 && idade < 18 juvenil
        //idade > 18 adulto

        int idade = 12;
        String categoria;
        if (idade < 15) {
            categoria = "Categoria Infantil";   
        }else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoira Adulto";
        }

        categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);
    }
}
