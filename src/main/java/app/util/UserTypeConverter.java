package app.util;

import app.model.UserRoleEnum;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class UserTypeConverter implements AttributeConverter<UserRoleEnum, String> {

    @Override
    public String convertToDatabaseColumn(UserRoleEnum userRoleEnum) {
        if (userRoleEnum == null) {
            return null;
        }
        return userRoleEnum.getRole();
    }

    @Override
    public UserRoleEnum convertToEntityAttribute(String s) {
        if (s == null) {
            return null;
        }
        return UserRoleEnum.fromString(s);
    }
}
