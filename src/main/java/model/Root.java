package model;

import model.Attrdef;

import java.util.Collection;

/**
 * Created by Cinek on 27.04.2019.
 */
public class Root {
    private String typeName;
    private Collection<Attrdef> attrdefs;

    public Root(String typeName, Collection<Attrdef> attrdefs) {
        this.typeName = typeName;
        this.attrdefs = attrdefs;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Collection<Attrdef> getAttrdefs() {
        return attrdefs;
    }

    public void setAttrdefs(Collection<Attrdef> attrdefs) {
        this.attrdefs = attrdefs;
    }

    @Override
    public String toString() {
        return "model.Root{" +
                "typeName='" + typeName + '\'' +
                ", attrdefs=" + attrdefs +
                '}';
    }
}
