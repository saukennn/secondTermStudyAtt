
class Lerint {
    //PROGRAMA QUE LEIA N NUMEROS INTEIROS, CALCULA MEDIA DESSES VALORES E A EXIBE
    public static void main(String[] args) {
        int valor, contador = 0, n, media = 0;

        n = MyIO.readInt();

        while (contador < n) {
            valor = MyIO.readInt();
            media += valor;
            contador++;
        }

        media /= n;

        MyIO.println(media);
    }
}