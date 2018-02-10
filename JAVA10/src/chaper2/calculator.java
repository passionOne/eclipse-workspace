package chaper2;

public class calculator {
	static private float result;
	
	static void calculate(float b1, char sign, float b2) throws IllegalSignException, ArithmeticException {
		switch (sign) {
		case '+':
			result = b1 + b2;
			break;
		case '_':
			result = b1 - b2;
			break;
		case '*':
			result = b1 * b2;
			break;
		case '/':
			if (b2 == 0)
				throw new ArithmeticException();
			result = b1 / b2;
			break;
		default:
			throw new IllegalSignException("你输入的运算符不对!");
		}
	}

	public static void main(String[] args) {
		float in0, in2;
		char in1;
		try {
			in0 = Float.parseFloat(args[0]);
			in1 = args[1].charAt(0);
			in2 = Float.parseFloat(args[2]);
			calculate(in0, in1, in2);
			System.out.println(in0 + " " + in1 + " " + in2 + "=" + result);
		} catch (NumberFormatException ex) {
			System.out.println("你输入的数字有的可能不是合法数字。" + "注意：乘号用字母x代替。");
		} catch (ArrayIndexOutOfBoundsException ex1) {
			System.out.println("你没有输入所需的数据，" + "程序需要两个数字和一个运算符。");
		} catch (ArithmeticException ex2) {
			System.out.println("进行除法运算时，第二个数字不能为0！");
		} catch (IllegalSignException ex3) {
			System.out.println("每次只能输入(+、-、下、／）其中的一个" + "注意：乘号用字母x代替。");
		} finally {
			System.out.println("谢谢使用");
		}
	}
}
