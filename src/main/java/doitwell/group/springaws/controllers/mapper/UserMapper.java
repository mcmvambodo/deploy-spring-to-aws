/*
package doitwell.group.springaws.controllers.mapper;

import doitwell.group.springaws.controllers.dtos.UserDto;
import doitwell.group.springaws.controllers.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

@Mapper(imports = LocalDate.class)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping(source = "user.password", target = "pass")
    @Mapping(target = "dob", expression = "java(LocalDate.now())")
    UserDto modelToDto(UserEntity user);
    @InheritInverseConfiguration
    UserEntity   dtoToModel(UserDto dto);
}
*/
