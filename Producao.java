public class Producao implements Setor {

    private int quantidadeMaquinas;
    private int nivelRisco;

    public Producao(int quantidadeMaquinas, int nivelRisco) {
        this.quantidadeMaquinas = quantidadeMaquinas;
        this.nivelRisco = nivelRisco;
    }

    public int getQuantidadeMaquinas() {
        return quantidadeMaquinas;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}