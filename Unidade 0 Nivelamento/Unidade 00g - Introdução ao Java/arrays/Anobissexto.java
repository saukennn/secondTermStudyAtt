
class Anobissexto {
    public static void main(String[] args){
        MyIO.println("Insira um ano:");
        int ano = MyIO.readInt();

        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
            MyIO.println("O ano " + ano + " eh bissexto");
        } else {
            MyIO.println("O ano " + ano + " nao eh bissexto");
        }
    }
}