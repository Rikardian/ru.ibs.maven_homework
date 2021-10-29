import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lower_case {

    public static void main(String[] args) {
        try {
            System.out.println(StringUtils.lowerCase(args[0]));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы не ввели строку");
        }
    }
}
