
import java.util.Scanner;

class Main {

      private static String Escolha1TerceiroCapitulo;

      public static void main(String[] argas) {
            Scanner scan = new Scanner(System.in);

            Personagem Meredith = new Personagem("Meredith", 100);
            Personagem Alan = new Personagem("Alan", 100);
            int Resposta;
//====================================Capítulo 1=======================================//

            String Titulo1 = "---- A Figura Misteriosa ----\n\n";
            String PrimeiroTexto = "Acordando...\n\n" +
                        "ainda meio atordoado você ouve uma voz...\n" +
                        "- Olá Alan, espero que ainda se lembre de mim!! - disse uma figura obscura na frente\n" +
                        "antes que levantasse da cama, uma força incomum empurra você\n" +
                        "- Acho que não rsrsr - disse a figura em tom irônico\n" +
                        "- Vim fazer a mesma proposta da ultima vez, poder, familia, tudo o\n" +
                        "que você desejar e a única condição é lealdade a mim - disse a figura com sorriso de canto\n" +
                        "- o que me diz?";
Capitulo primeiroCapitulo = new Capitulo(Titulo1, PrimeiroTexto, null, 0);

//====================================Capítulo 2=======================================//
      
            String Titulo2 = "---- O paciente ----\n\n";
            String SegundoTexto = "-AlANN... AlAAN... CORREEE! - grita meredith  \n\n" +
                        "alguns segundos depois de aceitar a proposta, você esta em pé\n" +
                        "vestido como se fosse um paciente, com as mãos cobertas de sangue...\n" +
                        "você consegue ouvir uma voz gritando desesperada, uma mulher,\n" +
                        "praticamente implorando para você fugir\n" +
                        "olhando ao redor à muitos corpos, o que assusta você...";
Capitulo segundoCapitulo = new Capitulo(Titulo2, SegundoTexto, Alan, 0);


//====================================Capítulo 3=======================================//

            String Titulo3 = "---- Meredith, quem será ela? ----\n\n";
            String Terceitotexto = "Alan ouve sua voz e consegui fugir. Infelizmente, você está\n" +
                        "com ferimentos graves, tenta se libertar da coisa que te agarrou, mas não consegue\n" +
                        "- não fujaa Meredith, ele te deixou para atrás, ele nem lembra quem é você - disse a criatura\n" +
                        "a voz sussura em seus ouvidos, com um tom de deboche. Cada parte do seu corpo\n" +
                        "fica em choque, o medo toma conta como se fosse um vírus\n" +
                        "o homem, ou sei la, a criatura, te agarra pelo pescoço e te joga na parede\n" +
                        "-- Já viu o inferno Meredith?! - disse a criatura acedendo os olhos\n" +
                        "segurando você pelo pescoço ele aproxima aqueles olhos de fogo e cada gota\n" +
                        "de alegria epaz dentro do seu corpo esvazia, tornando você um\n" +
                        "pedaço de carne, sem vida, apenas o vazio...\n" +
                        "Meredith perdeu 100 de vida\n" +
                        "- Não preocupe ele vai se juntar a você rsrsrs - disse a criatura sorrindo";
Capitulo terceiroCapitulo = new Capitulo(Titulo3, Terceitotexto, Meredith, -100);

//====================================Capítulo 4=======================================//

            String Titulo4 = "---- O guerreiro ----\n\n";
            String QuartoTexto = "A voz implora para você fugir, mas você não consegue...\n" +
                        "um sentimento de fúria e vontade toma conta do seu corpo e\n" +
                        "o bracelente no seu braço direito, se torna uma especie de armadura\n" +
                        "e todo seu braço direito fica coberto dessa armadura e sem pensar você avança\n" +
                        "em direção aos homens que estão atacando Meredith, o primeiro deles mal ver\n" +
                        "você se aproximando e ele so senti que estava sem a cabeça segundos depois\n" +
                        "o outro tenta fugir, mas suas mãos e braços são arrancados. já no chão, você\n" +
                        "pisa na cabeça que foi decepada...\n\n" +
                        "-- Ele VEM TE PEG... - disse a cabeça antes de ser esmagada\n\n" +
                        "você pega a mulher nos braços e consegue finalmente fugir dali...\n\n" +
                        "Alan ganha 10 de vida, como se arma sugasse a energia dos seres que ela mata";
Capitulo quartoCapitulo = new Capitulo(Titulo4, QuartoTexto,Alan, 10);

//====================================Capítulo 5=======================================//

            String Titulo5 = "---- Mal entendido ----\n\n";
            String QuintoTexto = "Sem consegui falar, você balança a cabeça recusa...\n" +
                        "neste exato momento, sons de tiros você ouve tiros que parecem proximos,\n" +
                        "muitos gritos e pessoas pedindo socorro ...\n" +
                        "-- você devia ter aceitado Alan, era a única forma de salvar essas pessoas - disse a figura\n\n" +
                        "a figura que falava com você sumia lentamente como poeira ao vento\n" +
                        "todos os sons de pessoas morrendo, gritando, desesperadas se repetem milhares de vezes\n" +
                        "na sua cabeça...\n" +
                        "Alan perde 90 de vida\n\n" +
                        "ALGUNS MESES DEPOIS...\n\n" +
                        "você acorda no mesmo lugar, mas a dor e sofrimento foi tanta, que sua mente foi destruida...\n"
                        +
                        "a única coisa que você fala é \"aceito... aceito..\" ";
 Capitulo quintocCapitulo = new Capitulo(Titulo5, QuintoTexto, Alan, -100);

//====================================Controle de Texto=======================================//
        


primeiroCapitulo.getEscolhas().add(new Escolha("aceito", segundoCapitulo));
primeiroCapitulo.getEscolhas().add(new Escolha("recusa", quintocCapitulo));
segundoCapitulo.getEscolhas().add(new Escolha( "fugir", terceiroCapitulo));
segundoCapitulo.getEscolhas().add(new Escolha("fica", quartoCapitulo));
primeiroCapitulo.getEscolhas().add(new Escolha("ARROz", quintocCapitulo));

Capitulo raiz = primeiroCapitulo;
raiz.executar();
  
      
      
   }
}