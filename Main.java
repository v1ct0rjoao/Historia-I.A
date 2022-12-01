
import java.util.Scanner;

class Main {

   private static final char[] EnergiaPerdida = null;

   public static void main(String[] argas) {

      Personagem Wictor = new Personagem();
      Personagem Brain = new Personagem();
      Scanner leitor = new Scanner(System.in);
      String Resposta;
      Wictor.CriarPersonagem("Wictor", 0);
      Brain.CriarPersonagem("Brian", 0);

      String PrimeiroCapitulo = "---- Reconhecimento ----\n\n" +
            "Olá recruta me chamo Alan sou a inteligencia artificial\n" +
            "responsavel testar suas habilidades fisicas e mentais\n" +
            "O primeiro teste é de coragem, bem simples, espero que se\n" +
            "saia bem\n\n" +
            ">>>>Você é levado até um terrraço<<<<\n\n" +
            ">>> Alan - Para conseguir consquistar o objetivo nesse teste é preciso que salte do terraço\n\n" +
            "Você olha para baixo e não percebe fim, o local parece um\n" +
            "abismo.\n" +
            ">>> Alan - Você tem a opção de saltar ou desistir, qual você escolher?\n\n" +
            "- saltar \n\n- desistir\n\n" +
            "DIGITE: ";

      String Escolha1PrimieiroCapitulo = "saltar";
      String Escolha2PrimieiroCapitulo = "desistir";

      String SegundoCapitulo = "---- O bom recruta ----\n\n" +
            "Mesmo em pânico, sentidos confusos, você salta do terraço.\n" +
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
            "- Atirar ao mesmo tempo\n\n - Apenas Recruta 1 atira \n\n - Apenas Recruta 2 atira\n\n" +
            "DIGITE:";

      String Escolha1SegundoCapitulo = "atirar juntos";
      String Escolha2SegundoCapitulo = "apenas recruta 1 atira";
      String Escolha3SegundoCapitulo = "apenas recruta 2 atira";
      // Esse capitulo se refere a segunda escolha do primeiro capitulo
      String TerceitoCapitulo = "---- FRACASSADO ----\n\n" +
            "Você entra em pânico e mesmo você querendo ir o seu corpo\n" +
            "não te obedece e infelizmente desisti de saltar\n\n" +
            ">>> Alan - é uma pena não conseguir, seu pai tinha muita expectativa sobre você recruta\n" +
            "mas tudo bem os medrosos e covardes podem viver em paz, junto com os sem facções\n" +
            "espero que sobreviva sozinho, pode seguir estes homens.\n\n" +
            "Dois homens surgem do seu lado e te levam até saída e te jogam, como lixo na rua\n" +
            "em meio aos drogados";
      // se refere a Escolha1SegundoCapitulo
      String QuartoCapitulo = "---- Um Voto de amizade ----\n\n" +
            "Vocês dois não se conhecem, mas como irmaõs de guerra, decidem usar\n" +
            "as armas ao mesmo, miram um no outro e quando clicam no gatilho sai confete\n\n" +
            ">>>> Alan - Parabéns, vocês são oficialmente soldados da ARQUIA\n" +
            "aqui dentro devem sempre manter esses principios, nunca deixem um amigo para trás\n\n" +
            "Recruta 1 e Recruta 2 são classificados como guerreiros da paz da ARQUIA, serão responsave´s\n" +
            "por liderar chamados de paz em outros países secretamente\n\n" +
            "FIM DO LIVRO";
      // se refere a Escolha2SegundoCapitulo
      String QuintoCapitulo = "---- O mal soldado ----\n\n" +
            "Recruta não se preocupa com o seu companheiro, o objetivo é\n" +
            "passar em todos os testes, mesmo recruta 2 tentando conversar ele a não\n" +
            "fazer isso ele aperta o gatilho, quando ele faz isso sai confete da sua arma\n" +
            "Alan surge decepicionado.\n\n" +
            ">>>> Alan - Você nunca será um soldado, ele era seu aliado\n" +
            "isso era apenas um testem, infelizmente apenas o recruta 2 passou\n\n" +
            "Recruta 1 é mandado embora...\n\n" +
            "FIM DO LIVRO";

      String SextoCapitulo = "---- Diplomata ----\n\n" +
            "você conversa com o recruta 2, explica um plano\n\n" +
            ">>>> Recruta 1 - atira em mim, não tem bala dentro, eu tenho certeza\n" +
            "eles nunca iam matar dois recrutas.\n\n" +
            ">>>> Recruta 2 - Você é maluco, mas só quem sai ganhando sou mesmo\n" +
            "agora se você morrer a culpa é sua!!\n\n" +
            "quando o recruta 2 puxa o gatilho percebe que recruta 1 estava certo\n" +
            "Alan aparece em um monitor grande dentro da sala\n\n" +
            ">>>> Alan - Parabéns Recrutas, confiança, estrategia e diplomacia\n" +
            "tudo isso cria um bom soldado, os dois estão aprovados, vocês fazem parte\n" +
            "da ARQUIA e vão fazer parte das forças especias de solução de guerras internacionais\n\n" +
            "FIM DO LIVRO";

      System.out.println(PrimeiroCapitulo);
      Resposta = leitor.nextLine();
      Wictor.ModificadorDeEnergia(-10);
      System.out.println("tem: " + Wictor.Energia);

      if (Resposta.equals(Escolha1PrimieiroCapitulo)) {
         System.out.println(SegundoCapitulo);
         Resposta = leitor.nextLine();

         if (Resposta.equals(Escolha1SegundoCapitulo)) {
            System.out.println(QuartoCapitulo);
         } else if (Resposta.equals(Escolha2SegundoCapitulo)) {
            System.out.println(QuintoCapitulo);
         } else if (Resposta.equals(Escolha3SegundoCapitulo)) {
            System.out.println(SextoCapitulo);
         }
      }

      if (Resposta.equals(Escolha2PrimieiroCapitulo)) {
         System.out.println(TerceitoCapitulo);
         Resposta = leitor.nextLine();
      }

   }

   private static char[] CriarPersonagem(String string, int i) {
      return null;
   }

}