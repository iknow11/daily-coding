public class ChangeChar{
	public static void main(String[]argd){
		//测试浮点型使用陷阱
		double num1 = 2.7;
		double num2 = 8.1 / 2.7;
		if (num1 == num2){
			System.out.println("相等");
		}
		System.out.println(num2);
}
}