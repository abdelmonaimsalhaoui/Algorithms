/*
 * A Basic implementation of the Nearest Neighbor Heuristic (N.N.H) algorithm
 * Written By : SALHAOUI Abdelmonaim
 * 2019-2020
 */

package nearest_neighbor_heuristic;

import java.awt.Point;

public class myClass {
	
	private Point p;
	private boolean visited;
	
	public myClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public myClass(Point p, boolean visited) {
		super();
		this.p = p;
		this.visited = visited;
	}

	@Override
	public String toString() {
		return "myClass [p=" + p + ", visited=" + visited + "]";
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + (visited ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myClass other = (myClass) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (visited != other.visited)
			return false;
		return true;
	}
	
	

}
