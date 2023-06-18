package com.skins.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skins.restapi.model.Skin;

public interface RepositorioSkin extends JpaRepository<Skin, Long>{
    
}
