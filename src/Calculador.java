import java.time.Duration;

public class Calculador {
    private double quantHorasExtrasTotais;

    public double valorHorasExtrasTotalUteis(double salario, double horasMes, double horasExtras) {
        double valorDaHora = salario /  horasMes;
        return (valorDaHora * 1.5) * horasExtras;
    }




}
