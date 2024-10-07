import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fachada2 fachada = new Fachada2();

        //Menu
        System.out.println("Serviços ofericidos pelo nosso PetShop: ");
        System.out.println("1-Banho");
        System.out.println("2-Tosa");
        System.out.println("3-Hotelzinho");
        int opcao = sc.nextInt();

        //chamando a fachada

        switch (opcao){
            case 1:
                ServicoPetShopIF banho;
                TamanhoPorteDoAnimal();
                int opcaoTamanhoAnimal = sc.nextInt();
                System.out.println("Informe o tamanho do pelo do seu pet: ");
                System.out.println("1- Curto");
                System.out.println("2- Médio");
                System.out.println("3- Longo");
                int opcaoPelo = sc.nextInt();
                banho = fachada.criaServicoBanho(opcaoTamanhoAnimal,opcaoPelo);
                System.out.println(banho);
                break;


            case 2:
                ServicoPetShopIF tosa;
                TamanhoPorteDoAnimal();
                int opcaoTamanhoAnimal2 = sc.nextInt();
                tosa = fachada.criServicoTosa(opcaoTamanhoAnimal2);
                System.out.println(tosa);
                break;

            case 3:
                ServicoPetShopIF hotelzinho;
                TamanhoPorteDoAnimal();
                int opcaoTamanhoAnimal3 = sc.nextInt();
                System.out.println("Informe a quantidade de horas que deseja deixar o seu pet no nosso hotelzinho: ");
                int qtndDeHorasNoHotelzinho = sc.nextInt();
                hotelzinho = fachada.criaServicoHotelzinho(opcaoTamanhoAnimal3,qtndDeHorasNoHotelzinho);
                System.out.println(hotelzinho);
                break;


        }
        System.out.println(new Hotelzinho("grande",9,1));
    }

    private static void TamanhoPorteDoAnimal() {
        System.out.println("Informe o tamanho do seu pet: ");
        System.out.println("1- Pequeno");
        System.out.println("2- Médio");
        System.out.println("3- Grande");
    }
}