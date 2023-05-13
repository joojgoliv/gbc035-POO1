public class ContaEspecial extends ContaCorrente{
    float limite;

    public ContaEspecial ( float val , int num , int pwd, float limite ) {
        super(val, num, pwd);
        testaLimite(limite);
    }
    private void testaLimite(float limite){
        if(limite < 0)
            System.out.println("Limite nao eh valido");
        if(limite == 0) {
            ContaComum c = new ContaComum(super.saldo, super.numConta, super.senha);
        }
        else
            this.limite = limite;
    }
    public boolean debitaValor ( float val , int pwd ) {
        if ( pwd != senha )
            return ( false ); // senha deve ser válida
        if ( estado != 1 )
            return ( false ); // conta deve ser ativa
        if ( val <= 0 )
            return ( false ); // val > 0
        if ( val > saldo )
            return ( false );

        saldo -= val ;
        return ( true ) ;
    }
}
