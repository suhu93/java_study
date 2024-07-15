package test;

/**
 * ClassName: grammerTest
 * Package: test
 * Description: 用于学习语法，进行测试
 *
 * @Author mrq
 * @Create 2024/7/15 16:37
 * @Version 1.0
 */
public class grammerTest {
    public static void main(String[] args) {
        String str = "Java,Java, hello,world!";
        String newStr = str.replaceAll("Java", "尚硅谷"); //算法
        System.out.println("newStr=" + newStr);
    }
}
