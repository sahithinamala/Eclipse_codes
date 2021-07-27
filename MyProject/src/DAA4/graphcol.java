package DAA4;

public class graphcol{
	static int V = 5;
	static void printSolution(int[] color)
	{
		System.out.println("Solution Exists:"  +
	" Following are the assigned colors ");
		for (int i = 0; i<V; i++)
			System.out.print("  " + color[i]);
		System.out.println();
  }
	
	static boolean isSafe(boolean[][] graph, int[] color){
		for (int i = 0; i<V; i++)
			for (int j = i + 1; j<V; j++)
				if (graph[i][j] &&color[j] == color[i])
					return false;
		return true;
  }
	static boolean graphColoring(boolean[][] graph, int m, int
			i, int[] color){
		if (i == V) {
			if (isSafe(graph, color)){
				printSolution(color);
				return true;
      }
			return false;
    }
		for (int j = 1; j<= m; j++)
    {
        color[i] = j;
        if (graphColoring(graph, m, i + 1, color))
        	return true;
        color[i] = 0;
    }
		return false;
  } 
	public static void main(String[] args){
		boolean[][] graph = {
				{ false, true, true, true,true },
				{ true, false, true, false,false },
				{ true, true, false, true,true },
				{ true, false, true, false ,false},
             };
		int m = 4; 
		int[] color = new int[V];
		for (int i = 0; i<V; i++)
			color[i] = 0;
		if(!graphColoring(graph, m, 0, color))
			System.out.println("Solution does not exist");
  }
}

