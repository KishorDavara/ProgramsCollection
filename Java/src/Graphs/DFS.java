package Graphs;
import java.util.Stack;
/**
 *
 * @author KK Davara
 */
class Vertex
{
    private char label;
    private boolean visited;
    
    public Vertex(char c)
    {
        setLabel(c);
        setVisited(false);
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
}

class Graph
{
    private final int MAX_VERTEX=20;
    private Vertex vertextList[];
    private int adjMatrix[][];
    private int noVertices;
    private Stack<Integer> stack;
    
    public Graph()
    {
        vertextList=new Vertex[MAX_VERTEX];
        adjMatrix=new int[MAX_VERTEX][MAX_VERTEX];
        noVertices=0;
        for(int j=0; j<MAX_VERTEX; j++) // set adjacency
            for(int k=0; k<MAX_VERTEX; k++) // matrix to 0
                 adjMatrix[j][k] = 0;
        stack=new Stack<>();
    }
    
    public void addVertex(char label) {
        vertextList[noVertices++]=new Vertex(label);
    }
    
    public void addEdge(int start,int end) {
        adjMatrix[start][end]=1;
        adjMatrix[end][start]=1;
    }
    
    public void displayVertex(int v) {
        System.out.print(vertextList[v].getLabel());
    }
    
    // returns an unvisited vertex adj to v
    public int getUnvisitedAdjVertex(int v) {
        for(int i=0;i<noVertices;i++) {
            if(adjMatrix[v][i]==1 && vertextList[i].isVisited()==false) {
                return i;
            }
        }
       return -1; 
    }
    
    public void dfs()
    {
        vertextList[0].setVisited(true);
        displayVertex(0);
        stack.push(0);
        while(!stack.empty()) {
        int v=getUnvisitedAdjVertex(stack.peek());
        if(v==-1)
            stack.pop();
        else {
            vertextList[v].setVisited(true);
            displayVertex(v);
            stack.push(v);
         }
        }
        //Stack becomes empty , we are done so reset the flag
        for(int j=0;j<noVertices;j++) {
          vertextList[j].setVisited(false);
        }
    }
    
    public void mst() { //for unweighted graph
      vertextList[0].setVisited(true);
      stack.push(0);
      while(!stack.empty()) {
          int curr=stack.peek();
          int v=getUnvisitedAdjVertex(curr);
          if(v==-1) 
              stack.pop();
          else {
              vertextList[v].setVisited(true);
              stack.push(v);
              displayVertex(curr);
              displayVertex(v);
              System.out.print(" ");
          }
      }
      //Stack becomes empty , we are done so reset the flag
        for(int j=0;j<noVertices;j++) {
          vertextList[j].setVisited(false);
        }
    }
    
}
public class DFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Graph theGraph = new Graph();
      /*theGraph.addVertex('A'); // 0 (start for dfs)
      theGraph.addVertex('B'); // 1
      theGraph.addVertex('C'); // 2
      theGraph.addVertex('D'); // 3
      theGraph.addVertex('E'); // 4
      theGraph.addVertex('F'); //5
      theGraph.addEdge(0, 1); // AB
      theGraph.addEdge(0, 2); // AC
      theGraph.addEdge(0, 3); // AD  
      theGraph.addEdge(0, 5); // AF 
      theGraph.addEdge(1, 2); // BC
      //theGraph.addEdge(1, 0); // BA
      //theGraph.addEdge(2, 0); // CA
      //theGraph.addEdge(2, 1); // CB
      theGraph.addEdge(2, 3); // CD
      theGraph.addEdge(2, 4); // CE
      //theGraph.addEdge(3, 0); // DA 
      //theGraph.addEdge(3, 2); // DC
      theGraph.addEdge(3, 4); // DE
      //theGraph.addEdge(4, 2); // EC
      //theGraph.addEdge(4, 3); // ED
      //theGraph.addEdge(5, 0); // FA
      */
       theGraph.addVertex('A'); // 0 (start for dfs)
       theGraph.addVertex('B'); // 1
       theGraph.addVertex('C'); // 2
       theGraph.addVertex('D'); // 3
       theGraph.addVertex('E'); // 4
       theGraph.addEdge(0, 1); // AB
       theGraph.addEdge(1, 2); // BC
       theGraph.addEdge(0, 3); // AD
       theGraph.addEdge(3, 4); // DE
       System.out.print("Visits: ");
      theGraph.dfs(); // depth-first search
      System.out.println();
    }
    
}
