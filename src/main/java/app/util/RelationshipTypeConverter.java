package app.util;

import app.model.RelationshipTypeEnum;
import app.model.UserRoleEnum;
import javax.persistence.AttributeConverter;

public class RelationshipTypeConverter  implements AttributeConverter<RelationshipTypeEnum, String> {

    @Override
    public String convertToDatabaseColumn(RelationshipTypeEnum relationshipTypeEnum) {
        if (relationshipTypeEnum == null) {
            return null;
        }
        return relationshipTypeEnum.getRelation();
    }

    @Override
    public RelationshipTypeEnum convertToEntityAttribute(String s) {
        if (s == null) {
            return null;
        }
        return RelationshipTypeEnum.fromString(s);
    }
}
