
import java.util.Scanner;

class Main {

      private static String Escolha1TerceiroCapitulo;

      public static void main(String[] argas) {

            Personagem Meredith = new Personagem("Meredith", 100);
            Personagem Alan = new Personagem("Alan", 100);
            Scanner leitor = new Scanner(System.in);

            String Titulo1 = "---- A Figura Misteriosa ----\n\n";
            String PrimeiroCapitulo = "Acordando...\n\n" +
                        "ainda meio atordoado você ouve uma voz...\n" +
                        "-- Olá Alan,espero que ainda se lembre de mim?...\n" +
                        "antes que levantasse da cama, uma força incomum empurra você...\n" +
                        "-- Acho que não rsrsr\n" +
                        "-- Vim fazer a mesma proposta da ultima vez, poder, familia, tudo...\n" +
                        "que você desejar e a única condição é lealdade a mim...\n" +
                        "-- o que me diz?";

            String Escolha1SegundoCapituloo = "aceito";
            String Escolha2QuintoCapitulo = "recuso";

            String Titulo2 = "---- O paciente ----\n\n";
            String SegundoCapitulo = "AlANN... AlAAN... CORREEE!\n\n" +
                        "alguns segundos depois de aceitar a proposta, você esta em pé\n" +
                        "vestido como se fosse um paciente, com as mãos cobertas de sangue...\n" +
                        "você consegue ouvir uma voz gritando desesperada, uma mulher,pedindo\n" +
                        "praticamente implora para você fugir...\n" +
                        "olhando ao redor à muitos corpos ao seu redor assustado você...\n";

            String Escolha1TerceiroCapitulo = "foge";
            String Escolha2QuartoCapitulo = "fica";

            // Esse capitulo se refere a segunda escolha do primeiro capitulo
            String Titulo3 = "---- Apenas uma casca ----\n\n";
            String TerceitoCapitulo = "Alan ouve sua voz e dispira na tentiva e fugir, infelizmente você está\n" +
                        "com ferimentos graves, mas mesmo assim tentava fugir, daquelas coisas...\n" +
                        "-- não fujaa Meredith, ele te deixou para atrás, ele nem lembra quem é você\n" +
                        "a voz sussura em seus ouvidos, com um tom de deboche. Cada parte do seu corpo\n" +
                        "fica em choque, o medo toma conta do seu corpo, como se fosse um vírus\n" +
                        "o homem, ou sei la, criatura te agarra pelo pescoço e te joga na parede\n" +
                        "-- Já viu o inferno Meredith?!...\n" +
                        "segurando você pelo pescoço ele aproxima aqueles olhos de fogo, e cada gota\n" +
                        "de alegria, e paz dentro do seu corpo esvazia, tornando você um\n" +
                        "pedaço de carne, sem vida, apenas o vazio...\n" +
                        "Meredith perdeu 100 de vida\n" +
                        "-- Não preocupe ele vai se juntar a você rsrsrs...\n\n";

            String Titulo4 = "---- O guerreiro ----\n\n";
            String QuartoCapitulo = "A voz implora para você fugir, mas não consegue...\n" +
                        "um sentimento de fúria e vontade toma conta do seu corpo\n" +
                        "o bracelente no seu braço direito, se torna uma especie de armadura\n" +
                        "e todo seu braço direito fica coberto dessa armadura, e sem pensar você avança\n" +
                        "em direção aos homens que estão atacando Meredith, o primeiro deles mal ver\n" +
                        "você se aproximando e ele so senti que estava sem a cabeça segundos depois\n" +
                        "o outro tenta fugir, mas suas mãos e braços são arrancados, já no chão, você\n" +
                        "pisa na cabela deles, até esmagar...\n\n" +
                        "-- Ele VEM TE PEG...\n\n" +
                        "você pega a mulher nos braços e consegue finalmente fugir dali...\n\n" +
                        "Alan ganha 10 de vida, como se arma sugasse a energia dos seres que ela mata";

            // se refere a Escolha2SegundoCapitulo
            String Titulo5 = "---- Mal entendido ----\n\n";
            String QuintoCapitulo = "Sem consegui falar, você balança a cabeça recusa...\n" +
                        "neste exato momento, sons de tiros que parecem proximos\n" +
                        "muitos gritos e pessoas pedindo socorro ...\n" +
                        "-- você devia ter aceitado Alan, era a única forma de salvar essas pessoas...\n\n" +
                        "a figura que falava com você sumia lentamente como poeira ao vento\n" +
                        "todos os sons de pessoas morrendo, gritando, desesperadas se repetem milhares de vezes\n" +
                        "na sua cabeça...\n" +
                        "Alan perde 90 de vida\n\n" +
                        "ALGUNS MESES DEPOIS...\n\n" +
                        "você acorda no mesmo lugar, mas a dor e sofrimento foi tanta, que sua mente foi destruida...\n"
                        +
                        "a única coisa que você fala é \"aceito... aceito..\" ";

            Capitulo PrimeiroTexto = new Capitulo(Titulo1, PrimeiroCapitulo, Escolha1SegundoCapituloo,
                        Escolha2QuintoCapitulo, null, 0);

            PrimeiroTexto.Mostrar();
            String Resposta = leitor.next();
            if (Resposta.equals(Escolha1SegundoCapituloo)) {
                  Capitulo SegundoTexto = new Capitulo(Titulo2, SegundoCapitulo, Escolha1TerceiroCapitulo,
                              Escolha2QuartoCapitulo, Alan, 0);
                  SegundoTexto.Mostrar();
                  Resposta = leitor.next();

                  if (Resposta.equals(Escolha1TerceiroCapitulo)) {
                        Capitulo TerceiroTexto = new Capitulo(Titulo3, TerceitoCapitulo, "", "", Meredith, -100);
                        TerceiroTexto.Mostrar();
                  }

                  if (Resposta.equals(Escolha2QuartoCapitulo)) {
                        Capitulo QuartoTexto = new Capitulo(Titulo4, QuartoCapitulo, "", "", Alan, 10);
                        QuartoTexto.Mostrar();
                  }
                  if (Resposta.equals(Escolha2QuintoCapitulo)) {
                        Capitulo QuintoTexto = new Capitulo(Titulo5, QuintoCapitulo, "", "", Alan, -100);
                        QuintoTexto.Mostrar();
                  }

            }
      }
}