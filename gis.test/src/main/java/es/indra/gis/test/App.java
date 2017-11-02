package es.indra.gis.test;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LinearRing;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.PrecisionModel;

/**
 * Hello world!
 * Eclipse
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Coordinate[] cc = new Coordinate[5];
        cc[0] = new Coordinate(0, 0);
        cc[1] = new Coordinate(0, 1);
        cc[2] = new Coordinate(5, 4);
        cc[3] = new Coordinate(1, 0);
        cc[4] = (Coordinate) cc[0].clone();
        
        GeometryFactory gf = new GeometryFactory();
        
        LinearRing lr = gf.createLinearRing(cc);
        Polygon pol = new Polygon(lr, null, gf);
        
        System.out.println( "Area: " + pol.getArea());
        System.out.println( "End.");
    }
}
