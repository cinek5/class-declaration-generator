package model;

/**
 * Created by Cinek on 27.04.2019.
 */
public class Attrdef {
    private String attrName;
    private String typeName;
    private boolean hasGetter;
    private boolean hasSetter;

    public Attrdef(String attrName, String typeName) {
        this.attrName = attrName;
        this.typeName = typeName;
    }


    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean isHasGetter() {
        return hasGetter;
    }

    public void setHasGetter(boolean hasGetter) {
        this.hasGetter = hasGetter;
    }

    public boolean isHasSetter() {
        return hasSetter;
    }

    public void setHasSetter(boolean hasSetter) {
        this.hasSetter = hasSetter;
    }

    public Attrdef(String attrName, String typeName, boolean hasGetter, boolean hasSetter) {
        this.attrName = attrName;
        this.typeName = typeName;
        this.hasGetter = hasGetter;
        this.hasSetter = hasSetter;
    }

    @Override
    public String toString() {
        return "model.Attrdef{" +
                "attrName='" + attrName + '\'' +
                ", typeName='" + typeName + '\'' +
                ", hasGetter=" + hasGetter +
                ", hasSetter=" + hasSetter +
                '}';
    }
}
