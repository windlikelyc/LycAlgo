package testUML.link;

public class Part {
    private CatalogueEntry entry;

    public Part(CatalogueEntry e) {
        this.entry = e;
    }

    public double cost(){
        return entry.getCost();
    }
}
