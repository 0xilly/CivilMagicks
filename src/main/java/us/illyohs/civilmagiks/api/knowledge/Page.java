package us.illyohs.civilmagiks.api.knowledge;

import net.minecraft.util.ResourceLocation;

public class Page
{


    String category, title, description, lore;
    ResourceLocation texture;

    public Page(String category, String title, String description, String lore, ResourceLocation texture)
    {
        this.category = category;
        this.description = description;
        this.title = title;
        this.lore = lore;
        this.texture = texture;
    }

    public String getCategory()
    {
        return category;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }

    public String getLore()
    {
        return lore;
    }

    public ResourceLocation getTexture()
    {
        return texture;
    }

}
