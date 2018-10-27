package week5_6;

public class Mainn {

    public static void main(String[] args) {
        // TODO code application logic here
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        Point a = new Point(6, 0);
        Point c = new Point(0, 6);
        Point b = new Point(6, 6);
        layer.shapes.add(new Triangle(a, b, c));
        layer.shapes.add(new Rectange(10, 2));
        layer.shapes.add(new Square(9));
        layer.shapes.add(new Cricle(3.4));
        layer.shapes.add(new Cricle(4.2));
        layer.shapes.add(new Cricle(2.4));
        diagram.layers.add(layer);
        System.out.println("WEEK 5");
        System.out.println("~~~~");
        for (int i = 0; i < layer.shapes.size(); i++) {
            System.out.println(layer.shapes.get(i).toString());
        }
        System.out.println("Xóa triangle");
        layer.deleteTriangle();
        for (int i = 0; i < layer.shapes.size(); i++) {
            System.out.println(layer.shapes.get(i).toString());
        }
        diagram.deleteCircle();
        System.out.println("Xóa cricle");
        for (int i = 0; i < diagram.layers.get(0).shapes.size(); i++) {
            System.out.println(diagram.layers.get(0).shapes.get(i).toString());
        }
        System.out.println("WEEK 6");
        System.out.println("~~~~");
        Layer layer2 = new Layer();
        layer2.setVisible(true);
        layer2.shapes.add(new Triangle(a, b, c));
        layer2.shapes.add(new Rectange(10, 2));
        layer2.shapes.add(new Square(9));
        layer2.shapes.add(new Cricle(3.4));
        layer2.shapes.add(new Cricle(4.2));
        layer2.shapes.add(new Cricle(3.4));
        for (int i = 0; i < layer2.shapes.size(); i++) {
            System.out.println(layer2.shapes.get(i).toString());
        }
        layer2.deletesameShape();
        System.out.println("Xóa hình trùng nhau");
        for (int i = 0; i < layer2.shapes.size(); i++) {
            System.out.println(layer2.shapes.get(i).toString());
        }
        System.out.println("Chuyển từng loại hình vẽ vào từng layer");
        diagram.layers.add(layer2);
        diagram.sameShape();
        for(int i=0;i<diagram.layers.size();i++){
            System.out.println("Layer "+ (i+1) +" : ");
            for(int j=0;j<diagram.layers.get(i).shapes.size();j++){
                System.out.println(diagram.layers.get(i).shapes.get(j).toString());
            }
        }

    }
}
