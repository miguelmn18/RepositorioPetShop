public enum ValorServicoTosa {

    PEQUENO(30), MEDIO(PEQUENO.getValor() + 10),GRANDE(PEQUENO.getValor() + 20);


    private final int valor;

    ValorServicoTosa(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao (){
        return "Pequeno, médio e grande";
    }
}
