import javax.swing.SpringLayout;

public class Personagem {

    String Nome;
    int Coragem;

    public void CriarPersonagem(String NomeDosoldado, int EnergiaDoSoldado) {
        this.Nome = NomeDosoldado;
        this.Coragem = 100;
    }

    public void ModificadorDeEnergia(String Nome, int EnergiaNojogo) {

        this.Coragem = Coragem - EnergiaNojogo;
        this.Nome = Nome;
        ;

        if (Coragem < 100) {
            System.out.println();
            System.out.println(Nome + " não Resistiu a pressão do teste, recebeu: " + EnergiaNojogo
                    + " de dano psicologico, agora tem: "
                    + Coragem + " de Coragem");
        }

        if (Coragem > 100) {
            Coragem = 100;
        }

        if (Coragem < 0) {
            Coragem = 0;

        }

        if (Coragem == 0) {
            System.out.println();
            System.out.println("Para " + Nome
                    + " o teste se torna exaustivo e atingi o fatalmente a mente do soldado, infelizmente não suportou e foi desqualificado");
        }

    }

}
