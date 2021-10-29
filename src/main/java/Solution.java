import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println(StringUtils.upperCase(args[0]));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы не ввели строку");
        }
    }
}
