public class Main {
    public static void main(String[] args) {
        Loja loja1 = new Loja("Loja 1", 9, 2000.00);
        Loja loja2 = new Loja("Loja 2", 10);
        Loja loja3 = new Loja("Loja 3", 31, 1900);

        System.out.println(loja1);
        System.out.println(loja2);
        System.out.println(loja3);

        System.out.println("Gasto com salarios loja 1: R$ " + loja1.gastosComSalario());
        System.out.println("Gasto com salarios loja 2: R$ " + loja2.gastosComSalario());
        System.out.println("Gasto com salarios loja 3: R$ " + loja3.gastosComSalario());
    
        System.out.println("Tamanho loja 1: " + loja1.tamanhoDaLoja());
        System.out.println("Tamanho loja 2: " + loja2.tamanhoDaLoja());
        System.out.println("Tamanho loja 3: " + loja3.tamanhoDaLoja());
    
        Produto produto1 = new Produto("produto 1", 12);
        System.out.println(produto1);

        Endereco endereco = new Endereco("castro alves", "novo hamburgo", "RS", "BR", "93545324", "322", "1");
        System.out.println(endereco);


        Data data1 = new Data(29, 2, 2024);
        System.out.println(data1);

        Data data2 = new Data(30, 2, 2023);
        System.out.println(data2);
    }
}
