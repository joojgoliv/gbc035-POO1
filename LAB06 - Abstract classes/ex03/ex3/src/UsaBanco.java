public class UsaBanco {
    ContaEspecial c1 = new ContaEspecial(800,2245, 1,0);
    ContaEspecial c2 = new ContaEspecial(1000,2236,1234,1500);
    ContaEspecial c3 = new ContaEspecial(2500,2217,1478,1230);

    public void Modifica(){
        c1.debitaValor(954,1);
        c2.debitaValor(1500,1234);
        c3.debitaValor(154,1478);

        System.out.println("Conta 1: ");
        c1.mostraDados();

        System.out.println("Conta 2: ");
        c2.mostraDados();

        System.out.println("Conta 3: ");
        c3.mostraDados();
    }
}
