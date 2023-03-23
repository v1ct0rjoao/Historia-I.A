import java.util.ArrayList;
import java.util.Scanner;

class Capitulo {

   //====================================Atributos de classe=======================================//
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas; //agora aqui passa a ser uma objeto de escolha que tem texto e proximo capitulo
    private Personagem personagem;
    private int ModificadorDeEnergia;
   
   //====================================Construtor=======================================//
    public Capitulo(String NomeDoCapitulo, String TextoDoCapitulo, 
    Personagem PersonaDoCapitulo,
     int AlteracaoDeEnergiaDoCapitulo)

    {
        this.nome = NomeDoCapitulo;
        this.texto = TextoDoCapitulo;
        this.personagem = PersonaDoCapitulo;
        this.ModificadorDeEnergia = AlteracaoDeEnergiaDoCapitulo;
        this.escolhas = new ArrayList<Escolha>();
    }
   //====================================Metodo de mostrar o capitulo=======================================//

    private void mostrar() {

      
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println();

   //--------------------------------Verificar se tem algo no array------------------------------//
      
        if(this.escolhas.size() > 0)
        {
         for (Escolha escolha : escolhas) {
         System.out.println(" --> " + escolha.getTexto());
         }

   //--------------------------------Mudança de energia------------------------------//
        if (ModificadorDeEnergia > 0)
         {
            this.personagem.ModificadorDeEnergia(ModificadorDeEnergia);
        }
     }
   }
   //====================================Metodos get e set =======================================//

   public ArrayList<Escolha> getEscolhas(){
      return this.escolhas;
   }

   public void  setModificadorDeEnergia(int ModificadorDeEnergia){
      this.ModificadorDeEnergia = ModificadorDeEnergia;
   }

   public void executar(){

      mostrar();
      int index = escolher();
      Capitulo novoCapitulo = escolhas.get(index).getProximo();
      novoCapitulo.executar();
      }
   
  //====================================Metodo de escolher no texto=======================================//

    private int escolher() {
        
       Scanner leitor = new Scanner(System.in);
       int verificado = -1;
   
       if(escolhas != null)
      {
         while(verificado == -1)
         {
            String Resposta;
            if(this.escolhas.size() > 0){
             System.out.println("Resposta: ");
               Resposta = leitor.next();
         
            for(int i = 0 ; i < escolhas.size(); i++ ) 
            {
              if(Resposta.equals(escolhas.get(i).getTexto()))
              {
               verificado = i;
               }
            }
          }  
         }      
      }
             return verificado;
   }
}