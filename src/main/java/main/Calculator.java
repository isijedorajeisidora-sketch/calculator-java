package main;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Calculator {
    public double calculate(String expression) {
        try {
            // JavaScript engine za evaluaciju izraza sa prioritetom i zagradama
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
            Object result = engine.eval(expression);
            return Double.parseDouble(result.toString());
        } catch (ScriptException e) {
            throw new IllegalArgumentException("Invalid expression");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Division by zero");
        }
    }
}