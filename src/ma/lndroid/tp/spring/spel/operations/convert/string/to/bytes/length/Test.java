package ma.lndroid.tp.spring.spel.operations.convert.string.to.bytes.length;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
public static void main(String[] args) {
	ExpressionParser expressionParser = new SpelExpressionParser();
	Expression expression = expressionParser.parseExpression("'Hello World'.bytes.length");
	int length = (int) expression.getValue();
		System.out.print(length);
	
}
}
