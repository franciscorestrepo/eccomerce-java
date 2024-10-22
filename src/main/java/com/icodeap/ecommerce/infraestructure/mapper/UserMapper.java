package com.icodeap.ecommerce.infraestructure.mapper;

import com.icodeap.ecommerce.domain.User;
import com.icodeap.ecommerce.infraestructure.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;



@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings(
            {
               @Mapping(source = "id", target = "id"),
               @Mapping(source = "username", target = "username"),
               @Mapping(source = "firstname", target = "firstname"),
               @Mapping(source = "lastname", target = "lastname"),
               @Mapping(source = "email", target = "email"),
               @Mapping(source = "address", target = "address"),
               @Mapping(source = "cellphone", target = "cellphone"),
               @Mapping(source = "password", target = "password"),
               @Mapping(source = "userType", target = "userType"),
               @Mapping(source = "dateCreated", target = "dateCreated")
            }
    )
    User toUser(UserEntity userEntity);
    Iterable<User> toUser( Iterable<UserEntity> userEntities);

    @InheritInverseConfiguration
    UserEntity toUserEntity( User user);

}
