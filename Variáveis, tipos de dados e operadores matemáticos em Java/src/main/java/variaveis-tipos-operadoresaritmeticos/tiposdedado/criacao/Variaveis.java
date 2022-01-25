package criacao;

public class Variaveis {

    public static void main(String[] args) {

        int i;
        int I;
        // int 1a; não podemos começar variáveis com números
        int _1a; //evitar esse tipo de nomenclatura
        int $aq; //evitar esse tipo de nomenclatura

        //atribuindo valores para essas variáveis
        i = 10;
        I = 7;
        _1a = 20;
        $aq = 40;

        final int j = 10;   //essa variável não pode ter seu valor alterado
        //j = 16;           isso gera um erro de compilação pois j é final
        //int a73hs 78      não podemos ter espaços na nomenclatura
        int a73hs_78 = 20;  // não é uma boa prática
        //int a73hs%78      não podemos ter % na nomenclatura de variáveis

        int quantidadeProduto = 50;         //boa prática
        int QuantidadeProduto = 12;         //não é uma boa prática
        final int NUMERO_TENTATIVAS = 5;    //boa prática para final
        final int numeroTentativas = 5;     //possível, mas não é uma boa prática
        int QUANTIDADE_OPCOES = 12;         //não é uma boa prática

        System.out.println("i: "+i);
        System.out.println("I: "+I);
        System.out.println("_1a: "+_1a);
        System.out.println("$aq: "+$aq);
        System.out.println("j: "+j);
        System.out.println("a73hs_78: "+a73hs_78);
        System.out.println("quantidadeProduto: "+quantidadeProduto);
        System.out.println("QuantidadeProduto: "+QuantidadeProduto);
        System.out.println("NUMERO_TENTATIVAS: "+NUMERO_TENTATIVAS);
        System.out.println("numeroTentativas: "+numeroTentativas);
        System.out.println("QUANTIDADE_OPCOES: "+QUANTIDADE_OPCOES);


    }

}
