/* Faça um método que receba um array de inteiros e um
número inteiro x e retorne um valor booleano informando se o
elemento x está contido no array */

class ex1slide2 {

    public static boolean retornaBool(int n, int[] vet, int num)  {

        boolean controle = false;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == num) {
                controle = true;
            }
        }        

        return controle;
    }

    public static void main(String[] args) {
        
        int n = MyIO.readInt("Insira quantos numeros\n");
        int[] vet = new int[n];
        int num;
        boolean resp;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = MyIO.readInt("Insira valor para PREENCHER o array\n");
        }

        num = MyIO.readInt("Insira um valor para PESQUISAR no array\n");

        resp = retornaBool(n, vet, num);
        
        MyIO.println(resp);
    }

}
