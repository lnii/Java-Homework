package chapter5;

import java.util.Scanner;

public class class34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int computer_win = 0, people_win = 0;
        for (; ; ) {
            // �������������ʯͷ�������Ĵ���
            int computer = (int) (Math.random() * 3);
            Scanner input = new Scanner(System.in);
            System.out.println("rock(0), scissor(1), paper(2): ");
            int people = input.nextInt();

            // �ж����������Ƿ�Ϸ�
            if (people != 0 && people != 1 && people != 2) {
                System.out.println("���벻�Ϸ�");
            }

            // ����ж�
            if (computer == 0 && people == 1)
                computer_win += 1;
            else if (computer == 0 && people == 2)
                people_win += 1;
            else if (computer == 1 && people == 0)
                people_win += 1;
            else if (computer == 1 && people == 2)
                computer_win += 1;
            else if (computer == 2 && people == 0)
                computer_win += 1;
            else if (computer == 2 && people == 1)
                people_win += 1;
            else
                System.out.print("����ƽ��\t");

            // �����ǰ�ȷֲ��ж��Ƿ���Ҫ����ѭ��
            System.out.println("����:���������Ϊ��" + people_win + ":" + computer_win);
            if (computer_win == 3 || people_win == 3){
                String str = (computer_win == 3) ? "�����ʤ" : "����ʤ";
                System.out.println(str);
                return;
            }
        }
	}

}
