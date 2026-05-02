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

import com.apirest.backend.Model.EmpleadosModel;
import com.apirest.backend.Service.IEmpleadosService;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadosController {
    @Autowired IEmpleadosService empleadosService;
    @PostMapping("/insertar")
    public ResponseEntity<String> insertarEmpleado(@RequestBody EmpleadosModel empleado) {
        return new ResponseEntity<String>(empleadosService.insertarEmpleado(empleado), HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<EmpleadosModel>> listarEmpleados() {
        return new ResponseEntity<List<EmpleadosModel>>(empleadosService.listarEmpleados(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<EmpleadosModel> buscarEmpleadoPorId(@PathVariable ObjectId id) {
        return new ResponseEntity<EmpleadosModel>(empleadosService.buscarEmpleadoPorId(id), HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<EmpleadosModel> actualizarEmpleado(@PathVariable ObjectId id, @RequestBody EmpleadosModel empleado) {
        return new ResponseEntity<EmpleadosModel>(empleadosService.actualizarEmpleado(id, empleado), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarEmpleado(@PathVariable ObjectId id) {
        return new ResponseEntity<String>(empleadosService.eliminarEmpleado(id), HttpStatus.OK);
    }
    @GetMapping("/sedeid/{sedeId}")
    public ResponseEntity<List<EmpleadosModel>> buscarEmpleadosPorSede(@PathVariable ObjectId sedeId) {
        return new ResponseEntity<List<EmpleadosModel>>(empleadosService.buscarEmpleadosPorSede(sedeId), HttpStatus.OK);
    }
}