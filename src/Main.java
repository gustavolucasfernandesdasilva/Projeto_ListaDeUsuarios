import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opçao = 0;
        int total = 0;
        String[] nome = new String[5];
        String[] cidade = new String[5];
        String[] cpf = new String[5], idade = new String[5];


        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("----------------------------------------------");
            System.out.println("...........interface do usuario..............");
            System.out.println("----------------------------------------------");
            System.out.println("1 - registrar usuario ");
            System.out.println("2 - consultar usuario ");
            System.out.println("3 - deseja encerrar a secessao ?");
            System.out.println("----------------------------------------------");

            System.out.println("qual opçao selecionar ?");
            opçao = ler.nextInt();
            ler.nextLine();

            if (opçao == 1) {

                if (total < 5) {
                    System.out.println("qual e o seu nome ?");
                    nome[total] = ler.nextLine();
                    System.out.println("qual e o seu cpf?");
                    cpf[total] = ler.nextLine();
                    System.out.println("qual a cidade aonde vc mora ?");
                    cidade[total] = ler.nextLine();
                    System.out.println("qual a sua idade?");
                    idade[total] = ler.nextLine();

                    total++;

                    System.out.println("registrado com sucesso");
                    System.out.println("prazer em te conhecer  seja bem vindo ao nosso sistema ");

                } else {
                    System.out.println("espaço cheios");
                }
            } else if (opçao == 2) {

                if (total == 0) {
                    System.out.println(" ninguem encontrado");
                } else {

                    System.out.println("Digite o nome");
                    String busca = ler.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < total; i++) {
                        if (nome[i].equalsIgnoreCase(busca)) {

                            System.out.println("Usuario encontrado :");

                            System.out.println(" Cpf  : " + cpf[i]);
                            System.out.println(" Nome  : " + cidade[i]);
                            System.out.println(" idade  : " + idade[i]);

                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("usuario nao encontrado");
                    }
                }
            }
        }while (opçao != 3) ;
            System.out.println("encerrando o sistema");
            ler.close();
    }
}
