/* Faça um programa que abre um arquivo e cria uma cópia */

import java.io.*;
import java.io.File;

class ExercicioSlide13{
    public static void main(String[] args) {
        //Cria e abre arquivo exemplo.txt
        Arq.openWrite("exemplo.txt");
        //Cria string que copiara dados escritos em exemplo.txt
        String str = MyIO.readString("Insira dados para serem copiados em outro arquivo\n");
        //Enquanto existir caracteres no arquivo adicioná-la a string
        while (Arq.hasNext() == true) {
            str += Arq.readChar();
        }
        //Fecha arquivo
        Arq.close();
        //Cria e abre arquivo copia.txt
        Arq.openWrite("copia.txt");
        //Escreve o que esta armazenado na string no arquivo copia.txt
        Arq.print(str);
        //Fecha arquivo copia.txt
        Arq.close();
    }
}