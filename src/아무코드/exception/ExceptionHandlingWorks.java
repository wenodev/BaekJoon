package 아무코드.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingWorks {

    public static void main(String[] args) {
        exceptionHandler();
    }

    private static void exceptionWithoutHandler() throws IOException{

        System.out.println("exceptionWithoutHandler");

        try (BufferedReader reader = new BufferedReader((new FileReader(new File("/invalid"))))) {
            int c;
            // Read and display the file.

            while ((c = reader.read()) != -1){
                System.out.println((char) c);
            }

        }
    }

    private static void exceptionWithoutHandler1() throws IOException{
        System.out.println("exceptionWithoutHandler1");
        exceptionWithoutHandler();
    }

    private static void exceptionWithoutHandler2() throws IOException{
        System.out.println("exceptionWithoutHandler2");
        exceptionWithoutHandler1();
    }

    private static void exceptionHandler(){

        System.out.println("exceptionHandler");

        try{
            exceptionWithoutHandler2();
        }catch(IOException e){
            System.out.println("e : " + e);
            System.out.println("IOException caught!");
        }
    }





}
