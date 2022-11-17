package ba.unsa.etf.rpr;

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        try {
                System.out.println(Arrays.toString(args));
                for(String arg : args){
                    ExpressionEvaluator evaluator = new ExpressionEvaluator();
                    String exp = arg;
                    double result = evaluator.evaluate(exp);
                    System.out.println(exp + " = " + result);
                }
            } catch(RuntimeException e){
                System.err.println("Greška: " + e.getMessage());
            }
        }
    }

