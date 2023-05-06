public class Main {
    public static void main(String[] args) {

        FolhaPagamento x = new FolhaPagamento();
        Funcionario f[] = new Funcionario[10];
        f[0] = new Chefe("joao", "05/3/1998", 5421.2);
        f[1] = new Chefe("joao1", "15/3/1978", 2421.99);
        f[2] = new Vendedor("Pedro", "19/12/1987", 2500, 57, 15);
        f[3] = new Vendedor("Pedro1", "11/2/2000", 2000, 120, 2);
        f[4] = new Operario("Maria", "07/04/1557", 151, 240);
        f[5] = new Operario("Maria1", "01/01/1111", 11, 40);
        f[6] = new Horista("asdf", "5/5/2005", 20.5, 12);

        x.folha(f);
    }
}