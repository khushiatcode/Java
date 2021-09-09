package ooplab6;

abstract class Figure {
    abstract void display_info();
}

class Open extends Figure {
    Open() {
        System.out.println("\nIt's an Open figure...");
    }
    void display_info() {
        System.out.println("An Open figure can be defined as a figure whose line segments and/or curves do not meet. ");
    }
}

class Line extends Open {
    void display_info() {
        System.out.println("This is a line! ");
    }
    Line(int no_of_edges) {
        System.out.println("No. of edges of a line: "+no_of_edges);
    }
}

class Polyline extends Open {
    void display_info() {
        System.out.println("This is a Polyline! ");
    }
    Polyline(int no_of_edges) {
        System.out.println("No. of edges of a Polyline: "+no_of_edges);
    }
}

class Close extends Figure {
    Close() {
        System.out.println("\nIt's a Closed figure...");
    }
    void display_info() {
        System.out.println("A Closed figure can be defined as a enclosed figure whose line segments and/or curves are connected or meet. ");
    }
}

class Polygon extends Close {
    void display_info() {
        System.out.println("This is a Polygon! ");
    }
    Polygon(String no_of_edges) {
        System.out.println("No. of edges of a 'n' sided Polygon: "+no_of_edges);
    }
}

class Eclipse extends Close {
    void display_info() {
        System.out.println("This is an Eclipse! ");
    }
    Eclipse(String no_of_edges) {
        System.out.println("No. of edges of an Eclipse: "+no_of_edges);
    }
}

public class Main {
    public static void main(String[] args) {
        Figure f;
        f = new Open();
        f.display_info();

        f = new Close();
        f.display_info();

        f = new Line(0);
        f.display_info();

        f = new Polyline(0);
        f.display_info();

        f = new Polygon("n");
        f.display_info();

        f = new Eclipse("\u221E");
        f.display_info();
    }
}
