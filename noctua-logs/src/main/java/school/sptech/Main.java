package school.sptech;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<Log> historicoLogs = new ArrayList<>();

        //Gerando 30 logs
        for (int i = 0; i < 30; i++) {
            LocalDateTime data = LocalDateTime.now().minusMinutes(ThreadLocalRandom.current().nextInt(1, 60));
            Double valorCpu = ThreadLocalRandom.current().nextDouble(30, 99);
            Double valorRam = ThreadLocalRandom.current().nextDouble(30, 99);
            Double valorDisco = ThreadLocalRandom.current().nextDouble(30, 99);

            historicoLogs.add(new Log(valorCpu, valorRam, valorDisco, data));

        }

        //Exibindo o histórico com for-each
        System.out.println("Histórico de Logs------------------------------------------------------------------------------------------------------");
        for (Log log : historicoLogs) {
            log.exibirLog();
        }
    }
}
