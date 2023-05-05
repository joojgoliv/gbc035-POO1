public class Main {
    public static void main(String[] args) {

        C1 c1= new C1(1,2,3);
        C2 c2=new C2(4,5,6);
        C3 c3=new C3(2,3,4,7,8,9);

        c3.mostrarAtributos();
        c3.mostrarAtributosSuper();
        System.out.println("\n____________________________________");
        c2.mostrarAtributos();
        c2.mostrarAtributosSuper();
        System.out.println("\n____________________________________");
        c1.mostrarAtributos();
        c1.mostrarAtributosSuper();
        System.out.println("\n____________________________________");

    }
}