import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> c = new ArrayList<>();

        int e = -1;
        String nome, apelido, email, niver, proximidade;
        int grau;
        do{
            System.out.println("Selecione uma das opcoes");
            System.out.println("[1]Add Contato\n[2]Imprimir Contatos\n[3]Imprimir Familiares" +
                    "\n[4]Imprimir Amigos\n[5]Imprimir Colegas de trabalho\n[0]Sair");
            e = sc.nextInt();
            if(e == 1){
                System.out.println("O novo contato eh: \n[1]Familiar" +
                        "\n[2]Amigo\n[3]Colega de trabalho");
                e = sc.nextInt();
                System.out.println("Digite os dados basicos do contato"
                +"\nNome: ");
                sc.nextLine();
                nome = sc.nextLine();
                System.out.println("Apelido: ");
                apelido = sc.nextLine();
                System.out.println("Email: ");
                email = sc.nextLine();
                System.out.println("Niver: ");
                niver = sc.nextLine();

                if(e == 1){
                    System.out.println("Parentesco: ");
                    proximidade = sc.nextLine();
                    c.add(new Familia(nome, apelido, email, niver, proximidade));
                }else if(e == 2){
                    System.out.println("1-Melhores Amigos \n 2-Amigos \n 3-Conhecidos");
                    grau = sc.nextInt();
                    c.add(new Amigos(nome, apelido, email, niver, grau));
                }else if(e == 3){
                    System.out.println("Relacao profissional: ");
                    proximidade = sc.nextLine();
                    c.add(new Trabalho(nome, apelido, email, niver, proximidade));
                }
            }else if(e == 2){
                for(Contato contato : c){
                    System.out.println(contato.imprimirContato());
                }
            }else if(e == 3){
                for(Contato contato : c){
                    if(contato instanceof Familia)
                        System.out.println(contato.imprimirContato());
                }
            }else if(e == 4){
                for(Contato contato : c){
                    if(contato instanceof Amigos)
                        System.out.println(contato.imprimirContato());
                }
            }else if(e == 5){
                for(Contato contato : c){
                    if(contato instanceof Trabalho)
                        System.out.println(contato.imprimirContato());
                }
            }

        }while(e!=0);
    }
}