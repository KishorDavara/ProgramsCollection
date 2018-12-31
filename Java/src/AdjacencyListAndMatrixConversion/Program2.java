package AdjacencyListAndMatrixConversion;

import java.util.Scanner;

/**
 *
 * @author KK Davara
 */

// Create adjacency node
class adjNode {

    int source;
    int destination;
    adjNode next;

    public adjNode(int source, int destination) {
        this.source = source;
        this.destination = destination;
        next = null;
    }
}

class adjList {

    adjNode head;
}

class Graph {

    int V;
    adjList array[];
    
    // constructor of graph, initialize the number of vertex in graph
    // and create those many adjacency lists and initialize all heads to null
    
    public Graph(int V) {
        this.V = V;
        array = new adjList[V];
        for (int i = 0; i < V; i++) {
            array[i] = new adjList();
            array[i].head = null;
        }
    }

    public void addEdge(int source, int destination) {
        // first create a forward edge source -> destination
        adjNode adn = new adjNode(source, destination);
        // add this node to the source adj List
        if (array[source].head == null) {
            adn.next = array[source].head;
            array[source].head = adn;
        } else {
            array[source].head.next = adn;
        }
    }

   /*
    This function convert Adjacency Matrix into Adjacency List
    */ 
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
    
    /*
    This function prints Adjacency List
    */ 
    public void printAdjacencyList(Graph gph) {
        int vertex = gph.V;
        adjNode ad;
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
    
   /*
    This function convert Adjacency List into Adjacency Matrix
    */  
    public int[][] buildAdjacencyMatrix(Graph G) {
        int vertex = G.V;
        int[][] adjMatrix = new int[vertex][vertex];
        adjNode ad;
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
   /*
    This function prints Adjacency Matrix
    */ 
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

public class Program2 {

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
            Graph gph;
            switch(choice) {
                case 1:
                       System.out.println("Enter the number of vertex");
                       vertex = sc.nextInt();
                       gph = new Graph(vertex);
                       int[][] adjMatrix = new int[vertex][vertex];
                       System.out.println("Enter the Adjacency Matrix");
                       
                       for (int i = 0; i < vertex; i++) {
                         for (int j = 0; j < vertex; j++) {
                             /*
                               Enter 1 if there is edge from 1 vertex to other vertex
                               otherwise enter 0
                              */
                              adjMatrix[i][j] = sc.nextInt();
                            }
                        }
                        gph.buildAdjacencyList(adjMatrix);
                        gph.printAdjacencyList(gph);
                        break;
                case 2:
                       gph = new Graph(5);
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
