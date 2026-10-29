package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
   private  String nome;
   private int idade;
   private double[] salarios = null;
   private double media;

   public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (this.salarios == null) {
            return;
        }

        for (double d : this.salarios) {
            System.out.print(d + " ");
        }

        media();
   }

    public void media(){
        if (this.salarios == null) {
            return ;
        }

        for(double num : this.salarios){
            this.media += num;
        }
        media /= this.salarios.length;
        System.out.println("A média é: " + this.media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    

    




}
