public class Javacod {
    public static void main(String[]args){
        //byte
        System.out.println("基本数据类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE:" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE:" + Byte.MAX_VALUE);
        System.out.println();

        //其他几样数据类型以此类推
        //Char
        System.out.println("基本数据类型：Char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        System.out.println("最小值：Character.MIN_VALUE:" + (int)Character.MIN_VALUE);
        System.out.println("最大值：Character.MAX_VALUE:" + (int)Character.MAX_VALUE);
        System.out.println();
        //同时定义多个变量的两种方法
        int a = 1, b = 2, c = 3;
        System.out.println(a + b + c);

        int q, w, x;
        q = w = x = 11;
        System.out.println(q + w + x);

    }
}
    //定义一个新类名Job2
class Job2{
    public static void main(String[]args){
        //计算一个矩形的面积
        int length = 9;
        int width = 7;
        int area = length * width;
        System.out.println("矩形的长=" + length);
        System.out.println("矩形的宽=" + width);
        System.out.println("矩形的面积=" + area);
    }

}
class Job3{
    public static void main(String[]args){
            //数据类型转换，隐式转换 小->大
        int myInt = 11;
        double myDouble = myInt;
    System.out.println(myInt);
    System.out.println(myDouble);
    //数据类型转换，显示转换 大->小
    double myDouble2 = 9e9;//只有浮点型可以使用科学计数法 ex e-x
    int myInt2 = (int)myDouble2;
    System.out.println(myDouble2);
    System.out.println(myInt2);

    }
}
class Job4{
    public static void main(String[]args){
        //相同存储大小不同数据类型的转换
        int myInt = 9;
        float myFloat = myInt;
        System.out.println(myFloat);
        //相同存储大小不同类型的变量进行转换为显性转换
    }
}
class Job5{
    public static void main(String[]args){
        int studentMark = 99, theMestMark = 100;
        double markPercent = studentMark / theMestMark;
        System.out.println(markPercent);
        //输出为0，int 相处必须先转换为浮点数
        //修改方法如下
        double markPercent01 = (double)studentMark / theMestMark;
        double markPercent02 = studentMark / 100.0;
        double markPercent03 = studentMark / (double)theMestMark;
        double markPercent04 = 1.0 * studentMark / (double)theMestMark;
        System.out.println(markPercent01);
        System.out.println(markPercent02);
        System.out.println(markPercent03);
        System.out.println(markPercent04);

    }
}
class Job6{
    public static void main(String[]args){
        int myInt = 9, myInt2 = 4;
        int percent = myInt % myInt2;
        //percent 自增
        int i = percent++;
        int percent1 = percent;
        System.out.println(percent);
        int c = percent--;
        System.out.println(percent);
    }
}
class Job7{
    public static void main(String[]args){
        //加法赋值运算符
        int myInt = 10;
        myInt += 9;
        System.out.println(myInt);
    }
}