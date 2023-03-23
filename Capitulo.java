import java.util.ArrayList;
import java.util.Scanner;

class Capitulo {

   //====================================Atributos de classe=======================================//
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas; //agora aqui passa a ser uma objeto de escolha que tem texto e proximo capitulo
    private Personagem personagem;
    private int modificadorDeEnergia;
   
   //====================================Construtor=======================================//
    public Capitulo(String NomeDoCapitulo, String TextoDoCapitulo, 
    Personagem PersonaDoCapitulo,
     int AlteracaoDeEnergiaDoCapitulo)

    {
        this.nome = NomeDoCapitulo;
        this.texto = TextoDoCapitulo;
        this.personagem = PersonaDoCapitulo;
        this.modificadorDeEnergia = AlteracaoDeEnergiaDoCapitulo;
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
         System.out.println(" --> " + escolha.texto);
         }

   //--------------------------------Mudança de energia------------------------------//
        if (modificadorDeEnergia > 0)
         {
            this.personagem.ModificadorDeEnergia(modificadorDeEnergia);
        }
     }
   }
   //====================================Metodos get e set =======================================//
    
   public String getNome(){
      return this.nome;
   }
   public String getTexto(){
      return this.texto;
   }
   public ArrayList<Escolha> getEscolhas(){
      return this.escolhas;
   }
   public Personagem getPersonagem(){
       return personagem;
   }
   public int getModificadorDeEnergia(){
      return modificadorDeEnergia;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public void setTexto(String texto){
      this.texto = texto;
   }
   public void setPersonagem(){
      this.personagem = personagem;
    }
   public void  setModificadorDeEnergia(int modificadorDeEnergia){
      this.modificadorDeEnergia = modificadorDeEnergia;
   }

   public void executar(){

      mostrar();
      int index = escolher();
      Capitulo novoCapitulo = escolhas.get(index).proxCapitulo();
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
              if(Resposta.equals(escolhas.get(i).texto))
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