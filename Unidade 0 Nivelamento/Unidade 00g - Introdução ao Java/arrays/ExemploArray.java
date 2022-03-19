/*FAZER PROGRAMA QUE LE NOTA E NOME DE 5 ALUNOS E MOSTRE NA TELA O NOME DAQUELES QUE FICAREM
ACIMA DA MEDIA DO GRUPO */

public class ExemploArray
{
    public static void main(String[] args)
    {
        int numAlunos = 5;
        String[] nome = new String[numAlunos];
        double[] nota = new double[numAlunos];
        double soma = 0, media;
        int i = 0;
        
        
        //Entrada de Dados
        for (i = 0; i < numAlunos; i++)
        {
            //Obter nome dos alunos
            MyIO.println("Digite o nome do aluno:");
            nome[i] = MyIO.readLine();
            //Obter nota dos alunos
            MyIO.println("Digite a nota do aluno:");
            nota[i] = MyIO.readDouble();

            soma += nota[i];
        }

        media = soma / numAlunos;

        MyIO.println("MÉDIA DA TURMA: ");
        MyIO.println(media);

        MyIO.println("Aqui estão os alunos com média superior a turma\n");

        for (i = 0; i < numAlunos ; i++)
        {
            if (nota[i] > media)
            {
                MyIO.println(nome[i]);
            }
        }
        

       
    }

}
