package Graphs;
/**
 *
 * @author KK Davara
 */
// Create adjacency node
class adjNode1 {
    int source;
    int destination;
    adjNode1 next;

    public adjNode1(int source,int destination) {
        this.source = source;
        this.destination = destination;
        next = null;
    }
}

class adjList1 {

    adjNode1 head;
}

class Graph3{

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
        adjNode1 tmp=adn;
        
        adn.next = array[source].head;
        array[source].head = adn;
        
 // now create a reverse edge since its a undirected graph
 //	adn = new adjNode1(source);
 //	adn.next = array[destination].head;
 //	array[destination].head = adn;
    }

    public void printGraph(Graph3 gph) {
        int vertex = gph.V;
        adjNode1 ad;
        for (int i = 0; i < vertex; i++) {
            ad = gph.array[i].head;
            if (ad != null) {
                System.out.println("\nNodes connected to Vertex " + ad.source
                        + " are :");
                while (ad != null) {
                    System.out.print(" " + ad.destination);
                    ad = ad.next;
                }
            }
        }
    }
}


public class AdjList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph3 gph = new Graph3(5);
        gph.addEdge(0, 1);
        gph.addEdge(0, 2);
        gph.addEdge(0, 3);
        gph.addEdge(1, 2);
        gph.addEdge(2, 4);
        gph.printGraph(gph);
    }
    
}
