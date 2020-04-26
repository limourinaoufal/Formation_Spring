package ma.lndroid.tp.spring.spel.operators;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
public static void main(String[] args) {
	ExpressionParser expressionParser = new SpelExpressionParser();
	System.out.println(expressionParser.parseExpression("'Welcom To SPEL'+'!'").getValue());
	System.out.println(expressionParser.parseExpression("10 * 10 / 2").getValue());
	System.out.println(expressionParser.parseExpression("'Today is:'+new java.util.Date()").getValue());
	System.out.println(expressionParser.parseExpression("true and true").getValue());
	System.out.println(expressionParser.parseExpression("'ABC'.length()==10").getValue());
}
}
