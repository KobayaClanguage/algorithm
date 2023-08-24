import java.util.Random;

class maze_dig{
	public static void main(String[] args){
		String [][] maze = new String[100][100];

		//通路を$、壁を#として迷路を初期化する
		for(int i = 0; i < 29; i++){
			for(int j = 0; j < 29; j++){
				maze[i][j] = "#";
			}
		}

		maze = dig(1,1,maze);

		//迷路表示	
		for(int i = 0; i < 29; i++){
			for(int j = 0; j < 29; j++){
				if(i == 1 && j == 0){
					System.out.print("S");
				}else if(i == 27 && j == 28){
					System.out.print("G");
				}else{
					System.out.print(maze[i][j]);
				}

				if(j == 28){
					System.out.println("");
				}
			}
		}
	}


	//穴掘り用関数
	private static String[][] dig(int x, int y, String[][] maze){
		Random random = new Random();
		//direction = 1;
		boolean up = true;
		boolean down = true;
		boolean right = true;
		boolean left = true;

		while(up || down || right || left){
			int direction = random.nextInt(4);
			if(direction == 0){
				if(x - 2 > 0 && maze[x - 2][y] == "#"){
					maze[x - 1][y] = " ";
					maze[x - 2][y] = " ";
					dig(x - 2, y, maze);
				}else{
					up = false;
					//dig(x, y, maze);
				}
			}
			
			if(direction == 1){
				if(x + 2 < 29 && maze[x + 2][y] == "#"){
					maze[x + 1][y] = " ";
					maze[x + 2][y] = " ";
					dig(x + 2, y, maze);
				}else{
					down = false;
					//dig(x, y, maze);
				}
			}

			if(direction == 2){
				if(y - 2 > 0 && maze[x][y - 2] == "#"){
					maze[x][y - 1] = " ";
					maze[x][y - 2] = " ";
					dig(x, y - 2, maze);
				}else{
					left = false;
					//dig(x, y, maze);
				}
			}

			if(direction == 3){
				if(y + 2 < 29 && maze[x][y + 2] == "#"){
					maze[x][y + 1] = " ";
					maze[x][y + 2] = " ";
					dig(x, y + 2, maze);
				}else{
					right = false;
					//dig(x, y, maze);
				}
			}
			
		}
		return maze;
	}
}