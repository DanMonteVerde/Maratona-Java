package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new  Funcionario();
        funcionario.nome = "Neymar";
        funcionario.idade = 31;
        funcionario.salarios = new double[]{1500, 1500, 1500};

        funcionario.imprime();
    }
}
