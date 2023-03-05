package com.mamglez.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mamglez.api.entity.Album;

public interface IAlbumsRepository extends JpaRepository<Album, Integer> {

}
