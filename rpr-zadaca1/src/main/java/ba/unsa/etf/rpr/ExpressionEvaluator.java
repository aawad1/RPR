package ba.unsa.etf.rpr;
import java.util.Arrays;
import  java.util.Stack;

public class ExpressionEvaluator {

    private Stack<String> operators = new Stack<String>();
    private Stack<Double> operands = new Stack<Double>();
    public Double evaluate (String izraz){
        String[] parts = izraz.split(" ");

        System.out.println(Arrays.toString(parts));

        for (String part : parts){
            switch (part){
                case "(":
                case ",":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "sqrt":
                case "pow":
                    this.operators.push(part);
                    break;
                case ")":
                    String op = operators.pop();
                    Double v = operands.pop();
                    switch (op){
                        case "+":
                            v = operands.pop() + v;
                            break;
                        case "-":
                            v = operands.pop() - v;
                            break;
                        case "*":
                            v = operands.pop() * v;
                            break;
                        case "/":
                            v = operands.pop() / v;
                            break;
                        case "sqrt":
                            v = Math.sqrt(v);
                            break;
                        case "pow":
                            v = Math.pow(operands.pop(), v);
                            break;
                    }
                    operands.push(v);
                    break;
                default:
                    operands.push(Double.parseDouble(part));
            }
        }
        Double rezultat = operands.pop();
        if(!operands.isEmpty() || !operators.isEmpty()){
            throw new RuntimeException("Pogrešan unos");
        }
        return rezultat;
    }

}
