package graph;

public class FloydWarshall {

	public static void main(String[] args) {
		
		int V = 4; // number of vrtices
		
		// 10000 represents infinity
		int[][] graph = {{0, 3, 10000, 7}, 
						 {8, 0, 2, 10000}, 
						 {10000, 10000, 0, 1}, 
						 {2, 10000, 10000, 0}};
		
		int[][] dist = new int[V][V]; // distance matrix
		
		for(int i = 0; i < dist.length; i++) {
			for(int j = 0; j < dist[0].length; j++) {
				dist[i][j] = graph[i][j];
			}
		}
		
		for(int k = 0; k < V; k++) {
			for(int i = 0; i < V; i++) {
				for(int j = 0; j < V; j++) {
					
					int oc = dist[i][j]; // old cost
					int nc = dist[i][k] + dist[k][j]; // new cost
					
					if(nc < oc) {
						dist[i][j] = nc;
					}
				}
			}
		}
		
		for(int i = 0; i < dist.length; i++) {
			for(int j = 0; j < dist[0].length; j++) {
				System.out.print(dist[i][j] + " ");
			}
			System.out.println();
		}

	}

}
