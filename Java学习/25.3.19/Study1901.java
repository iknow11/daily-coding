public class Study1901{
    public static void main(String[]args){
        //将while循环和if else条件语句结合
        //下面这段代码，当dice小于等于6时输出yeezy
        int dice = 1;
        while(dice <= 6){
            if(dice < 6){
                System.out.println("没有yeezy");
            }else{
                System.out.println("有yeezy");
            }dice++;
        }//先输出5次"没有yeezy"在输出一次"有yeezy"
    }
}
class Study1902{
    public static void main(String[]args){
        //Java的for循环 明确遍历循环次数时使用for循环
        //for循环的基本循环结构
        /*
        for(初始语句；循环条件；迭代语句){
        执行的循环体
        }
        初始语句：循环开始前执行一次，一般用于初始化循环计数器或变量
        条件语句：每次循环开始前检测一次，循环执行的条件，true则执行循环false则退出循环
        迭代语句：循环结束后执行一次，一般用于更新循环计数器或变量
        for循环的执行流程：先执行初始语句初始化计数器，在进行条件检测，为true进入循环
        循环结束执行迭代语句，更新计数器，再次进行循环条件检测，为true则继续循环，为false跳出循环
         */

         //用一段for循环语句计算1到10的整数和
         int num = 0;
         for(int i = 1;i <= 10;i++){
            num += i;
         }
         System.out.println(num);//算出1到10的整数和
    }
}
class Study1903{
    public static void main(String[]args){
        //嵌套循环 内层循环将为外层的每次循环迭代执行一次

        //以下代码外层循环每迭代一次，内层循环就执行一次
        for(int a = 1;a < 3;a++){
            System.out.println("外层循环执行次数：" + a);
            for(int b = 1, c = 0;b < 3;b++){
                c++;
                System.out.println("内层循环执行第" + c + "次");
            }
           
        }//外层每循环一次，内层循环两次
    }
}
class Study1904{
    public static void main(String[]args){
        //foreach循环是一种简化遍历数组或集合中每个元素的循环结构
        //它的主要优点是代码更简洁，无需显式地管理索引变量

        /*
        for(type variablename : arrayName){
         循环体}

         type：这是数组或集合中元素的数据类型。
         variableName：这是一个临时变量，用于在每次迭代中存储当前元素的值。这个变量只在循环体内有效。
         arrayName：这是你要遍历的数组或集合的名称。
         在每次循环迭代中，variableName 会被依次赋值为 arrayName 中的每个元素，然后执行循环体内的代码块。
         */

         //foreach循环代码
         int [] numbers = {1,2,3,4,5};
         for(int number : numbers){
            System.out.println(number);
         }//数组相当于一个收纳盒，foreach循环可以让你快速找到收纳盒中的物品
         String [] foods = {"apple","banana","orige","meat"};
         for(String food : foods){
            if(food.equals("meat")){
            }
         }// 字符串变量.equals .equals是一个方法，专门用来比较字符串内容是否相同，返回boolean值
    }
}
class Study1905{
    public static void main(String[]args){
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;//break用来终结并跳出最近的循环语句如for while do-while，还有switch条件语句
            }
            System.out.println(i);
          }
          //continue是流程控制语句中的一种，用于终结当前循环并直接进行下一轮迭代
          /*
           for(初始化语句;循环条件;更新){
           if(特定条件){
           continue;
           }
           for循环中其他代码块
           }
           */
          //continue在while/for循环中的应用
          int i = 0;
          while (i < 10) {
            if (i == 4) {
                i++;
                continue;//当i为4时，结束循环并开始下次循环
            }
            System.out.println(i);
            i++;
            }
                }
}
class Study1906{
    public static void main(String[]args){
        //java数组 数组用于在单个变量中存储多个值，而不是为每个值声明单独的变量
        //要声明一个数组，请使用方括号定义变量类型,结构如下
        //数组中的每个元素用 ， 隔开
        String[] name = {"羊肉","狼肉"};//数组定义时需要直接赋值，不能换行赋值
        System.out.println(name[0]);//数组序号从0开始，0时第一个元素

        //更改数组中特定元素的值
        int[] num = {1,2,3,4,5};
        num[4] = 0;//采用序号更改特定元素的值
        System.out.println(num[4]);

        //可应用.length来计算数组的长度/元素的个数
        System.out.println(num.length);//.length也可以计算字符串中字符长度

        //使用for循环遍历数组元素，使用length控制循环次数
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 1;i <= nums.length;i++){//i为临时变量，只在循环内有效
            System.out.println("遍历循环第" + i + "次"); 
        }
        //上文中Study1904中foreach循环专用于遍历循环数组
        for(int i : nums){//int数组变量类型 i临时储存数组元素的变量 nums数组
            System.out.println("foreach遍历循环:" + i);
        }
    }
}
//使用数组和for循环来计算人的平均岁数
class Study1907{
    public static void main(String[]args){
        //定义一个数组ages记录十人的年龄
        int[] ages = {23,45,12,34,64,32,41,25,64,74};
        //计算数组中人数
        int num = ages.length;
        //for循环遍历数组求年龄总数years
        int years = 0;
        for(int nums : ages){
            years += nums;
        }
        //用总数除以人数得平均数
        int levelAges = years / num;
        System.out.println(levelAges);
    }
}
//使用for循环和if条件语句找数组中最小的元素min
class Study1908{
    public static void main(String[]args){
        //定义数组ages
        int[] ages = {123,14,43,645,32,234,64,72,14,56,321,52,51,45,52};
        //定义一个最小整型变量leastAge
        int leastAge = ages[0];//定义的关键变量要放在循环外，循环内定义的变量是临时变量，不能在循环外使用
        //使用for循环遍历数组
        for(int age : ages){
            //使用if语句，找到比leastAge小的数
            if(leastAge > age){
                leastAge = age;
            }
        }
        System.out.println(leastAge);
    }
}
//多维数组
class Study1909{
    public static void main(String[]args){
        //多维数组就是数组的数组，如下
        int[][] a = {{1,2,3},{4,5,6}};
        //要访问多维数组中的元素需要多次索引，如
        System.out.println(a[1][0]);//输出第二个数组中的第一个元素 
        //更改元素的方法同上
    }
}
//多维数组的for遍历循环
class Study1910{
    public static void main(String[]args){
                int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
        for (int j = 0; j < myNumbers[i].length; ++j) {
            System.out.println(myNumbers[i][j]);//输出1到7
            }
        }
        //或者使用foreach循环
                    int[][] myNumber = { {1, 2, 3, 4}, {5, 6, 7} };
            for (int[] row : myNumber) {
            for (int i : row) {
                System.out.println(i);//输出1到7
            }
            }
    }
}