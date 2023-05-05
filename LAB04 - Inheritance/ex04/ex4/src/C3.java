public class C3 extends C2{
    public int z;
    private int x;
    protected int c;

    public C3(){
        System.out.println(  "Classe C3: chamada do construtor padrao, sem parametros");
    }
    public C3(int a, int s, int d,int z, int x, int c){
        super(a,s,d);
        this.z = z;
        this.c = c;
        this.x = x;
        System.out.println(  "Classe C3: chamada do construtor com parametros"
        );
    }

    public void mostrarAtributos(){
        System.out.println("\nC3: "+z+x+c);
    }
    public void mostrarAtributosSuper(){
        super.mostrarAtributosSuper();
        System.out.println("\nC3: "+z+x+c);
    }
}
