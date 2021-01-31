package cn.butcher.example.test;

/**
 * @Author: butcher
 * @Date: 2021/01/31/8:56
 */
public class Test02 {
    public static void main(String[] args) {
        int count = 1;
        if (count<=12){
            count = 1;
        }else {
            count = count/12+1;
        }

        System.out.println(count);
    }
}
