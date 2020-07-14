import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;

public class Main {


    public static void main(String[] args){


         FloorMapTest flr;

         flr = new FloorMapTest(10,5);






/*
        DijkstraShortestPath<String, DefaultEdge> dijkstraAlg;
        dijkstraAlg = new DijkstraShortestPath<String, DefaultEdge>(flr.createStringGraph());

        ShortestPathAlgorithm.SingleSourcePaths<String, DefaultEdge> iPaths = dijkstraAlg.getPaths("21");

        System.out.println(iPaths.getPath("82") + "\n");

    */

ShortestPath shortestPath = new ShortestPath();
        System.out.println(shortestPath.findShortestPath("22","63"));


        String string = "a8.4/A";

        Integer value = Integer.parseInt(string.replaceAll("[^0-9]", ""));
        System.out.println(value.toString());


    }
}
