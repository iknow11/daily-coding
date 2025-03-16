class Ver01{     //应当使用大驼峰命名法
	public static void main(String[]args){
        int age = 23;//int表示整型
        double score = 99.9;//double表示浮点型
        char gender = '男';
        String name = "iknow";//String是字符串型
        // \t错误的放在字符串外,字符串缺少+链接
        System.out.println("年龄=" + age + "\t成绩=" + score + "\t性别=" + gender + "\t姓名=" + name);

	}
}