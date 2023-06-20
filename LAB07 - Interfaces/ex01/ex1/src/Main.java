public class Main {
    public static void main(String[] args) {
        Produtos p[] = new Produtos[5];
        int i=0;
        p[0] = new Produtos(134,15);
        p[1] = new Produtos(78, 248);
        p[2] = new Produtos(95, 45);
        p[3] = new Produtos(11, 12);
        p[4] = new Produtos(27,168);
        Produtos pr[] = (Produtos[]) Produtos.Ordena(p);
        System.out.println("O vetor ordenado: ");
        while(i <pr.length){
            System.out.println(pr[i].getCodigo());
            i++;
        }

        Servicos s[] = new Servicos[5];
        s[0] = new Servicos(13.5, "A");
        s[1] = new Servicos(17.25, "B");
        s[2] = new Servicos(46.40, "C");
        s[3] = new Servicos(81.0, "D");
        s[4] = new Servicos(64.5, "E");
        Servicos sr[] = (Servicos[]) Servicos.Ordena(s);
        System.out.println("O vetor ordenado: ");
        i = 0;
        while(i < sr.length){
            System.out.println(sr[i].getPreco());
            i++;
        }

        Clientes c[] = new Clientes[5];
        c[0] = new Clientes("Joao", "1645645645");
        c[1] = new Clientes("Maria", "12312318");
        c[2] = new Clientes("Pedro", "7897897895");
        c[3] = new Clientes("Ana", "375312789");
        c[4] = new Clientes("Paulo", "15966734");
        Clientes cr[] = (Clientes[]) Clientes.Ordena(c);
        System.out.println("O vetor ordenado: ");

        i = 0;
        while(i < sr.length){
            System.out.println(cr[i].getNome());
            i++;
        }

    }
}