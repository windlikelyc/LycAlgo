package testUML.link;

import java.util.Vector;

public class Assembly {
    private Vector parts = new Vector();

    public void add(Part p) {
        this.parts.addElement(p);
    }
}
