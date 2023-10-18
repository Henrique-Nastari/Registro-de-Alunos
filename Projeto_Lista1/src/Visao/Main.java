package Visao;
import Dominio.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        Scanner entradas = new Scanner(System.in);

        int op;

        do {
            System.out.println("---------------------------------------------------------\n" +
                    "MENU PRINCIPAL \n" +
                    "---------------------------------------------------------\n" +
                    "1 - CADASTRAR ALUNOS \n" +
                    "2 - CADASTRAR NOTAS \n" +
                    "3 - CALCULAR MÉDIAS \n" +
                    "4 - INFORMAR SITUAÇÕES \n" +
                    "5 - INFORMAR DADOS DE UM ALUNO \n" +
                    "6 - ALTERAR NOTA \n" +
                    "7 - SAIR \n" +
                    "---------------------------------------------------------\n");

            op = entradas.nextInt();

            if(op == 1){
                System.out.println("Digite nome");
                a1.setNome(entradas.nextLine());
                entradas.nextLine();
                System.out.println("Digite matricula");
                a1.setMatricula(entradas.nextInt());

                System.out.println("Digite nome");
                a2.setNome(entradas.nextLine());
                entradas.nextLine();
                System.out.println("Digite matricula");
                a2.setMatricula(entradas.nextInt());

                System.out.println("Digite nome");
                a3.setNome(entradas.nextLine());
                entradas.nextLine();
                System.out.println("Digite matricula");
                a3.setMatricula(entradas.nextInt());

            } if (op == 2) {
                System.out.println("Digite nota 1: ");
                float n1 = entradas.nextFloat();
                System.out.println("Digite nota 2:");
                float n2 = entradas.nextFloat();
                System.out.println("Digite nota 3:");
                float n3 = entradas.nextFloat();
                a1.setNotas(n1, n2, n3);

                System.out.println("Digite nota 1: ");
                float n4 = entradas.nextFloat();
                System.out.println("Digite nota 2:");
                float n5 = entradas.nextFloat();
                System.out.println("Digite nota 3:");
                float n6 = entradas.nextFloat();
                a2.setNotas(n4,n5,n6);

                System.out.println("Digite nota 1: ");
                float n7 = entradas.nextFloat();
                System.out.println("Digite nota 2:");
                float n8 = entradas.nextFloat();
                System.out.println("Digite nota 3:");
                float n9 = entradas.nextFloat();
                a3.setNotas(n7,n8,n9);
            }

            if (op == 3){
                System.out.println("Media a1: " + a1.getMedia());
                System.out.println("Media a2: " + a2.getMedia());
                System.out.println("Media a3: " + a3.getMedia());
            }

            if (op == 4){
                System.out.println("A situacao do aluno a1 é: "+ a1.getSituacao());
                System.out.println("A situacao do aluno a2 é: "+ a2.getSituacao());
                System.out.println("A situacao do aluno a3 é: "+ a3.getSituacao());
            }

            if (op == 5){
                System.out.println("Digite qual aluno: " + "\n" + a1.getNome() + "\n" + a2.getNome() + "\n" + a3.getNome());
                int aux = entradas.nextInt();
                if (aux == 1){
                    System.out.println("Nome: " + a1.getNome() + "   " + a1.getMatricula() + "   " + a1.getSituacao());
                } if (aux == 2){
                    System.out.println("Nome: " + a2.getNome() + "   " + a2.getMatricula() + "   " + a2.getSituacao());
                } if (aux == 3){
                    System.out.println("Nome: " + a3.getNome() + "   " + a3.getMatricula() + "   " + a3.getSituacao());
                }
            }

            if (op == 6){
                System.out.println("Digite qual aluno: " + "\n" + a1.getNome() + "\n" + a2.getNome() + "\n" + a3.getNome());
                int aux = entradas.nextInt();
                if (aux == 1){
                    System.out.println("Digite qual cod voce quer: ");
                    int cod = entradas.nextInt();
                    System.out.println("Digite o valor da nova nota: ");
                    float valor = entradas.nextFloat();
                    a1.alterarNota(cod, valor);
                } if (aux == 2){
                    System.out.println("Digite qual cod voce quer: ");
                    int cod = entradas.nextInt();
                    System.out.println("Digite o valor da nova nota: ");
                    float valor = entradas.nextFloat();
                    a2.alterarNota(cod, valor);
                } if (aux == 3){
                    System.out.println("Digite qual cod voce quer: ");
                    int cod = entradas.nextInt();
                    System.out.println("Digite o valor da nova nota: ");
                    float valor = entradas.nextFloat();
                    a3.alterarNota(cod, valor);
                }
            }

        } while (op != 7);
        System.out.println("Encerrou");


    }
}