package questions;




import player.PlayerDao;

import java.util.Scanner;

public class QuestionDao {
    public static int money = 0;


    public static void Question1() {
        System.out.println("Cuantas champions a ganado cristiano ronaldo: ?");
        System.out.println("A:3");
        System.out.println("B:4");
        System.out.println("C:5");
        System.out.println("D:2");

    }

    public static void Answer1() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);
                break;
            case "B":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;
            case "C":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = 100 + money;
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");

                }
                 break;

            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;
            default:
                System.out.println("opcion incorrecta");

        }
    }

    public static void Question2() {
        System.out.println("Cada cuanto tiempo se realiza el mundial de futbol: ?");
        System.out.println("A:3 Años");
        System.out.println("B:5 Años");
        System.out.println("C:4 Años");
        System.out.println("D:2 Años");

    }

    public static void Answer2() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);
                break;
            case "B":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;
            case "C":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }

                break;
            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;
            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question3() {
        System.out.println(":Cual es el deporte tradicional en japon ?");
        System.out.println("A:Sumo");
        System.out.println("B:Natacion");
        System.out.println("C:Atletismo");
        System.out.println("D:Futbol");

    }

    public static void Answer3() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }

                break;
            case "B":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;
            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;
            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;
            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question4() {
        System.out.println("Que tipo de arma se utiliza para la esgrima: ?");
        System.out.println("A:Machete");
        System.out.println("B:Sable");
        System.out.println("C:Pistola");
        System.out.println("D:Florete");

    }

    public static void Answer4() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;
            case "B":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;
            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;
            case "D":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }

                break;


            default:
                System.out.println("opcion incorrecta");
        }

    }

    public static void Question5() {
        System.out.println("Que Deporte practica Serena Williams: ?");
        System.out.println("A:Boxeo");
        System.out.println("B:Tenis");
        System.out.println("C:Patinaje");
        System.out.println("D:Natacion");

    }

    public static void Answer5() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 300;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;
            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            default:
                System.out.println("opcion incorrecta");
        }


    }

    public static void Question6() {
        System.out.println("Cual es el rio mas grande del mundo: ?");
        System.out.println("A:Medellin");
        System.out.println("B:Amazonas");
        System.out.println("C:Nilo");
        System.out.println("D:Mississippi");

    }

    public static void Answer6() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "C":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            default:
                System.out.println("opcion incorrecta");
        }
    }


    public static void Question7(){
        System.out.println(":En que pais esta la Universidad de Harvard ?");
        System.out.println("A:Colombia");
        System.out.println("B:Argentina");
        System.out.println("C:Estados unidos");
        System.out.println("D:Inglaterrra");
    }

    public static void Answer7() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "C":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            default:
                System.out.println("opcion incorrecta");
        }

    }

    public static void Question8(){
        System.out.println(":Donde esta Transilvania ?");
        System.out.println("A:Armenia");
        System.out.println("B:Russia");
        System.out.println("C:Polonia");
        System.out.println("D:Rumania");
    }

    public static void Answer8() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "C":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;


            case "D":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question9(){
        System.out.println(":Cual es la Capital de España ?");
        System.out.println("A:Tokio");
        System.out.println("B:Berlin");
        System.out.println("C:Paris");
        System.out.println("D:Madrid");
    }

    public static void Answer9() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":

                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            default:
                System.out.println("opcion incorrecta");
        }
    }



        public static void Question10(){
            System.out.println(":Cual es la ciudad mas poblada del mundo ?");
            System.out.println("A:Madrid");
            System.out.println("B:Berlin");
            System.out.println("C:Paris");
            System.out.println("D:Tokio");
        }

    public static void Answer10() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":

                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 300;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question11(){
        System.out.println(":En que año cayo el muro de Berlin ?");
        System.out.println("A:1989");
        System.out.println("B:2020");
        System.out.println("C:2000");
        System.out.println("D:1999");
    }

    public static void Answer11() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;



            case "B":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;


            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            default:
                System.out.println("opcion incorrecta");
        }
    }
    public static void Question12(){
        System.out.println(":Cuando llego el hombre a la luna  ?");
        System.out.println("A:1969");
        System.out.println("B:1915");
        System.out.println("C:2000");
        System.out.println("D:1940");
    }

    public static void Answer12() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            case "B":

                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;




            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            default:
                System.out.println("opcion incorrecta");
        }
    }
    public static void Question13(){
        System.out.println(":Quien es el fundador de Facebook  ?");
        System.out.println("A:Ivan Sepeda");
        System.out.println("B:Isac Newton");
        System.out.println("C:Mark Zuckerberg");
        System.out.println("D:Evo Morales");
    }

    public static void Answer13() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;

            case "C":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;




            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            default:
                System.out.println("opcion incorrecta");
        }
    }
    public static void Question14(){
        System.out.println(":Cual es el atleta con mas medallas olimpicas ?");
        System.out.println("A:Michael Phelps");
        System.out.println("B:Katerine Ivarguen");
        System.out.println("C:");
        System.out.println("D:");
    }

    public static void Answer14() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":

                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;



            case "B":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            default:
                System.out.println("opcion incorrecta");
        }
    }
    public static void Question15(){
        System.out.println(":Cual es la videoconsola mas vendida de la historia ?");
        System.out.println("A:Nintendo");
        System.out.println("B:Play 4");
        System.out.println("C:Xbos one");
        System.out.println("D:Play 2");
    }

    public static void Answer15() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":

                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 300;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }


    public static void Question16(){
        System.out.println(":Cuál es la obra artística mexica más grande ?");
        System.out.println("A:Las dos Fridas");
        System.out.println("B:Monolito de Tlaltecuhtli");
        System.out.println("C:Raices");
        System.out.println("D:La Ofrenda");
    }

    public static void Answer16() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":

                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question17(){
        System.out.println(":Que le paso a la pintura de Leonardo da Vinci “La batalla de Anghiari ?");
        System.out.println("A:Desaparecio");
        System.out.println("B:Se quemo");
        System.out.println("C:No exite");
        System.out.println("D:La destruyeron");
    }

    public static void Answer17() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;



            case "B":

                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;


            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question18(){
        System.out.println(":Cuántas pinturas se conocen de Da Vinci ?");
        System.out.println("A:5");
        System.out.println("B:10");
        System.out.println("C:15");
        System.out.println("D:20");
    }

    public static void Answer18() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":

                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "C":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;




            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question19(){
        System.out.println(":Qué ciudad es la pintura “La noche estrellada” de Van Gogh ?");
        System.out.println("A:Paris");
        System.out.println("B:Saint-Rémy-de-Provenc");
        System.out.println("C:Lyon");
        System.out.println("D:Marsella");
    }

    public static void Answer19() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":

                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question20(){
        System.out.println(":Qué artista hizo un holograma de Alice Cooper ?");
        System.out.println("A:Salvador Dalí");
        System.out.println("B:Miguel Ángel");
        System.out.println("C:Marcel Duchamp");
        System.out.println("D:Leonardo Da Vinci");
    }

    public static void Answer20() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 400;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;



            case "B":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question21(){
        System.out.println(":Cual es el primer elemento de la tabla periodica ?");
        System.out.println("A:Berilio");
        System.out.println("B:Nitrogeno");
        System.out.println("C:Oxigeno");
        System.out.println("D:Hidrogeno");
    }

    public static void Answer21() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":

                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;





            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question22(){
        System.out.println(":Cual es el planeta mas grande del Sistema Solar ?");
        System.out.println("A:Saturno");
        System.out.println("B:Jupiter");
        System.out.println("C:Neptuno");
        System.out.println("D:Marte");
    }

    public static void Answer22() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":

                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question23(){
        System.out.println(":Cuantos dientes tiene un humano ?");
        System.out.println("A:23");
        System.out.println("B:20");
        System.out.println("C:32");
        System.out.println("D:40");
    }

    public static void Answer23() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;




            case "C":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;




            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question24(){
        System.out.println(":Que gas liberan las plantas al hacer la fotosintesis ?");
        System.out.println("A:Carbono");
        System.out.println("B:Oxigeno");
        System.out.println("C:Agron");
        System.out.println("D:Acetileno");
    }

    public static void Answer24() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;

            case "B":

                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 100;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;


            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void Question25(){
        System.out.println(":Que pigmento da color a nuestra piel ?");
        System.out.println("A:Melania");
        System.out.println("B:Clorofila");
        System.out.println("C:Hemoglobina");
        System.out.println("D:Bilirrubina");
    }

    public static void Answer25() {

        Scanner read = new Scanner(System.in);
        String aswer1 = read.nextLine();
        switch (aswer1) {
            case "A":
                System.out.println("Respuesta correcta");
                System.out.println("ganaste 100 puntos:");
                money = money + 400;
                System.out.println("tienes: " + money + "puntos");
                System.out.println("Desea salir con el dinero optenido:");
                String answer = read.nextLine();
                if (answer.equalsIgnoreCase("si")) {
                    System.out.println("adios ganaste: " + money + "puntos");
                }
                break;



            case "B":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;




            case "C":
                System.out.println("Respuesta incorreta");
                System.out.println("puntos obtenidos: " + money);

                break;


            case "D":
                System.out.println("Respuesta incorrecta");
                System.out.println("puntos obtenidos: " + money);
                break;



            default:
                System.out.println("opcion incorrecta");
        }
    }


}
