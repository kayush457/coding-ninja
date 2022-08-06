package Lecture7_OperatorAndForLoop;

public class Precedence {
	public static void main(String[] args) {
		int i = 10;
		int a = ++i * 5;
		System.out.println(a);
	}

}

//for equal precedence
//All binary operators except for the assignment operators are evaluated from left to right; 
//assignment operators are evaluated right to left.

/*
Operator Precedence

Operators					Precedence

postfix					expr++  expr--
unary					++expr  --expr  +expr  -expr  ~  !
multiplicative			*  /  %
additive				+  -
shift					<<  >>  >>>
relational				<  >  <=  >=  instanceof
equality				==  !=
bitwise AND	&
bitwise exclusive OR	^
bitwise inclusive OR	|
logical AND				&&
logical OR				||
ternary	? :
assignment				=  +=  -=  *=  /=  %=  &=  ^=  |=  <<=  >>=  >>>=

*/