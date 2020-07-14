import java.util.ArrayList;
import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

public class FloorMapTest {

    static int rows,cols;

    static int verticesCount = rows*cols;


    static Integer vertexNum = 0;
    static List<String> li = new ArrayList<String>();

    public FloorMapTest() {
    }

    public FloorMapTest(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

/*
    public static void createVertexNames() {

        for (int j = 1; j <= rows; j++) { // row number loop
            vertexNum = vertexNum + 10;
            li.add(vertexNum.toString());


            for (int i = 0; i < cols-1; i++) { // cols number loop
                vertexNum = vertexNum + 1;
                li.add(vertexNum.toString());

            }
            vertexNum = vertexNum - (cols - 1);


        }

        System.out.println(li);
        System.out.println(li.size());

    }
*/

    public static Graph<String, DefaultEdge> createStringGraph() {


        //creating vertex names
        for (int j = 1; j <= rows; j++) { // row number loop
            vertexNum = vertexNum + 10;
            li.add(vertexNum.toString());


            for (int i = 0; i < cols-1; i++) { // cols number loop
                vertexNum = vertexNum + 1;
                li.add(vertexNum.toString());

            }
            vertexNum = vertexNum - (cols - 1);


        }



        Graph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);

        // Adding vertices to graph
        for (int i = 0; i < li.size(); i++) {
            System.out.println("Adding vertices to graph" +i );
            g.addVertex(li.get(i));

        }


        //System.out.println("Added all vertices");



        //Adding Edges to graph
        int counter = 0;

        for (int j = 0; j < rows; j++) {

            for (int i = 0; i < (cols - 1); i++) {
                g.addEdge(li.get(counter), li.get(counter + 1));
                counter++;
            }
            counter++;

        }

        int counterByCol = 0;
        //adding 1.0 2.0 ... edges to graph
        for(int k=0; k<(rows-1); k++){
            g.addEdge(li.get(counterByCol), li.get(counterByCol + cols));
            counterByCol = counterByCol + cols;
        }

        counterByCol = cols-1;
        //adding 1.X 2.X ..... edges to graph
        for(int l=0; l<(rows-1); l++){
            g.addEdge(li.get(counterByCol), li.get(counterByCol + cols));
            counterByCol = counterByCol + cols;
        }

        //System.out.println("Map is " + g);

/*
      //finding shortest path
        DijkstraShortestPath<String, DefaultEdge> dijkstraAlg =
                new DijkstraShortestPath<String, DefaultEdge>(g);

        ShortestPathAlgorithm.SingleSourcePaths<String, DefaultEdge> iPaths = dijkstraAlg.getPaths("24");

        System.out.println(iPaths.getPath("82") + "\n");

*/

        return g;
    }





}


 /*       

        String v1 = "v1";
        String v2 = "v2";
        String v3 = "v3";
        String v4 = "v4";

        // add the vertices
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        // add edges to create a circuit
        g.addEdge(v1, v2);
        g.addEdge(v2, v3);
        g.addEdge(v3, v4);
        g.addEdge(v4, v1);






         // Prints the shortest path from vertex i to vertex c. This certainly
        // exists for our particular directed graph.

        DijkstraShortestPath<String, DefaultEdge> dijkstraAlg =
            new DijkstraShortestPath<>(directedGraph);
        SingleSourcePaths<String, DefaultEdge> iPaths = dijkstraAlg.getPaths("i");
        System.out.println(iPaths.getPath("c") + "\n");
*/