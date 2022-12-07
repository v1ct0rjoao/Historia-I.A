
class Capitulo {

    String nome;
    String texto;
    String escolha1;
    String escolha2;
    Personagem personagem;
    int ModificadorDeEnergia;

    int Resposta;

    public Capitulo(String NomeDoCapitulo, String TextoDoCapitulo, String Escolha1DoCapitulo,
            String Escolha2Docapitulo, Personagem PersonaDoCapitulo, int AlteracaoDeEnergiaDoCapitulo) {
        this.nome = NomeDoCapitulo;
        this.texto = TextoDoCapitulo;
        this.escolha1 = Escolha1DoCapitulo;
        this.escolha2 = Escolha2Docapitulo;
        this.personagem = PersonaDoCapitulo;
        this.ModificadorDeEnergia = AlteracaoDeEnergiaDoCapitulo;
    }

    public void Mostrar() {

        System.out.println(nome);
        System.out.println(texto);

        if (this.ModificadorDeEnergia > 0) {
            this.personagem.ModificadorDeEnergia(this.ModificadorDeEnergia);

        }

        System.out.println();
        System.out.println(escolha1);
        System.out.println();
        System.out.println(escolha2);
    }

}