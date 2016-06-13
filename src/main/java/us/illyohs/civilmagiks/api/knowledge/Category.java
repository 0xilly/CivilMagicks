package us.illyohs.civilmagiks.api.knowledge;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;

public class Category implements Comparable<Category>{

    private String category, description, lore;
    private ResourceLocation texture;

    private static List<Page> pageList = new ArrayList<Page>();

    public Category(ResourceLocation texture) {
        this.texture = texture;
    }

    public Category(String category, String description, String lore, ResourceLocation texture) {
        this.category = category;
        this.description = description;
        this.lore = lore;
        this.texture = texture;
    }

    public String getCategory() {
        return I18n.translateToLocal(category);
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return I18n.translateToLocal(description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLore() {
        return I18n.translateToLocal(lore);
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void linkPage(Page page) {
        pageList.add(page);
    }

    public ResourceLocation getTexture() {
        return texture;
    }

    @Override
    public int compareTo(Category category) {
        return 0;
    }
}
