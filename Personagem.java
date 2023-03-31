
public class Personagem {

   private String nome;
   private int energia;

    public Personagem(String NomeDosoldado, int EnergiaDoSoldado) {
        this.nome = NomeDosoldado;
        this.energia = 100;
    }


    public void setEnergia(int energia){
        if(energia < 0){
            this.energia = 0;
        }else if(energia > 100){
            this.energia = 100;
        }else{
            this.energia = energia;
        }
        
    }
    
    public void setNome(){
        this.nome = nome;
    }    
    
    public void ModificadorDeEnergia(int energiaNojogo) {
        setEnergia(this.energia + energiaNojogo);
       
        if (energia == 0) {
            System.out.println();
            System.out.println(nome
                    + " não resisti e perdeu toda sua vida");
        }

    }

}
