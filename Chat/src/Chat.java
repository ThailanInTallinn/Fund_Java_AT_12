import java.util.Scanner;

public class Chat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] messages = new String[10];

        System.out.print("Digite o nome do primeiro usuário: ");
        String userOne = sc.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String userTwo = sc.nextLine();


        for(int i = 0; i < 10; i++) {
            System.out.println(String.format("%s, digite a sua mensagem: ", i % 2 == 0? userOne : userTwo));
            messages[i] = sc.nextLine();
        }
        System.out.println("===== Hisórico de mensagens =====");
        for(int i = 0; i < 10; i++) {
            System.out.println(String.format("%s: %s", i % 2 == 0? userOne : userTwo, messages[i]));
        }
        System.out.println("Obrigado por utilizarem o sistema! Boa sorte pra vocês!");
    }
}
