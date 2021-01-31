package app.model;

import lombok.Getter;

@Getter
public enum UserRoleEnum {
    ADMIN("admin"),
    USER("user");

    private String role;

    UserRoleEnum(String role) {
        this.role = role;
    }

    public static UserRoleEnum fromString(String role) {
        for (UserRoleEnum typeEnum : UserRoleEnum.values()) {
            if (typeEnum.getRole().equals(role)) {
                return typeEnum;
            }
        }
        throw new UnsupportedOperationException(
                "The role " + role + " is not supported!");
    }
}
