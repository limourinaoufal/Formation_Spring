package ma.lndroid.tp.spring.spel.variables;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test {
	
	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		StandardEvaluationContext standardEvaluationContext = new StandardEvaluationContext(calculation);
		
		ExpressionParser expressionParser = new SpelExpressionParser();
		expressionParser.parseExpression("number").setValue(standardEvaluationContext, 5);
		System.out.println(calculation.cube());
		
	}

}
