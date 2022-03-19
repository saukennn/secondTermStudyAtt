//Faça um programa que leia N numeros e mostre o maior elemento do array

class ExemploArray3 {

    public static void main(String[] args) {
        //Variáveis
        double maior;
        int n = 0;
        //Pedir ao usuario quantidade posições no array
        MyIO.println("Insira a quantidade de numeros que voce vai inserir: ");
        n = MyIO.readInt();
        //Declarando Array
        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            MyIO.println("Insira um numero: ");
            vet[i] = MyIO.readDouble();    
        }

        maior = vet[0];

        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }

        MyIO.println("Maior: " + maior);


    }




























}