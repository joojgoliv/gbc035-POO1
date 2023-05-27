public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("jao","70202",5000);
        f.aumentaSal(50);
        double x = f.retSal();
        System.out.println(x);
        f.aumentaSal(1000);
        x = f.retSal();
        System.out.println(x);
    }
}