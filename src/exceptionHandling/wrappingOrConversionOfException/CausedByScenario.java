package exceptionHandling.wrappingOrConversionOfException;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CausedByScenario {
    Scanner scanner = new Scanner(System.in);
    static boolean server = false;
    boolean isValid = false;
    static String message = null;
    static String mob = null;
    public boolean isValidMobileNo(String str) {
        // (0/91): number starts with (0/91)
        // [7-9]: starting of the number may contain a digit between 0 to 9
        // [0-9]: then contains digits 0 to 9
        Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        //the matcher() method creates a matcher that will match the given input against this pattern
        Matcher match = ptrn.matcher(str);
        //returns a boolean value
        return (match.find() && match.group().equals(str));
    }

    public void fetchData(){

        System.out.println("enter message");
        message = scanner.next();
        System.out.println("enter mobile number");
        mob = scanner.next();
    }
    public boolean checkData(String mob, Boolean serv){
        if (!serv){
            throw new ServerNotFound();
        }
        if (!isValidMobileNo(mob)){
            throw new RuntimeException("enter valid mobile number");
        }
    return true;
    }
    public boolean server (){
        int i = 0;
        if (i == 0){

            return false;
        }
        i++;
        if (i == 1){
            return false;
        }
        return true;
    }

    public static void main1(String[] args) {
        CausedByScenario causedByScenario = new CausedByScenario();
        causedByScenario.fetchData();

            server = causedByScenario.server();
            boolean isValid = causedByScenario.checkData(mob,server);
            if (isValid){
                System.out.println("message sent successfully");
            }


        System.exit(1);
    }

    public static void main(String[] args) {
        CausedByScenario causedByScenario = new CausedByScenario();
        try {
            main1(new String[]{"asdfas"});
        }
        catch (ServerNotFound serverNotFound){
            for (int i = 0 ; i< 3 ; i++){
                if (!causedByScenario.isValid) {
                    main1(new String[]{"123"});
                }
            }
        }
        catch(RuntimeException exception){
            Throwable throwable = exception.getCause();
            throw new IllegalArgumentException(throwable.getMessage());
        }
    }
}
