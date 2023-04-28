public class ClassificacaoIndicativa implements IClassificacao {

    private String indicacao;

    @Override
    public String getClassificacao() {
        return this.indicacao;
    }

    @Override
    public void setClassificacao(String indicacao) {
        this.indicacao = indicacao;
    }
}
