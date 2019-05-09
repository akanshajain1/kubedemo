package com.kubedemo.kubedemo.repository;

import com.kubedemo.kubedemo.entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KubeDemoRepo extends CrudRepository<KubeDemoEntity,Integer> {

}
