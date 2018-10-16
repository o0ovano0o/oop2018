package week5_6;

import java.util.ArrayList;
import java.util.Vector;

public class Diagram {
    ArrayList<Layer> layers = new ArrayList<Layer>();

    public void deleteCircle() {
        for (int i = 0; i < layers.size(); i++) {
            for (int j = 0; j < layers.get(i).shapes.size(); j++)
                if (layers.get(i).shapes.get(j) instanceof Cricle) {
                    layers.get(i).shapes.remove(j);
                    j--;
                }
        }
    }

    public void sameShape() {
        Layer cricles = new Layer();
        Layer squares = new Layer();
        Layer rectangles = new Layer();
        Layer hexagons = new Layer();
        Layer triangles = new Layer();
        for(int i=0;i<layers.size();i++) {
            for(int j=0;j<layers.get(i).shapes.size();j++) {
                if(layers.get(i).shapes.get(j) instanceof Cricle)
                    cricles.shapes.add(layers.get(i).shapes.get(j));
                else if(layers.get(i).shapes.get(j) instanceof Square)
                    squares.shapes.add(layers.get(i).shapes.get(j));
                else if(layers.get(i).shapes.get(j) instanceof Rectange)
                    rectangles.shapes.add(layers.get(i).shapes.get(j));
                else if(layers.get(i).shapes.get(j) instanceof Triangle)
                    triangles.shapes.add(layers.get(i).shapes.get(j));
                else if(layers.get(i).shapes.get(j) instanceof Hexagon)
                    hexagons.shapes.add(layers.get(i).shapes.get(j));
            }
        }
        this.layers.clear();
        this.layers.add(0, cricles);;
        this.layers.add(1, squares);;
        this.layers.add(2, rectangles);;
        this.layers.add(3, hexagons);;
        this.layers.add(4, triangles);;
    }

}
