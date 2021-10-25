package player;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PlayerDao {



  public String name;

    public PlayerDao(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void ini(){
        System.out.println("Hola bienvenido responda A,B,C,D");
        Scanner read= new Scanner(System.in);
        System.out.println("Digite su nombre");
        String name=read.nextLine();
        PlayerDao player=new PlayerDao(name);
    }



}
