package com.design.pattern.interpreter;

import java.util.Stack;

public class PostfixParser {

    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+' :
                return new PlusExpression(stack.pop(), stack.pop());
            case '-' :
                return new MinusExpression(stack.pop(), stack.pop());
            case '*' :
                return new MultiplyExpression(stack.pop(), stack.pop());
            default:
                return new VariableExpression(c);
        }
    }

    private static PostfixExpression getExpressionInterface(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+' :
                return PostfixExpression.plus(stack.pop(), stack.pop());
            case '-' :
                return PostfixExpression.minus(stack.pop(), stack.pop());
            case '*' :
                return PostfixExpression.multiply(stack.pop(), stack.pop());
            default:
                return PostfixExpression.variable(c);
        }
    }
}
