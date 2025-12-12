import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class ObterDados {
    Scanner sc = new Scanner(System.in);
    Calculador calc = new Calculador();

    public void obter(){
        System.out.println("Que horas você inicia no trabalho - 00:00");
        String inicio = sc.nextLine();
        System.out.println("Que horas você finaliza no trabalho - 00:00");
        String fim = sc.nextLine();

        LocalTime horaEntrada =  LocalTime.parse(inicio);
        LocalTime horaSaida =  LocalTime.parse(fim);

        // Calcular diferença

        Duration duracao = Duration.between(horaEntrada, horaSaida);
        double horasMes = duracao.toHours() * 20;

        long horas =  duracao.toHours();
        long minutos = duracao.toMinutes() % 60;

        System.out.println("Total de horas trabalhadas por dia: "+horas+":"+String.format("%02d",minutos)+" horas");
        System.out.println("Total de horas mensais: "+horasMes);

        System.out.println("\n-----------------------------------------");
        System.out.println("Digite o seu salario: ");
        double salario = sc.nextDouble();
        sc.nextLine();


        System.out.println("Digite o valor total de horas extras trabalhadas no mes: ");
        double valorHorasExtras = sc.nextDouble();
        sc.nextLine();

        System.out.println("Valor a receber:  ");
        System.out.println("-----------------------------------------");
        System.out.println("R$ "+calc.valorHorasExtrasTotalUteis(salario,horasMes,valorHorasExtras));


    }
}
