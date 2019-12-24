/*
 * A Basic implementation of the Nearest Neighbor Heuristic (N.N.H) algorithm
 * Written By : SALHAOUI Abdelmonaim
 * 2019-2020
 */
package nearest_neighbor_heuristic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		ArrayList<myClass> arr = new ArrayList<myClass>();

		g2d.setColor(Color.black);

		
		for (int i = 0; i < 100; i++) {

			int x = (int) (Math.random() * 700 );
			int y = (int) (Math.random() * 490 );

			g2d.drawOval(x, y, 3, 3);
			g2d.fillOval(x, y, 3, 3);

			arr.add(new myClass(new Point(x, y), false));

		}

		

		g2d.drawString("0", arr.get(0).getP().x + 5, arr.get(0).getP().y + 5);
		// arr.get(0).getP().

		double initD = 1000;
		double d = 0;
		int i;
		int indexOfNextP = 0;

		myClass initialP = arr.get(0);

		while (initialP.isVisited() == false) {
			System.out.println("-----------------" + initialP + "-------------");
			for (i = 0; i < arr.size(); i++) {
				d = distance(initialP.getP(), arr.get(i).getP());
				System.out.println(d);
				if (d < initD && arr.get(i).isVisited() == false && !initialP.getP().equals(arr.get(i).getP())) {
					// System.out.println(d+" Point is ======" + arr.get(i).getP());
					initD = d;
					indexOfNextP = i;
				}

			}

			System.out.println("=====" + indexOfNextP + "======");

			g2d.drawLine(initialP.getP().x, initialP.getP().y, arr.get(indexOfNextP).getP().x,
					arr.get(indexOfNextP).getP().y);
			g2d.drawString(indexOfNextP + "", arr.get(indexOfNextP).getP().x + 10, arr.get(indexOfNextP).getP().y + 10);

			initialP.setVisited(true);

			initD = 1000;
			d = 0;
			initialP = arr.get(indexOfNextP);
			System.out.println(initialP.getP());

		}

		g2d.drawLine(initialP.getP().x, initialP.getP().y, arr.get(0).getP().x, arr.get(0).getP().y);

	}

	public static void main(String[] args) {

		Test2 lines = new Test2();
		JFrame frame = new JFrame("N.N.H");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(lines);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	public static double distance(Point p1, Point p2) {

		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}
	

}
