package Lecture2;

public class ArithmeticOperators {
	public static void main(String[] args) {
		int a = 3;
		int b = 10;
		int c = b / 2*a;
		System.out.println(c);
		
		int d = b / (2*a);
		System.out.println(d);
		
		/*
		Operators	                               Precedence
		postfix increment and decrement				++ --
		prefix increment and decrement, and unary	++ -- + - ~ !
		multiplicative								* / %
		additive									+ -
		shift										<< >> >>>
		relational									< > <= >= instanceof
		equality									== !=
		bitwise AND									&
		bitwise exclusive OR						^
		bitwise inclusive OR						|
		logical AND									&&
		logical OR									||
		ternary										? :
		assignment									= += -= *= /= %=
													&= ^= |= <<= >>= >>>=
		*/
	}
}