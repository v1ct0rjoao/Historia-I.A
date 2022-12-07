
import java.util.Scanner;

class Main {

   public static void main(String[] argas) {

      Personagem Wictor;
      Personagem Brain;

      String Resposta;
      Wictor = new Personagem("Wictor", 100);
      Brain = new Personagem("Brian", 100);

      String Titulo1 = "---- Reconhecimento ----\n\n";
      String PrimeiroCapitulo = "Olá recruta me chamo Alan sou a inteligencia artificial\n" +
            "responsavel testar suas habilidades fisicas e mentais\n" +
            "O primeiro teste é de coragem, bem simples, espero que se\n" +
            "saia bem\n\n" +
            ">>>>Você é levado até um terrraço<<<<\n\n" +
            ">>> Alan - Para conseguir consquistar o objetivo nesse teste é preciso que salte do terraço\n\n" +
            "Você olha para baixo e não percebe fim, o local parece um\n" +
            "abismo.\n" +
            ">>> Alan - Você tem a opção de saltar ou desistir, qual você escolher?\n\n" +
            "DIGITE: ";

      String Escolha1PrimieiroCapitulo = "saltar";
      String Escolha2PrimieiroCapitulo = "desistir";

      String Titulo2 = "---- O bom recruta ----\n\n";
      String SegundoCapitulo = "Mesmo em pânico, sentidos confusos, você salta do terraço.\n" +
            "Afinal, você nasceu para ser um soldado. Quando você pula\n" +
            "senti a sensação que aquele abismo não tem fim, até que alguns\n" +
            "feixes de luz, começam a sair do chão.\n\n" +
            ">>> Alan - Meus parabéns recruta, nem questionou as ordens, passou no primeiro teste.\n\n" +
            "quando você ver o Alan,percebe que tudo aquilo se desmanchava e no final, você\n" +
            "estava dentro de um tipo de ilusão\n\n" +
            ">>> Alan - isso tudo era apenas um cenario holografico,\n" +
            "seu segundo teste, vai ser mais dificil, pois vão ser dois testes\n" +
            "simultaneos, você e outro recruta.\n\n" +
            "é colocado uma caixa proxima a vocês dois, com duas armas\n\n" +
            ">>> Alan - essas duas armas funcionam eletronicamente, elas só\n" +
            "desarmam se foram apertado o gatilho ao mesmo tempo, vocês tem duas opcôes\n" +
            "atirar um no outro ao mesmo tempo e não morrer e ser desqualificado ou apenas um\n" +
            "atirar e ser aprovado no teste\n\n" +
            "Vocês estão um em frente o outro:\n\n" +
            "DIGITE:";

      String Escolha1SegundoCapitulo = "atirar juntos";
      String Escolha2SegundoCapitulo = "Brain atira";

      // Esse capitulo se refere a segunda escolha do primeiro capitulo
      String Titulo3 = "---- FRACASSADO ----\n\n";
      String TerceitoCapitulo = "Você entra em pânico e mesmo você querendo ir o seu corpo\n" +
            "não te obedece e infelizmente desisti de saltar\n\n" +
            ">>> Alan - é uma pena não conseguir, seu pai tinha muita expectativa sobre você recruta\n" +
            "mas tudo bem os medrosos e covardes podem viver em paz, junto com os sem facções\n" +
            "espero que sobreviva sozinho, pode seguir estes homens.\n\n" +
            "Dois homens surgem do seu lado e te levam até saída e te jogam, como lixo na rua\n" +
            "em meio aos drogados";
      // se refere a Escolha1SegundoCapitulo

      String Titulo4 = "---- Um Voto de amizade ----\n\n";
      String QuartoCapitulo = "Vocês dois não se conhecem, mas como irmaõs de guerra, decidem usar\n" +
            "as armas ao mesmo, miram um no outro e quando clicam no gatilho sai confete\n\n" +
            ">>>> Alan - Parabéns, vocês são oficialmente soldados da ARQUIA\n" +
            "aqui dentro devem sempre manter esses principios, nunca deixem um amigo para trás\n\n" +
            "Recruta 1 e Recruta 2 são classificados como guerreiros da paz da ARQUIA, serão responsave´s\n" +
            "por liderar chamados de paz em outros países secretamente\n\n" +
            "FIM DO LIVRO";
      // se refere a Escolha2SegundoCapitulo
      String Titulo5 = "---- Diplomata ----\n\n";
      String QuintoCapitulo = ">>>>" + Wictor.Nome + " - atira em mim, não tem bala dentro, eu tenho certeza\n" +
            "eles nunca iam matar dois recrutas.\n\n" +
            ">>>>" + Brain.Nome + " - Você é maluco, mas só quem sai ganhando sou mesmo\n" +
            "agora se você morrer a culpa é sua!!\n\n" +
            "quando o " + Brain.Nome + " puxa o gatilho percebe que recruta 1 estava certo\n" +
            "Alan aparece em um monitor grande dentro da sala\n\n" +
            ">>>> Alan - Parabéns Recrutas, confiança, estrategia e diplomacia\n" +
            "tudo isso cria um bom soldado, os dois estão aprovados, vocês fazem parte\n" +
            "da ARQUIA e vão fazer parte das forças especias de solução de guerras internacionais\n\n" +
            "FIM DO LIVRO";

      Capitulo capitulo1;
      Capitulo capitulo2;
      Capitulo capitulo3;
      Capitulo capitulo4;
      Capitulo capitulo5;

      Scanner leitor = new Scanner(System.in);

      capitulo1 = new Capitulo(Titulo1, PrimeiroCapitulo,
            Escolha1PrimieiroCapitulo, Escolha2PrimieiroCapitulo,
            Wictor, 20);

      capitulo1.Mostrar();
      Resposta = leitor.nextLine();
      System.out.println();
      System.out.println("\n\n");

      if (Resposta.equals(Escolha1PrimieiroCapitulo)) {

         capitulo2 = new Capitulo(Titulo2, SegundoCapitulo, Escolha1SegundoCapitulo, Escolha2SegundoCapitulo, Brain,
               40);
         capitulo2.Mostrar();
         Resposta = leitor.nextLine();

         System.out.println();

         if (Resposta.equals(Escolha1SegundoCapitulo)) {

            capitulo4 = new Capitulo(Titulo4, QuartoCapitulo, "", "", Brain, 30);
            capitulo4.Mostrar();

         } else if (Resposta.equals(Escolha2SegundoCapitulo)) {

            capitulo5 = new Capitulo(Titulo5, QuintoCapitulo, "", "", Wictor, 50);
            capitulo5.Mostrar();

         }

      } else if (Resposta.equals(Escolha2PrimieiroCapitulo)) {
         capitulo3 = new Capitulo(Titulo3, TerceitoCapitulo, "", "Escolha2Docapitulo", Wictor, 100);
         capitulo3.Mostrar();

      }

   }
}