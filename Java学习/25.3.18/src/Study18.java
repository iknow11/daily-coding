public class Study18 {
    public static void main(String[] args) {
        //length()测量字符串长度
        String txt = "fsjdhfisuhfskjdhfioxudfh";
        //String.length()
        System.out.println("字符串长度：" + txt.length());
        //结果为24

        //将字符串全部进行大小写toUpperCase() toLowerCase()
        System.out.println(txt.toUpperCase());//输出结果全部大写
        System.out.println(txt.toLowerCase());//输出结果全部小写

        //indexOf()字符串中指定文本的第一次出现位置 包括空格
        //Java时从0开始计算位置的
        System.out.println("字符串中'h'的第一次出现位置:" + txt.indexOf('f'));
        //输出结果0
    }
}
class Study1801{
    public static void main(String[] args) {
        //字符串的连接
        // + 可用来连接字符串这一过程叫拼接
        String firstName = "Jone";
        String lastName = "Boy";
        //中间使用 空格 " " 隔开
        System.out.println(firstName + " " + lastName);
        // 输出 Jone Boy

        // + 加号运算符也可用于数字变量和数字变量相加，数字变量和字符串相加，字符串和字符串相加
        int num01 = 99, num02 = 88;
        String num03 = "33", num04 = "88";
        System.out.println(num01 + num02);//数字 + 数字 = 数字
        System.out.println(num03 + num04);//字符串 + 字符串 = 字符串
        System.out.println(num01 + num03);//数字 + 字符串 = 字符串

        /*
        要在字符串内表示一段引号需要用到反斜杠表示 \" \"
        类似的有  \"  \'  \\
         */
        String txt = "建立\"可持续性学习\"的意识，避免强迫学习，养成快乐学习的良好习惯";
        System.out.println(txt);
        //输出结果为 建立"可持续性学习"的意识，避免强迫学习，养成快乐学习的良好习惯

    }
}
class Study1802{
    public static void main(String[] args) {
        //Math类有很多方法，可以将数字进行数学运算

        //Math.max(x，y）方法可以用来找到x和y的最大值
        System.out.println(Math.max(9,10));//输出结果为10
        //Math.min(x,y)方法用来找到x，y中的最小值
        System.out.println(Math.min(9,10));//输出结果为9

        /*
        Math.sqrt(x) 方法返回 x 的平方根：
        如果 x 是一个负值，Math.sqrt(x) 会返回 NaN（非数字）not a number
        如果 x 是 0，Math.sqrt(x) 会返回 0
        如果 x 是正无穷大，Math.sqrt(x) 会返回正无穷大
        如果 x 是 Math.pow(2, 53) 或更大，Math.sqrt(x) 可能会失去精度
         */
        System.out.println(Math.sqrt(-9));//输出结果 NaN
        System.out.println(Math.sqrt(0));//输出结果 0.0
        System.out.println(Math.sqrt(9));//输出结果 3.0
        System.out.println(Math.sqrt(2.0e54));//输出结果 1.414213562373095E27

        //Math.abs(x）返回x的绝对值 常被用来做精度计算
        System.out.println(Math.abs(-9));//输出结果为9

        /*
        Math.random() 方法返回一个介于 0.0（包括）和 1.0（不包括）之间的随机数
        换句话说，这个方法生成的随机数大于或等于 0.0，但小于 1.0
        例如，它可能返回 0.12345、0.87654
        或 0.00001 等数值，但永远不会返回 1.0
         */
        System.out.println(Math.random());
        //输出 0.11019833411727453 [0,1)区间内随机一位数
        //如果想生成0-100之间的随机整数可以进一步优化此方法
        int randomNum = (int)(Math.random()*101);
        //生成[0,101)区间的随机数，再强制转换为整数所以结果在[0,100)区间的随机整数
        System.out.println(randomNum);//输出[0,100)的随机整数
        //以此类推 Math.random()可以看作是 Math.random()*1
    }
}
class Study1803{
    public static void main(String[] args) {
        //boolean 储存 true 和 false的值
        //boolean 使用boolean关键字声明，只能取 true 和 false两个值

        /*
        布尔表达式
        布尔表达式返回一个布尔值：真或假。这对于构建逻辑和查找答案非常有用
        例如，您可以使用比较运算符（如大于（>）运算符）来找出表达式（或变量）是真的还是假的
         */
        int a = 9, b = 10;
        System.out.println(a > b);//返回false 应为9比10小
        System.out.println(b > a);//返回true 同上
        //使用 == 相等符号比较变量返回boolean值
        int c =9;
        double d = 10;
        System.out.println(c == 9);//返回true
        System.out.println(d == c);//返回false
        char c1 = '9';
        System.out.println((int)c1);//返回57
        System.out.println(c1 == 9);//返回false 因为c1的值为57，不相等

        /*
        现实用例，使用Boolean返回值确定小明是否达到投票的年龄
        小明年龄为25，投票年龄限制为18
         */
        int xiaoMin = 25;
        int leastAge = 18;
        //System.out.println(xiaoMin >= leastAge);//返回true
        //带入if...else语句中，根据比较boolean返回的值输出不同的语句
        if (xiaoMin >= leastAge) System.out.println("您已达到最低投票年龄");
        else {
            System.out.println("您的年龄不符合投票要求");
        }
    }
}
class Study1804{
    public static void main(String[] args) {
        /*
        使用 if 语句来指定当某一指定条件为真时将要执行的代码块
        使用 else 语句来指定当同一条件为假时将要执行的代码块
        使用 else if 语句来指定当第一个条件为假时将要测试的新条件
        使用 switch 语句来指定许多可选的代码块来执行
         */

        //使用if语句指定当条件为真时要执行的代码块
    /*    if(condition){
             条件为真时执行的代码块
             }    */

        //if关键字为小写，若大写会报错
        if (20 > 10){
            System.out.println("20确实比10大");
        }
    }
}
class Study1805{
    public static void main(String[] args) {
        //使用else语句来指定当条件为假时输出的代码
/*        if(condition){
          条件为真时执行的代码块
          }else{
          条件为假时执行的代码块
          }
 */
    }
}
class Study1806{
    public static void main(String[] args) {
        //else if 语句在if条件为假时执行的新条件
        /*
        if(condition1){
        条件1为真时执行的代码块
        }else if（condition2){
        条件1为假而条件2为真时执行的代码块
        }else{
        条件1为假且条件2为假时执行的代码块
        }

         */
        //运用else if 语句，定义一个时间变量time
        //如果time等于18就去吃饭，小于等于20就去学习否则就去睡觉
        int time = 22;
        if (time == 18){
            System.out.println("现在该区吃饭");
        }else if (time <= 20){
            System.out.println("现在该学习了");
        }else{
            System.out.println("现在该睡觉了");
        }
    }
}
class Study1807{
    public static void main(String[] args) {
        /*
        还有一种简写的 if...else 语句，被称为三元运算符，因为它由三个操作数组成
        它可以用来将多行代码替换为单行代码，并且最常用于替换简单的 if...else 语句
         */
        //三元表达式可写为
        //变量 =（boolean表达式） ？ 当条件为真时赋值该表达式 ： 当条件为假时赋值该表达式
        //variable = (condition) ? expressionTrue : expressionFalse
        int time = 22;
        //三元表达式
        String  greetings = (time < 18) ? "下午好" : "晚上好";
        System.out.println(greetings);
    }
}
class Study1808{
    public static void main(String[] args) {
        //switch语句的基本用法
        //switch语句可以根据不同条件选择执行多个代码块中的一个
        //switch语句可以视代码更简洁易读，特别是处理多个互斥条件时
        //但是switch语句只能用于匹配特定类型的数据：整数、字符、枚举等，范围和更复杂的语句仍需if else
        int day = 3;
        switch (day){
            case 1:System.out.println("星期一");
            break;
            case 2:System.out.println("星期二");
            break;
            case 3:System.out.println("星期三");
            break;
            //可以创建更多case来匹配数据
            //break用于结束当前case语句并跳出switch循环
            //如果忽略break会执行case穿透
            //case穿透 当变量匹配某个case值后会从该case开始执行直到遇到break或switch结束
            //但是当多条语句共享一条代码块时可主动忽略break
            //Java12支持箭头语法（->）更简洁而且可以忽略break
            //case 3 -> System.out.println()
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("4，5，6，7共享一条代码块，忽略break");
            break;
            //default当所有case语句都未执行时执行default语句
            default:
                System.out.println("default一般放最后");
        }
    }
}
class Study1809{
    public static void main(String[] args) {
        //java while循环
        //while循环会在指定条件为真的情况下，反复执行一段代码块

        /*
        while (条件) {
                      循环体（在条件为真时重复执行）
                                              }
         */

        //执行流程
        //先检查条件，若条件为 true，则执行循环体。
        //执行完循环体后，再次检查条件，重复此过程。
        //若条件一开始就为 false，循环体一次都不执行。

        //在下面的代码中，只要变量 i 的值小于5就会反复执行代码块
        int i = 1;
        while (i < 5){
            System.out.println("i的值小于5");
            i++;
        //一共执行了四次"i的值小于5"

        //（do/while）循环是while循环的一种变体
        //这种循环会在检查条件是否为真之前先执行一次代码块，然后只要条件为真，它就会重复执行循环
        //下面这个代码使用了do/while循环，即使条件为假也会先执行一次循环，应为代码块在条件检测前执行
            int a = 0;
            do{
                System.out.println(a);
                a++;
            }while(a < 5);//每执行一次i循环就执行5次a循环 输出的值为 "i的值小于5" "0" "1" "2" "3" "4"
            //（do/while）循环嵌套在while循环体内，所以执行一次i循环后会执行5次do/while循环

            /*
            do {
                 循环体（至少执行一次）
            } while (条件);          // 注意分号！
             */

        //先执行一次循环体，然后检查条件
        //若条件为 true，重复执行循环体
        //即使条件一开始就为 false，循环体至少执行一次
        }
    }
}