package aula31.exercicios.sistemaPagamento;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome do funcionário: ");
        String nome = ler.nextLine();
        System.out.println("Qual o salário base: ");
        float salarioBase = ler.nextFloat();
        FuncionarioComissionado f1 = new FuncionarioComissionado(nome, salarioBase);
        f1.processarPagamento();
    }
}
