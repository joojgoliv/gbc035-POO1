public class Main {
    public static void main(String[] args) {

        Funcionario a = new Funcionario("Mateus");
        Funcionario b = new Funcionario("Tiago");
        Funcionario c = new Funcionario("Maria");
        Funcionario d = new Funcionario("Pedro");
        Departamento x = new Departamento("Financeiro");
        Departamento y = new Departamento("RH");

        a.defDepartamento(x);
        b.defDepartamento(x);
        c.defDepartamento(x);
        x.addFunc(a);x.addFunc(b);x.addFunc(c);
        d.defDepartamento(y);
        y.addFunc(d);

        System.out.println(a.mostraDados());
        System.out.println("--------------------------");
        System.out.println(x.mostraDados());
        System.out.println("--------------------------");
        System.out.println(y.mostraDados());

    }
}