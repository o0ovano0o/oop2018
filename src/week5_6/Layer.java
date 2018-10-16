package week5_6;

import java.util.ArrayList;
import java.util.Vector;

public class Layer  {
    ArrayList<Shape> shapes = new ArrayList<Shape>() ;
    private boolean visible ;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void deleteTriangle (){
        for (int i=0;i<shapes.size();i++){
            if (shapes.get(i) instanceof Triangle){
                shapes.remove(i);
                i--;
            }
        }
    }
    public void deletesameShape(){
        for(int i=0;i<shapes.size();i++) {
            if (shapes.get(i) instanceof Cricle) {
                for (int j = 0; j < shapes.size(); j++) {
                    if (shapes.get(j) instanceof Cricle && j != i)
                        if (((Cricle) shapes.get(i)).issameCricle(shapes.get(j)))
                            shapes.remove(j);
                }
            }
            if (shapes.get(i) instanceof Rectange) {
                for (int j = 0; j < shapes.size(); j++) {
                    if (shapes.get(j) instanceof Rectange && j != i)
                        if (((Rectange) shapes.get(i)).issamerectangle(shapes.get(j)))
                            shapes.remove(j);
                }
            }
            if (shapes.get(i) instanceof Triangle) {
                for (int j = 0; j < shapes.size(); j++) {
                    if (shapes.get(j) instanceof Triangle && j != i)
                        if (((Triangle) shapes.get(i)).issameTriangle(shapes.get(j)))
                            shapes.remove(j);
                }
            }
            if (shapes.get(i) instanceof Hexagon) {
                for (int j = 0; j < shapes.size(); j++) {
                    if (shapes.get(j) instanceof Hexagon && j != i)
                        if (((Hexagon) shapes.get(i)).isSameHexagon((Hexagon) shapes.get(j)))
                            shapes.remove(j);
                }
            }





        }
    }

}
