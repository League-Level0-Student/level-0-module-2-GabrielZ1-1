package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class RandomLotteryNumbers {
	public static void main(String[] args) {
		Random ran = new Random();

		int one = ran.nextInt(50);
		int two = ran.nextInt(50);
		int three = ran.nextInt(50);
		int four = ran.nextInt(50);
		int five = ran.nextInt(50);
		int six = ran.nextInt(50);

		JOptionPane.showMessageDialog(null, one + "  " + two + "  " + three + "  " + four + "  " + five + "  " + six, "Lottery Ticket", JOptionPane.INFORMATION_MESSAGE);


	}
}



