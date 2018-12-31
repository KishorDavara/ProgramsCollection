/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

/**
 *
 * @author KK Davara
 */
public class MSTOfUnweightedGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); // 0 (start for mst)
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(0, 2); // AC
        theGraph.addEdge(0, 3); // AD
        theGraph.addEdge(0, 4); // AE
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(1, 3); // BD
        theGraph.addEdge(1, 4); // BE
        theGraph.addEdge(2, 3); // CD
        theGraph.addEdge(2, 4); // CE
        theGraph.addEdge(3, 4); // DE
        System.out.print("Minimum spanning tree: ");
        theGraph.mst(); // minimum spanning tree
        System.out.println();
    }

}
