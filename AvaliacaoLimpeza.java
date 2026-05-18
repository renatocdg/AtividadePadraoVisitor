public class AvaliacaoLimpeza implements VisitanteSetor {

    @Override
    public void visitar(Armazem armazem) {
        String status = armazem.isOrganizado()
                ? "organizado"
                : "desorganizado";

        System.out.println(
                "Armazém: avaliação de limpeza concluída. "
                        + "Status: " + status
        );
    }

    @Override
    public void visitar(Administrativo administrativo) {
        String status = administrativo.isDocumentosOrganizados()
                ? "documentos organizados"
                : "documentos bagunçados";

        System.out.println(
                "Administrativo: limpeza avaliada. "
                        + status
        );
    }

    @Override
    public void visitar(Frota frota) {
        System.out.println(
                "Frota: limpeza dos veículos avaliada. "
                        + "Quantidade de veículos: "
                        + frota.getQuantidadeVeiculos()
        );
    }

    @Override
    public void visitar(Producao producao) {
        System.out.println(
                "Produção: limpeza do ambiente industrial avaliada. "
                        + "Máquinas: "
                        + producao.getQuantidadeMaquinas()
        );
    }
}