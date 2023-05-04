public class Main {
    public static void main(String[] args) {
        Empresa x = new Empresa("Uber");
        x.addDep();
        x.addDep();
        System.out.println(x.mostraDados());
    }
}