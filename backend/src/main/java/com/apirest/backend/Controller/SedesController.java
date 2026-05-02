package com.apirest.backend.Controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @Autowired ISedesService sedesService;
    @PostMapping("/insertar")
    public ResponseEntity<String> CrearSede(@RequestBody SedesModel sede) {
        return new ResponseEntity<String>(sedesService.CrearSede(sede), HttpStatus.CREATED);
    }
    @GetMapping("/listar")
    public ResponseEntity<List<SedesModel>> listarSedes() {
        return new ResponseEntity<List<SedesModel>>(sedesService.ListarSedes(), HttpStatus.OK);
    }
    @GetMapping("/SedePorId/{id}")
    public ResponseEntity<SedesModel> buscarSedePorId(@PathVariable ObjectId id) {
        return new ResponseEntity<SedesModel>(sedesService.buscarSedePorId(id), HttpStatus.OK);
    }
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<SedesModel> actualizarSede(@PathVariable ObjectId id, @RequestBody SedesModel sede) {
        return new ResponseEntity<SedesModel>(sedesService.actualizarSede(id, sede), HttpStatus.OK);
    }
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarSede(@PathVariable ObjectId id) {
        return new ResponseEntity<String>(sedesService.eliminarSede(id), HttpStatus.OK);
    }
    @GetMapping("/tienda/{tiendaId}")
    public ResponseEntity<List<SedesModel>> buscarSedesPorTiendaId(@PathVariable ObjectId tiendaId) {
        return new ResponseEntity<>(sedesService.buscarSedePorTiendaId(tiendaId), HttpStatus.OK);
    }
}