public class Aula02_Operadoras{
    public static void main(String[]args){
        double nota1 = 8.5;
        double nota2 = 4.0;
        double media = (nota1 + nota2)/2;
        System.out.println("media das nota" + media);

        boolean passou= media>= 7.0;
        boolean presencaMinima = true;
        boolean aprovadoFinal = passou && presencaMinima;
        System.out.println("o aluno foi aprovado?" + aprovadoFinal);

    }
}