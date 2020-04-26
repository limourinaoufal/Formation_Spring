package ma.lndroid.tp.spring.spel.operations.convert.string.to.bytes.array;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
public static void main(String[] args) {
	ExpressionParser expressionParser = new SpelExpressionParser();
	Expression expression = expressionParser.parseExpression("'Hello World'.bytes");
	byte[] bytes = (byte[]) expression.getValue();
	for(byte b:bytes)
		System.out.print(b+" ");
	
}
}
