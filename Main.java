import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Setor> setores = new ArrayList<>();

        setores.add(new Armazem(500, true));
        setores.add(new Administrativo(20, false));
        setores.add(new Frota(12, true));
        setores.add(new Producao(30, 8));

        VisitanteSetor inspecaoSeguranca =
                new InspecaoSeguranca();

        VisitanteSetor avaliacaoLimpeza =
                new AvaliacaoLimpeza();

        System.out.println("=== INSPEÇÃO DE SEGURANÇA ===");

        for (Setor setor : setores) {
            setor.aceitar(inspecaoSeguranca);
        }

        System.out.println();

        System.out.println("=== AVALIAÇÃO DE LIMPEZA ===");

        for (Setor setor : setores) {
            setor.aceitar(avaliacaoLimpeza);
        }
    }
}