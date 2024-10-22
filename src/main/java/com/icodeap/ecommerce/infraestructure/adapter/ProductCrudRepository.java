package com.icodeap.ecommerce.infraestructure.adapter;


import com.icodeap.ecommerce.infraestructure.entity.ProductEntity;
import com.icodeap.ecommerce.infraestructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer> {
    Iterable<ProductEntity>findByUserEntity(UserEntity userEntity);

}
