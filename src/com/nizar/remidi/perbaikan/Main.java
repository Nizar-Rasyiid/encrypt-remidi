package com.nizar.remidi.perbaikan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = " ", pText=" ";
        System.out.printf("Masukkan Kata");
        pText = input.nextLine();
        word= cipher(pText);
       // newWord = deCipher(word);

        System.out.printf("Hasil: %n" + word);


        //pText=deCipher(word);

     //   System.out.printf("%n%nCipher Text: %s%n" + "PlainText: %s%n"+word,pText);

    }

    public static String cipher(String pText){
        String word = " ";
        for (int i =0; i < pText.length(); i++){
            char code = Character.toLowerCase(pText.charAt(i));
            switch (code){
                case 'a':
                    word += "g";
                    break;
                case 'b':
                    word += "h";
                    break;
                case 'c':
                    word += "i";
                    break;
                    case 'd':
                    word += "j";
                    break;
                    case 'e':
                    word += "k";
                    break;
                    case 'f':
                    word += "l";
                    break;
                    case 'g':
                    word += "m";
                    break;
                    case 'h':
                    word += "n";
                    break;
                    case 'i':
                    word += "o";
                    break;
                    case 'j':
                    word += "p";
                    break;
                    case 'k':
                    word += "q";
                    break;
                    case 'l':
                    word += "r";
                    break;
                    case 'm':
                    word += "s";
                    break;
                    case 'n':
                    word += "t";
                    break;
                    case 'o':
                    word += "u";
                    break;
                    case 'p':
                    word += "v";
                    break;
                    case 'q':
                    word += "w";
                    break;
                    case 'r':
                    word += "x";
                    break;
                    case 's':
                    word += "y";
                    break;
                    case 't':
                    word += "z";
                    break;
                    case 'u':
                    word += "a";
                    break;
                    case 'v':
                    word += "b";
                    break;
                    case 'w':
                    word += "c";
                    break;
                    case 'x':
                    word += "d";
                    break;
                    case 'y':
                    word += "e";
                    break;
                    case 'z':
                    word += "f";
                    break;
                default:
                    word += pText.charAt(i);
                    break;
            }
        }
        return word;
    }
}
