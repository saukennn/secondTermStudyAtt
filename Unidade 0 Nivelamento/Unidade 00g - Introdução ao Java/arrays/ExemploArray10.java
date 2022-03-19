/* Faça um programa para ler um número inteiro N e N elementos de um
array. Em seguida, calcular e mostrar o número de elementos pares e o de
divisíveis por três. */

class ExemploArray10 {
    public static void main(String[] args) {
      int n = MyIO.readInt("Inserir valor inteiro\n");
      int[] vet = new int[n];
      int pares = 0;
      int divisivel3 = 0;
  
      for (int i = 0; i < vet.length ; i++){
        vet[i] = MyIO.readInt("inserir valor\n");
      }
  
      for (int i = 0; i < vet.length ; i++){
        if (vet[i] % 2 == 0){
          pares++;
        }
         if (vet[i] % 3 == 0){
           divisivel3++;
         } 
      }
  
      MyIO.println("Pares: " + pares + "\n" + "Divisivel por 3: " + divisivel3);
        
    }
  }