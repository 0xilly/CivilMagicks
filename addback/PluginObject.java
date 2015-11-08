package us.illyohs.mod.civilmagiks.common.core.plugin;

public class PluginObject {

    String  id, name, author, description, modsRequired, pluginsRequierd;
    boolean isOptional, isEnabled;
    
    public PluginObject(String id, String name, String description, String modsRequired, String pluginsRequierd, boolean isOptional, boolean isEnabled) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.modsRequired = modsRequired;
        this.pluginsRequierd = pluginsRequierd;
        this.isOptional = isOptional;
        this.isEnabled = isEnabled;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getModsRequired() {
        return modsRequired;
    }

    public String getPluginsRequierd() {
        return pluginsRequierd;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
    
    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
    
    public boolean isOptional() {
        return isOptional;
    }
}
