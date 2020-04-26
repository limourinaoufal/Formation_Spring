package ma.lndroid.tp.spring.spel.operations.convert.string.to.uppercase;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression = expressionParser
				.parseExpression("'hello world'.toUpperCase()");
		String messageUppercase = (String) expression.getValue();
		System.out.print(messageUppercase);

	}
}
