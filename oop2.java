package triangle;

public class oop2 {
    public static void main(String[] args) {
       Triangles myTriangles=new Triangles(2,2,2) ;
        System.out.println(myTriangles.toString());

       Triangles myTriangles1=new Triangles ();
        myTriangles1.setA(3);
        myTriangles1.setB(3);
        myTriangles1.setC(3);
        System.out.println(myTriangles1.toString());

        Triangles myTriangles2=new Triangles ();
        myTriangles2.setA(4);
        myTriangles2.setB(5);
        myTriangles2.setC(6);
        System.out.println(myTriangles2.toString());

    }
}
