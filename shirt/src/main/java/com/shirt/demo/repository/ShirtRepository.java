package com.shirt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shirt.demo.model.Shirt;

@Repository
public interface ShirtRepository extends JpaRepository<Shirt,Integer> {

}
