package aula33.tarefaHospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void addPaciente(ArrayList<Paciente> Pacientes){
        Scanner ler = new Scanner(System.in);
        Paciente p1 = new Paciente();
        System.out.print("Insira o nome do paciente: ");
        String nome = ler.nextLine();
        p1.setNome(nome);
        System.out.print("Insira o sobrenome do paciente: ");
        String sobrenome = ler.nextLine();
        p1.setSobrenome(sobrenome);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.now();
        boolean valida;
        do {
            System.out.print("Insira a data de nascimento no formato (dd/MM/aaaa): ");
            String dataStr = ler.next();
            try{
                data = LocalDate.parse(dataStr,formato);
                valida = true;
            }
            catch (DateTimeParseException e){
                System.out.println("Formato inválido!"+e);
                valida = false;
            }
        } while (!valida);
        p1.setDataNascimento(data);
        Pacientes.add(p1);
    }
        //Fazendo
//    public static void modificarPaciente(ArrayList<Paciente> Pacientes){
//        Scanner ler = new Scanner(System.in);
//        System.out.print("Por favor, insira o nome do paciente: ");
//        String nome = ler.nextLine();
//        for ( int i = 0; i < Pacientes.size(); i++)
//
//        System.out.println(index);
//    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Paciente> Pacientes = new ArrayList<>(10);
        char op;
        do {
            System.out.println("Sistema de Hospital:");
            System.out.println("A - Adicionar membro");
            System.out.println("L - Lista Pacientes");
            System.out.println("M - Modificar paciente");
            System.out.println("S - Sair");
            System.out.print("Opção: ");
            op = ler.next().toLowerCase().charAt(0);
            switch (op){
                case 'a' -> {
                    addPaciente(Pacientes);
                }
                case 'l' -> {
                    System.out.println();
                    for (Paciente paciente:Pacientes)
                        System.out.println(paciente);
                }
                case 'm' -> {
//                    modificarPaciente(Pacientes);
                }
                case 's' -> System.out.println("Saindo...");
            }
        } while (op != 's');
    }
}
