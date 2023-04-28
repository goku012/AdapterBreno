public class ClassificacaoAdapter extends ClassificacaoIdade {

    private IClassificacao classificacaoIndicativa;

    public ClassificacaoAdapter(IClassificacao classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String recuperarClassificacao() {
        if (this.getIdadeIndicada() >= 18)
            classificacaoIndicativa.setClassificacao("R");
        else
        if (this.getIdadeIndicada() >= 13)
            classificacaoIndicativa.setClassificacao("PG-13");
        else
        if (this.getIdadeIndicada() >= 7)
            classificacaoIndicativa.setClassificacao("PG");
        else
            classificacaoIndicativa.setClassificacao("G");
        return classificacaoIndicativa.getClassificacao();
    }

    public void salvarClassificacao() {
        if (classificacaoIndicativa.getClassificacao().equals("R"))
            this.setIdadeIndicada(18);
        else
        if (classificacaoIndicativa.getClassificacao().equals("PG-13"))
            this.setIdadeIndicada(13);
        else
        if (classificacaoIndicativa.getClassificacao().equals("PG"))
            this.setIdadeIndicada(7);
        else
            this.setIdadeIndicada(0);
    }
}