package Projeto01;

import java.util.Scanner;

/**
 * Criar Algoritmo para recever as notas de 5 alunos de 4 bimestres
 * a freq. do aluno e apresentar o resultado final considerando
 * média >=7 e freq. >= 75%
 */

public class NotasEscolaresVM {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String alunos[][] = new String[5][2];
        float notas[][] = new float[5][6];
        System.out.println("Notas Escolares 2");
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º aluno: ");
            alunos[i][0] = ler.next();
            for (int j = 0; j < 4; j++) {
                System.out.print("Informe a " + (j + 1) + "ª nota: ");
                notas[i][j] = ler.nextFloat();
                notas[i][5] += notas[i][j];
            }
            notas[i][5] = notas[i][5] / 4;
            System.out.print("Digite a frequencia do aluno " + alunos[i][0] + ": ");
            notas[i][4] = ler.nextFloat();
            if (notas[i][4] < 75) {
                alunos[i][1] = "Reprovado por faltas";
            } else if (notas[i][5] < 7) {
                alunos[i][1] = "Reprovado por média";
            } else {
                alunos[i][1] = "Aprovado";
            }
            System.out.println("");
            
        }
        System.out.println("Resultados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("O aluno "+alunos[i][0]+" teve a média de "+notas[i][5]+" e foi "+alunos[i][1]+".");
        }
        System.out.println("Sistema de notas encerrado");
        System.out.println("Alterado no VS online");
        System.out.println("Teste de push");
    }
}
