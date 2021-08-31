public class Gladiador {
    private String nome;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public Gladiador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCidade() {
        return cidade;
    }

    public Gladiador setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    /*Exemplo de testes rápido*/
    public static void main(String[] args){
        Gladiador gladiador = new Gladiador();
        gladiador.setCidade("Veneza").setNome("Gudoi");
    }

}
