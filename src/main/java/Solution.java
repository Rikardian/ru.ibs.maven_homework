import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        String text = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            text = reader.readLine();
        } catch (IOException e){
            System.out.println("Введено невалидное значение");
        }

        System.out.println(StringUtils.upperCase(text));
    }
}
