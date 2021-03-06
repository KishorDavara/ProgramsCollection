package Graphs;
/**
 *
 * @author KK Davara
 */

// Create adjacency node
class adjNode {
    int source;
    int destination;
    adjNode next;

    public adjNode(int source,int destination) {
        this.source = source;
        this.destination = destination;
        next = null;
    }
}

class adjeList{

    adjNode head;
}

class Graph2 {

    int V;
    adjeList array[];
// constructor of graph, initialize the number of vertex in graph
// and create those many adjacency lists and initialize all heads to null

    public Graph2(int V) {
        this.V = V;
        array = new adjeList[V];
        for (int i = 0; i < V; i++) {
            array[i] = new adjeList();
            array[i].head = null;
        }
    }

    public void addEdge(int source, int destination) {
// first create a forward edge source -> destination
        adjNode adn = new adjNode(source, destination);
// add this node to the source adj List
        adn.next = array[source].head;
        array[source].head = adn;
// now create a reverse edge since its a undirected graph
//	adn = new adjNode(source);
//	adn.next = array[destination].head;
//	array[destination].head = adn;
    }

    public void printGraph(Graph2 gph) {
        int vertex = gph.V;
        adjNode ad;
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

public class GraphRepresentation {
   public static void main(String args[]) {
        Graph2 gph = new Graph2(5);
        gph.addEdge(0, 1);
        gph.addEdge(0, 2);
        gph.addEdge(0, 3);
        gph.addEdge(1, 2);
        gph.addEdge(2, 4);
        gph.printGraph(gph);
    }
}
