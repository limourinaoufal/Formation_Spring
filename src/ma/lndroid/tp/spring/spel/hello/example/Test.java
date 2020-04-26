package ma.lndroid.tp.spring.spel.hello.example;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	
	public static void main(String[] args) {
		ExpressionParser expressionParser = new SpelExpressionParser();
		
		Expression expression = expressionParser.parseExpression("'Hello SPEL'");
		
		String message = (String) expression.getValue();
		
		System.out.println(message);
	}

}
