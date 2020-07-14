import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;

public class ShortestPath {



    DijkstraShortestPath<String, DefaultEdge> dijkstraAlg =
            new DijkstraShortestPath<String, DefaultEdge>(FloorMapTest.createStringGraph());



    public GraphPath<String, DefaultEdge> findShortestPath(String start, String stop){

        ShortestPathAlgorithm.SingleSourcePaths<String, DefaultEdge> iPaths = dijkstraAlg.getPaths(start);

        System.out.println(iPaths.getGraph());
        return iPaths.getPath(stop);


    }


}