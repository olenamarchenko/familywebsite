package app.model;

import lombok.Getter;

@Getter
public enum RelationshipTypeEnum {
    CHILD("child"),
    PARENT("parent"),
    SIBLING("sibling"),
    COUSIN("cousin"),
    GRANDPARENT("grandparent"),
    AUNT("aunt"),
    UNCLE("uncle"),
    NEPHEW("nephew"),
    NIECE("niece");

    private String relation;

    RelationshipTypeEnum(String relation) {
        this.relation = relation;
    }

    public static RelationshipTypeEnum fromString(String relation) {
        for (RelationshipTypeEnum relationEnum : RelationshipTypeEnum.values()) {
            if (relationEnum.getRelation().equals(relation)) {
                return relationEnum;
            }
        }
        throw new UnsupportedOperationException(
                "The relation " + relation + " is not supported!");
    }
}
