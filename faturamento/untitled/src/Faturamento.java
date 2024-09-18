import java.util.ArrayList;
import java.util.List;

public class Faturamento {

    public static void main(String[] args) {
        double[] faturamento = {
                31490.7866, 37277.9400, 37708.4303, 0.0000, 0.0000, 17934.2269, 0.0000,
                6965.1262, 24390.9374, 14279.6481, 0.0000, 0.0000, 39807.6622, 27261.6304,
                39775.6434, 29797.6232, 17216.5017, 0.0000, 0.0000, 12974.2000, 28490.9861,
                8748.0937, 8889.0023, 17767.5583, 0.0000, 0.0000, 3071.3283, 48275.2994,
                10299.6761, 39874.1073
        };

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        int diasComFaturamento = 0;

        List<Double> diasAcimaDaMedia = new ArrayList<>();

        for (double valor : faturamento) {
            if (valor > 0.0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaFaturamento = somaFaturamento / diasComFaturamento;

        int diasAcimaMedia = 0;
        for (double valor : faturamento) {
            if (valor > 0.0 && valor > mediaFaturamento) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Média de faturamento: " + mediaFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaMedia);
    }
}