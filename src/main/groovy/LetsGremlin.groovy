import com.tinkerpop.gremlin.groovy.loaders.GremlinLoader
import com.tinkerpop.gremlin.groovy.loaders.SugarLoader
import com.tinkerpop.gremlin.tinkergraph.structure.TinkerFactory

public class LetsGremlin{

    public static void main(String[] args) {
        // SugarLoader loads Gremlinloader but if you're sweet enough already then you will need this:
        // GremlinLoader.load()
        SugarLoader.load()
        def g = TinkerFactory.createTheCrew()
        // Let the gremlining begin!
        g.V().each{println it.name}
    }
}
