package com.skins.restapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skins.restapi.database.RepositorioSkin;
import com.skins.restapi.model.Skin;

@RestController
@RequestMapping("/skin")
public class SkinController {
    @Autowired
    private RepositorioSkin repositorio;

    @GetMapping
    public List<Skin> listar() {
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Skin skin) {
        repositorio.save(skin);
    }

    @PutMapping
    public void alterar(@RequestBody Skin skin) {
        if(skin.getId()>0)
            repositorio.save(skin);
    }

    @DeleteMapping
    public void excluir(@RequestBody Skin skin) {
        repositorio.delete(skin);
    }
}