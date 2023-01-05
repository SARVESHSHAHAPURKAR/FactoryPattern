package Factory;

// RETURNS SPECIFIC SHAPE IMPLEMENTATION BASED ON INPUT
public class ShapeFactory {

    public Shape getShape(String input){

        switch(input){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
