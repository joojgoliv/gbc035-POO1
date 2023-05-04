public class Main {
    public static void main(String[] args) {

        aluno a = new aluno("Joao","11921bcc024");
        aluno b = new aluno("Pedro","11958bcc555");
        aluno x = new aluno("Julio", "42ds461fdas");
        professor c = new professor("Tiago","Matematica");
        professor d = new professor("Marcelo", "Biologia");
        professor f = new professor("Maria", "Fisica");

        professor profs[] = new professor[2];
        profs[0]=c;profs[1]=d;
        aluno alunos[] = new aluno[2];
        alunos[0] = a; alunos[1]=b;

        a.addProfessor(profs);
        profs[1]= f;
        b.addProfessor(profs);
        alunos[1] = x;
        c.addAlunos(alunos);


        System.out.println(a.mostraDados());
        System.out.println("/////////////");
        System.out.println(c.mostraDados());
    }
}