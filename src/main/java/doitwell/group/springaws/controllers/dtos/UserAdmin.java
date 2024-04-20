package doitwell.group.springaws.controllers.dtos;

import doitwell.group.springaws.controllers.entity.UserEntity;

public class UserAdmin extends UserEntity {
    private String privilege;
    public UserAdmin(){
        super();
    }

    @Override
    public String writeEntity() {
        return "User privilege";
    }
}
