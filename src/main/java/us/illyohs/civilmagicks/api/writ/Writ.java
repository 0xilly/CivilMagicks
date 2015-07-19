package us.illyohs.civilmagicks.api.writ;

public class Writ {

    public String   name;
    public WritBase writ;

    public Writ(String name, WritBase writ) {
        this.name = name;
        this.writ = writ;
    }
    
    public String getName() {
        return name;
    }
    
    public WritBase getWrit() {
        return writ;
    }
}
