/*
 * Selection Sort
 * Written By : SALHAOUI Abdelmonaim
 * 2019-2020
 */

package selectionSort;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class selectionSort extends JPanel {

	public static void swap(String a, String b) {
		String temp;

		temp = a;
		a = b;
		b = temp;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.black);
		g2d.setFont(new Font("default", Font.BOLD, 16));

		String[] arr = { "s", "e", "l", "e", "c","t","i","o","n","s","o","r","t" };
		
		int step = 0;
		int x = 30;
		int y = 50;
		
		for (String string : arr) {
			g2d.drawString(string, x+step, y);
			step+=30;
		}
		

		int i, j;
		int min = 0;
		String temp;
		x = 30;
		y = 100;
		
		for (i = 0; i < arr.length; i++) {
			min = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			step= 0;
			
			
			for (String string : arr) {
				
				
				g2d.drawString(string, x+step, y);
				step+=30;
				
			}
			y+=30;
			
		}

		
	}

	public static void main(String[] args) {
		
		selectionSort lines = new selectionSort();
		JFrame frame = new JFrame("Selection Sort");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(lines);
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);


	}

}
