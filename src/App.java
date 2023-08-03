public class App {
    public static void main(String[] args) throws Exception {
        Byte a = 120; // apaneas armazena numeros de -128 a 127.
        short b = 140; // pode armazenar nao sei quantos.
        int c = 1520; // pode armazenar um número do caralho.
        long d = 102012; //maior ainda mas nao é tao famoso,se tentar usar vai dar merda,pois ele
        // tentarias o traduzir para tipo int ja que o mesmo é o padrao ppppppatterna  aaaa.
        char e = 'e'; // esse aqui armazena apenas um espaço por vez em forma de texto,seja 
        // caracteres especiais,numeros ou letras(entre aspas).
        String f = "miguell"; // o tipo string nao é primitivo e nao se diferencia so nisso,
        // com ele você precisa usar aspas duplas para se diferenciar do tipo "char" e tambem 
        // precisa começá-lo com letras maiuscula.
        boolean g = true; // o boolean aqui,difere do python,sendo usado com letra minuscula,
        // afinal,todas se diferenciam do python nisso,menos o tipo int,apesar de ser abreviado.
        // besides,nothing else special.
        double h = 157157157.157157157; // o tipo double vai se diferenciar do tipo float na 
        // quantidade de caracteres depois, da virgula,no caso do double sao varios numeros que 
        // podem vir depois da virgula,diferente do tipo float.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
