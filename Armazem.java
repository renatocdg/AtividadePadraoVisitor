public class Armazem implements Setor {

    private int quantidadeProdutos;
    private boolean organizado;

    public Armazem(int quantidadeProdutos, boolean organizado) {
        this.quantidadeProdutos = quantidadeProdutos;
        this.organizado = organizado;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public boolean isOrganizado() {
        return organizado;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}