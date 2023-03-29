import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // escrever codigo é que nem pecado, na hora H voce e deus sabe o que vc fez, depois de uns anos, so deus sabe.
        Scanner leitor = new Scanner(System.in);
        System.out.println("##################################################################################################################################################################################");
        System.out.println("Olá e bem-vindo(a) ao nosso mundo de RPG! Eu sou o criador deste mundo, me autonomeio de H.Aki, e é um prazer tê-lo(a) aqui. Qual é o seu nome?");
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        System.out.println("##################################################################################################################################################################################");
        System.out.println(nome+", é um prazer em conhecê-lo(a). Aqui, você é um personagem em um mundo de fantasia, cheio de aventuras e mistérios para explorar. Temos várias profissões para escolher, cada uma com seu beneficio. O que acha de escolher uma profissao?\n\n");
        System.out.println("[1] <-- Padeiro(a) - Benefício: Habilidade em cozinhar e criar poções de cura. Defeito: Fraco em combate e vulnerável a ataques.\n");
        System.out.println("[2] <-- Palhaço(a) - Benefício: Habilidade em distrair os inimigos e criar armadilhas. Defeito: Difícil de levar a sério e não muito efetivo em combate direto.\n");
        System.out.println("[3] <-- Vendedor(a) - Benefício: Habilidade em negociar preços e encontrar objetos raros. Defeito: Fraco em combate e suscetível a trapaças de outros comerciantes.\n");
        System.out.println("[4] <-- Artesão(ã) - Benefício: Habilidade em criar itens e melhorar equipamentos. Defeito: Pouca experiência em combate e vulnerável a ataques.\n");
        System.out.println("[5] <-- Dançarino(a) - Benefício: Habilidade em distrair inimigos e evitar ataques. Defeito: Pouca resistência e suscetível a ataques físicos.\n");
        System.out.println("[6] <-- Historiador(a) - Benefício: Habilidade em encontrar informações e pistas importantes. Defeito: Pouca experiência em combate e vulnerável a ataques.\n");
        System.out.println("[7] <-- Apicultor(a) - Benefício: Habilidade em criar abelhas e usar o mel como medicamento. Defeito: Fraco em combate e suscetível a alergias.\n");

        int profissao = Integer.parseInt(leitor.nextLine());



    }
}
