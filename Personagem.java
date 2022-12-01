public class Personagem {

    String Nome;
    int Energia;

    public void CriarPersonagem(String NomeDosoldado, int EnergiaDoSoldado) {
        this.Nome = NomeDosoldado;
        this.Energia = 100;
    }

    public void ModificadorDeEnergia(int EnerguiaNoJogo) {

        this.Energia = Energia + EnerguiaNoJogo;

        if (Energia < 100) {
            System.out.println("Não Resistiu as pressões tomou: " + EnerguiaNoJogo + " de dano psicologico");
        }

        if (Energia > 100) {
            Energia = 100;
        }

        else if (Energia < 0) {
            Energia = 0;
            System.out.println("A pressão do teste tomou do Soldado e infelizmente não consegui prosseguir");
        }

    }

}
