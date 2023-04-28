public class Filme {

    IClassificacao classificacao;
    ClassificacaoAdapter persistencia;

    public Filme() {
        classificacao = new ClassificacaoIndicativa();
        persistencia = new ClassificacaoAdapter(classificacao);
    }

    public void setClassificacao(String indicacao) {
        classificacao.setClassificacao(indicacao);
        persistencia.salvarClassificacao();
    }

    public String getClassificacao() {
        return persistencia.recuperarClassificacao();
    }

    // Método apenas para mostrar que está convertendo a classificação indicativa para a idade através do adaptador
    public int getIdadeIndicada() {
        return persistencia.getIdadeIndicada();
    }

}