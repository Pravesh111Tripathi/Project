package exceptionHandling.tryCatchtypes;

import exceptionHandling.MyScanner;
import exceptionHandling.autoCloseable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithManyResource {
    public static void Try(){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sid", "root", "#@Gayatri123"); MyScanner s=new MyScanner(); autoCloseable ac=new autoCloseable()){
            int a=Integer.parseInt("m1");
            System.out.println("try block");

        }catch (NumberFormatException nfe){
            System.out.println("Number is invalid");
        }
        catch (SQLException sq){
            System.out.println("Database not found");
        }
        catch (Exception e){
            System.out.println("Catch");
        }

    }
}
