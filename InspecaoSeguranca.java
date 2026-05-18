public class InspecaoSeguranca implements VisitanteSetor {

    @Override
    public void visitar(Armazem armazem) {
        System.out.println(
                "Armazém: inspeção de segurança realizada. "
                        + "Quantidade de produtos: "
                        + armazem.getQuantidadeProdutos()
        );
    }

    @Override
    public void visitar(Administrativo administrativo) {
        System.out.println(
                "Administrativo: verificação de segurança documental. "
                        + "Funcionários: "
                        + administrativo.getQuantidadeFuncionarios()
        );
    }

    @Override
    public void visitar(Frota frota) {
        System.out.println(
                "Frota: inspeção de veículos realizada. "
                        + "Manutenção em dia: "
                        + frota.isManutencaoEmDia()
        );
    }

    @Override
    public void visitar(Producao producao) {
        System.out.println(
                "Produção: inspeção de segurança industrial. "
                        + "Nível de risco: "
                        + producao.getNivelRisco()
        );
    }
}