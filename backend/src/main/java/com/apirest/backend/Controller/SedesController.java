package com.apirest.backend.Controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.backend.Model.SedesModel;
import com.apirest.backend.Service.ISedesService;

@RestController
@RequestMapping("/api/sedes")
public class SedesController {

    @Autowired
    ISedesService sedesService;

    @PostMapping("/guardar")
    public String guardarSede(@RequestBody SedesModel sede) {
        return sedesService.GuardarSede(sede);
    }

    @GetMapping("/listar")
    public List<SedesModel> listarSedes() {
        return sedesService.ListarSedes();
    }

    @GetMapping("/buscar/{id}")
    public SedesModel buscarSedePorId(@PathVariable ObjectId id) {
        return sedesService.buscarSedePorId(id);
    }

    @PutMapping("/actualizar/{id}")
    public SedesModel actualizarSede(@PathVariable ObjectId id, @RequestBody SedesModel sede) {
        return sedesService.actualizarSede(id, sede);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarSede(@PathVariable ObjectId id) {
        return sedesService.eliminarSede(id);
    }
}