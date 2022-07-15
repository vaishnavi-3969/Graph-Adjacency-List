import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
    private LinkedList<Integer>[] adj;
    private int V; //no of vertices
    private int E; //no of edges
    public Graph(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for(int v = 0; v<V; v++){
            adj[v] = new LinkedList<>();
        }
    }
    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(v);
        E++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for(int v = 0; v < V; v++){
            sb.append(v + ": ");
            for(int w: adj[v]){
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
    }
}
/*
* 4 vertices, 4 edges
0: 1 0
1: 1 2
2: 2 3
3: 3 0 */