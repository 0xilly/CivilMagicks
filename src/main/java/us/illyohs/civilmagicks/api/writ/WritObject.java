package us.illyohs.civilmagicks.api.writ;

public class WritObject {

    public String   name;
    public WritBase writ;

    public WritObject(String name, WritBase writ){
        this.name = name;
        this.writ = writ;
    }
}
