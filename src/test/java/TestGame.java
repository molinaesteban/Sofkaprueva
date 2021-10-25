
import player.Player;
import player.PlayerDao;
import questions.QuestionDao;
import questions.Questions;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestGame
    public static void main(String[] args) {



        PlayerDao.ini();

            System.out.println("Categoria Deportes");
            System.out.println("Si ganas esta ronda 200 puntos extra");
            QuestionDao.Question1();
            QuestionDao.Answer1();

            QuestionDao.Question2();
            QuestionDao.Answer2();
            QuestionDao.Question3();
            QuestionDao.Answer3();
            QuestionDao.Question4();
            QuestionDao.Answer4();
            QuestionDao.Question5();
            QuestionDao.Answer5();

        System.out.println("Categoria Geografia");
        System.out.println("Si ganas esta ronda 200 puntos extra");
        QuestionDao.Question6();
        QuestionDao.Answer6();
        QuestionDao.Question7();
        QuestionDao.Answer7();
        QuestionDao.Question8();
        QuestionDao.Answer8();
        QuestionDao.Question9();
        QuestionDao.Answer9();
        QuestionDao.Question10();
        QuestionDao.Answer10();
        System.out.println("Categoria Historia");
        System.out.println("Si ganas esta ronda 200 puntos extra");
        QuestionDao.Question11();
        QuestionDao.Answer11();
        QuestionDao.Question12();
        QuestionDao.Answer12();
        QuestionDao.Question14();
        QuestionDao.Answer14();
        QuestionDao.Question15();
        QuestionDao.Answer15();
        System.out.println("Categoria  Arte ");
        System.out.println("Si ganas esta ronda 300 puntos extra");
        QuestionDao.Question16();
        QuestionDao.Answer16();
        QuestionDao.Question17();
        QuestionDao.Answer17();
        QuestionDao.Question18();
        QuestionDao.Answer18();
        QuestionDao.Question19();
        QuestionDao.Answer19();
        QuestionDao.Question20();
        QuestionDao.Answer20();
        System.out.println("Categoria  Ciencia ");
        System.out.println("Si ganas esta ronda 300 puntos extra");
        QuestionDao.Question21();
        QuestionDao.Answer21();
        QuestionDao.Question22();
        QuestionDao.Answer22();
        QuestionDao.Question23();
        QuestionDao.Answer23();
        QuestionDao.Question24();
        QuestionDao.Answer24();
        QuestionDao.Question25();
        QuestionDao.Answer25();
        System.out.println("FELICIDADES GANASTE EL JUEGO");

















    }

}





