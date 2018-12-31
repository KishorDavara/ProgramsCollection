package Upwork;

import java.util.Scanner;

/**
 *
 * @author KK Davara
 */
// Create adjacency node
class adjNode1 {

    int source;
    int destination;
    adjNode1 next;

    public adjNode1(int source, int destination) {
        this.source = source;
        this.destination = destination;
        next = null;
    }
}

class adjList1 {

    adjNode1 head;
}

class Graph3 {

    int V;
    adjList1 array[];
    
    // constructor of graph, initialize the number of vertex in graph
    // and create those many adjacency lists and initialize all heads to null
    
    public Graph3(int V) {
        this.V = V;
        array = new adjList1[V];
        for (int i = 0; i < V; i++) {
            array[i] = new adjList1();
            array[i].head = null;
        }
    }

    public void addEdge(int source, int destination) {
        // first create a forward edge source -> destination
        adjNode1 adn = new adjNode1(source, destination);
        // add this node to the source adj List
        if (array[source].head == null) {
            adn.next = array[source].head;
            array[source].head = adn;
        } else {
            array[source].head.next = adn;
        }
    }

    
    public void buildAdjacencyList(int[][] adjMatrix) {
        int vertex = adjMatrix.length;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (adjMatrix[i][j] == 1) {
                    addEdge(i, j);
                }
            }
        }

    }
    
    public void printAdjacencyList(Graph3 gph) {
        int vertex = gph.V;
        adjNode1 ad;
        System.out.print("Adjacency List:\n");
        for (int i = 0; i < vertex; i++) {
            ad = gph.array[i].head;
            if (ad != null) {
                System.out.print(ad.source);
                while (ad != null) {
                    System.out.print(" -> " + ad.destination);
                    ad = ad.next;
                }
                System.out.println("");
            }
        }
    }
    
    public Graph3 getAdjacencyList(Graph3 gph) {
      
      /*int vertex=gph.V;
      boolean []vertexStatus=new boolean[vertex];
      int count=0;
      int flag=0;
      int destinationVertex;
      Scanner sc=new Scanner(System.in);
      for(int sourceVertex=0;sourceVertex<vertex;sourceVertex++){
        System.out.println("Enter the destination vertex of source vertex "+sourceVertex);
        System.out.println("Do you want to add any destination vertex for source vertex "+sourceVertex+"\n 1.For Yes \n2.For No");
        flag=sc.nextInt();
        
        while(count<=vertex && flag==1){
            System.out.println("Enter the destination vertex of souce vertex "+sourceVertex);
            destinationVertex=sc.nextInt();
            if(vertexStatus[destinationVertex])
            {
                System.out.println("You have already added this destination vertex for source vertex "+sourceVertex);
                continue;
            }
            count++;
            if(count>vertex){
                System.out.println("You can not add more than "+vertex+" destination vertex");
                flag=0;
                continue;
            }
            vertexStatus[destinationVertex]=true;
            addEdge(sourceVertex,destinationVertex);
            System.out.println("Do you want to add more destination vertex for source vertex "+sourceVertex+"\n 1.For Yes \n2.For No");
            flag=sc.nextInt();
            
        } 
        for(int i=0;i<vertex;i++) {
            vertexStatus[i]=false;
        }
      }*/
       gph.addEdge(0, 1);
       gph.addEdge(0, 2);
       gph.addEdge(0, 3);
       gph.addEdge(1, 2);
       gph.addEdge(2, 4);
      return gph;
    }
    
    public int[][] buildAdjacencyMatrix(Graph3 G) {
        int vertex = G.V;
        int[][] adjMatrix = new int[vertex][vertex];
        adjNode1 ad;
        for (int i = 0; i < vertex; i++) {
            ad = G.array[i].head;
            if (ad != null) {
                while(ad != null) {
                     adjMatrix[ad.source][ad.destination]=1;
                     ad = ad.next;
                }
                System.out.println("");
            }
        }
      return adjMatrix;  
    }
    
    public void printAdjacencyMatrix(int [][]adjMatrix){
        int vertex=adjMatrix.length;
        System.out.println("Adjacency Matrix:");
        
           for (int i = 0; i < vertex; i++) {
                System.out.print((i+1)+" ");
            }
            System.out.println("");
            for (int i = 0; i < vertex; i++) {
                System.out.print((i+1)+" :");
                for (int j = 0; j < vertex; j++) {
                    System.out.print(adjMatrix[i][j]+" ");
                }
                System.out.println("");
            }
    }
}

public class AdjList {

    /**
     * @param args the command line arguments
     *
     */
    
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int vertex;
            System.out.println("Enter 1 for Conversion from Adjacency Matrix to Adjacency List");
            System.out.println("Enter 2 for Conversion from Adjacency List to Adjacency Matrix");
            int choice=sc.nextInt();
            Graph3 gph;
            switch(choice) {
                case 1:
                       System.out.println("Enter the number of vertex");
                       vertex = sc.nextInt();
                       gph = new Graph3(vertex);
                       int[][] adjMatrix = new int[vertex][vertex];
                       System.out.println("Enter the Adjacency Matrix");
                       for (int i = 0; i < vertex; i++) {
                         for (int j = 0; j < vertex; j++) {
                                adjMatrix[i][j] = sc.nextInt();
                            }
                        }
                        gph.buildAdjacencyList(adjMatrix);
                        gph.printAdjacencyList(gph);
                        break;
                case 2:
                       gph = new Graph3(5);
                       gph.addEdge(0, 1);
                       gph.addEdge(0, 2);
                       gph.addEdge(0, 3);
                       gph.addEdge(1, 2);
                       gph.addEdge(2, 4);
                       gph.printAdjacencyList(gph);
                       int [][]resultedAdjMatrix=gph.buildAdjacencyMatrix(gph);
                       gph.printAdjacencyMatrix(resultedAdjMatrix);
                       break;
                default:
                        System.out.println("Enter the correct choice");
                        break; 
            }
            
            
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}
