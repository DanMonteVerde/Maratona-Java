package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
   public String nome;
   public int idade;
   public double[] salarios = null;

   public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (this.salarios == null) {
            return;
        }

        for (double d : this.salarios) {
            System.out.println(d);
        }

        media();
   }

    public void media(){
        if (this.salarios == null) {
            return ;
        }

        float soma = 0;
        for(double num : this.salarios){
            soma += num;
        }
        System.out.println("A média é: " + soma/this.salarios.length);
    }


}
