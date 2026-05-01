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

import com.apirest.backend.Model.EmpleadosModel;
import com.apirest.backend.Service.IEmpleadosService;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadosController {

    @Autowired
    IEmpleadosService empleadosService;

    @PostMapping("/guardar")
    public String guardarEmpleado(@RequestBody EmpleadosModel empleado) {
        return empleadosService.guardarEmpleado(empleado);
    }

    @GetMapping("/listar")
    public List<EmpleadosModel> listarEmpleados() {
        return empleadosService.listarEmpleados();
    }

    @GetMapping("/buscar/{id}")
    public EmpleadosModel buscarEmpleadoPorId(@PathVariable ObjectId id) {
        return empleadosService.buscarEmpleadoPorId(id);
    }

    @PutMapping("/actualizar/{id}")
    public EmpleadosModel actualizarEmpleado(@PathVariable ObjectId id, @RequestBody EmpleadosModel empleado) {
        return empleadosService.actualizarEmpleado(id, empleado);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarEmpleado(@PathVariable ObjectId id) {
        return empleadosService.eliminarEmpleado(id);
    }
}