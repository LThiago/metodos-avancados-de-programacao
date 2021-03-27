package Singleton;

public class Factory {
    protected int circlesTotal;
    protected int squaresTotal;
    protected int trianglesTotal;

    public static Factory instance;
 
    protected Factory() {
    }
 
    public static Factory getInstance() {
        if (instance == null)
            instance = new Factory();
        return instance;
    }

    public String createCircle() {
        if (circlesTotal < 1){
            circlesTotal++;
            return new String("Circle created");
        }else{
            return new String("Maximum number of circles reached.");
        }
    }

    public String createIsoscelesTriangle() {
        if (trianglesTotal < 3){
            trianglesTotal++;
            return new String("Triangle created");
        }else{
            return new String("Maximum number of triangles reached.");
        }    
    }

    public String createEquilateralTriangle() {
        if (trianglesTotal < 3){
            trianglesTotal++;
            return new String("Triangle created");
        }else{
            return new String("Maximum number of triangles reached.");
        }    
    }

    public String createRightAngledTriangle() {
        if (trianglesTotal < 3){
            trianglesTotal++;
            return new String("Triangle created");
        }else{
            return new String("Maximum number of triangles reached.");
        }    
    }

    public String createSquare() {
        if (squaresTotal < 5){
            squaresTotal++;
            return new String("Square created");
        }else{
            return new String("Maximum number of squares reached.");
        }
    }

    public String showReport() {
        return new String(
           "Number of created Circles: " + circlesTotal +
           "\nNumber of created Triangles: " + trianglesTotal +
           "\nNumber of created Squares: " + squaresTotal
        );
    }      
}
