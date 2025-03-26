package shapes;

import interfaces.Drawable;

public class Output {
    public Output(Drawable shape){

        try {
            if (!(shape instanceof Shape)) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println("Object not Shape! ex = " + ex);
            return;
        }
        ((Shape) shape).getName();
    }
}
