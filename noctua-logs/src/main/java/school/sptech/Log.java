package school.sptech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
    private Double valorCpu;
    private Double valorRam;
    private Double valorDisco;
    private String nivelCpu;
    private String nivelRam;
    private String nivelDisco;
    private LocalDateTime dataHora;

    //Construtor cheio
    public Log(Double valorCpu, Double valorRam, Double valorDisco, LocalDateTime dataHora) {
        this.valorCpu = valorCpu;
        this.valorRam = valorRam;
        this.valorDisco = valorDisco;
        this.dataHora = dataHora;
        this.nivelCpu = calcularNivel(valorCpu);
        this.nivelRam = calcularNivel(valorRam);
        this.nivelDisco = calcularNivel(valorDisco);
    }

    private String calcularNivel(Double valor) {
        return (valor >= 90.0) ? "(CRÍTICO)        " : (valor >= 70.0) ? "(ATENÇÃO)        " : "(EM CONFORMIDADE)";
    }

    public void exibirLog() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.printf("LOG %s - CPU: %.1f%% %s | RAM: %.1f%% %s | DISCO: %.1f%% %s \n",
                dataHora.format(formatador),
                valorCpu, nivelCpu,
                valorRam, nivelRam,
                valorDisco, nivelDisco);
    }

}
