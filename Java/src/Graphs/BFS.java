/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author KK Davara
 */

class Vertex1
{
    private char label;
    private boolean visited;
   
    public Vertex1(char label) {
        setLabel(label);
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

class Graph1
{
 private final int MAX_VERTEX=20;
 private Vertex1 vertextList[];
 private int adjMatrix[][];
 private int noVertices;
 private Queue<Integer> q;
 
 public Graph1()
 {
   vertextList=new Vertex1[MAX_VERTEX];
   adjMatrix=new int[MAX_VERTEX][MAX_VERTEX];
   for(int i=0;i<MAX_VERTEX;i++) {
       for(int j=0;j<MAX_VERTEX;j++) {
           adjMatrix[i][j]=0;
       }
   }
   noVertices=0;
   q=new LinkedList<Integer>();
 }
 
 public void addVertex(char v) {
     vertextList[noVertices++]=new Vertex1(v);
 }
 
 public void addEdge(int start,int end ) {
     adjMatrix[start][end]=1;
     adjMatrix[end][start]=1;
 }
 
 public int getUnvisitedAdjVertex(int v) {
     for(int i=0;i<noVertices;i++) {
         if(adjMatrix[v][i]==1 && vertextList[i].isVisited()==false) 
             return i;
     }
     return -1;
 }
 
public void displayVertex(int v) {
    System.out.print(vertextList[v].getLabel()+" ");
}  

public void bfs() {
    vertextList[0].setVisited(true);
    displayVertex(0);
    q.add(0);
    while(!q.isEmpty()) {
      int v1=q.remove();
      int v2=getUnvisitedAdjVertex(v1);
      while(v2!=-1) {
          vertextList[v2].setVisited(true);
          displayVertex(v2);
          q.add(v2);
          v2=getUnvisitedAdjVertex(v1);
      }
    }
  //Queue is empty so we are done reset the flag
    for(int i=0;i<noVertices;i++) {
        vertextList[i].setVisited(false);
    }
}
}
public class BFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Graph1 theGraph = new Graph1();
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
       theGraph.bfs(); // breadth-first search
       System.out.println();
    }
    
}
