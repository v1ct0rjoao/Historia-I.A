import java.util.ArrayList;
import java.util.Scanner;

class Capitulo {

   //====================================Atributos de classe=======================================//
    String nome;
    String texto;
    ArrayList<Escolha> escolhas; //agora aqui passa a ser uma objeto de escolha que tem texto e proximo capitulo
    Personagem personagem;
    int ModificadorDeEnergia;
   
   //====================================Construtor=======================================//
    public Capitulo(String NomeDoCapitulo, String TextoDoCapitulo, Personagem PersonaDoCapitulo,
     int AlteracaoDeEnergiaDoCapitulo)

    {
        this.nome = NomeDoCapitulo;
        this.texto = TextoDoCapitulo;
        this.personagem = PersonaDoCapitulo;
        this.ModificadorDeEnergia = AlteracaoDeEnergiaDoCapitulo;
        this.escolhas = new ArrayList<Escolha>();
    }
   //====================================Metodo de mostrar o capitulo=======================================//

    public void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println();
   //--------------------------------Verificar se tem algo no array------------------------------//
        if(this.escolhas != null)
        {

         for (Escolha escolha : escolhas) {
         System.out.println(" --> " + escolha.texto);
         }

        }
        
   //--------------------------------Mudança de energia------------------------------//
        if (ModificadorDeEnergia > 0)
         {
            this.personagem.ModificadorDeEnergia(ModificadorDeEnergia);
        }
    }

    //====================================Metodo de escolher no texto=======================================//

    public int escolher() {
        
       Scanner leitor = new Scanner(System.in);
       int verificado = -1;
   
       if(escolhas != null)
      {
         while(verificado == -1)
         {
             System.out.println("Resposta: ");
            String Resposta = leitor.next();

            for(int i = 0 ; i < escolhas.size(); i++ ) 
            {
              if(Resposta.equals(escolhas.get(i).texto))
              {
               verificado = i;
               }
            }
         }      
      }
             return verificado;
   }
}