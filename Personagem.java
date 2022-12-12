
public class Personagem {

    String Nome;
    int Coragem;

    public Personagem(String NomeDosoldado, int EnergiaDoSoldado) {
        this.Nome = NomeDosoldado;
        this.Coragem = 100;
    }

    public void ModificadorDeEnergia(int EnergiaNojogo) {

        this.Coragem = Coragem + EnergiaNojogo;

        if (Coragem > 100) {
            Coragem = 100;
        }

        if (Coragem < 0) {
            Coragem = 0;

        }

        if (Coragem == 0) {
            System.out.println();
            System.out.println(Nome
                    + " não resisti e perde toda sua vida");
        }

    }

}
