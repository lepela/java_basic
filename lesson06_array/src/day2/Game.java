package day2;

public class Game {
	class Position {
		int idx;
		int x;
		int y;
		public Position(int idx, int x, int y) {
			this.idx = idx;
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return "Position [idx=" + idx + ", x=" + x + ", y=" + y + "]";
		}
		
	}
	Position[] positions = new Position[16];
	{
		int cnt = 0;
		positions[cnt++] = new Position(cnt, 0, 0);
		positions[cnt++] = new Position(cnt, 0, 1);
		positions[cnt++] = new Position(cnt, 0, 2);
		positions[cnt++] = new Position(cnt, 0, 3);
		positions[cnt++] = new Position(cnt, 0, 4);
		positions[cnt++] = new Position(cnt, 1, 4);
		positions[cnt++] = new Position(cnt, 2, 4);
		positions[cnt++] = new Position(cnt, 3, 4);
		positions[cnt++] = new Position(cnt, 4, 4);
		positions[cnt++] = new Position(cnt, 4, 3);
		positions[cnt++] = new Position(cnt, 4, 2);
		positions[cnt++] = new Position(cnt, 4, 1);
		positions[cnt++] = new Position(cnt, 4, 0);
		positions[cnt++] = new Position(cnt, 3, 0);
		positions[cnt++] = new Position(cnt, 2, 0);
		positions[cnt++] = new Position(cnt, 1, 0);
	}
	Position findByXY(int x, int y) {
		Position position = null;
		for(Position p : positions) {
			if(p.x == x && p.y == y) 
			position = p;
		}
		return position;
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(i == 0 || i == 4 || j == 0 || j == 4) {
					System.out.printf("%3d", game.findByXY(i, j).idx); 
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
