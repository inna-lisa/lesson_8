package shapes;

import interfaces.Drawable;

public class Output {
    public Output(Drawable shape){

        if (shape instanceof Shape) {
            System.out.println("Shape is " + ((Shape) shape).getName());
        }
        else{
            System.out.println("Object not Shape!");
            }
    }
}
