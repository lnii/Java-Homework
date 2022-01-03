package chapter5;

import java.util.Scanner;

public class class36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i, temp, count, result, d10;
        String str;

        // 获取数据
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        i = input.nextInt();
        temp = i;

        str = "";
        if (i / 100000000 == 0){
            str = "0";
        }
        str += temp;

        // 处理数据：赋值d1~d9
        count = 0;
        result = 0;
        for (int m = 100000000; m >= 1; m /= 10){
            ++count;
            result = count * i / m;
            i %= m;
        }

        // 求d10
        d10 = result % 11;

        // 输出
        if(d10 < 10) {
            str += d10;
        }else{
            str += "X";
        }
        System.out.println("The ISBN-10 number is " + str);
	}

}
