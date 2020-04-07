package java.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/3/20 12:57 AM
 * @Version 1.0
 * @Description:
 **/

public class InputFromKeyMap {


    public static void getFromScanner(){

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(s);

    }

    public static void getFromBufferedReader() {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = null;
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(s);

    }

    public static void main(String[] args) {
        getFromScanner();
        getFromBufferedReader();
    }
}
