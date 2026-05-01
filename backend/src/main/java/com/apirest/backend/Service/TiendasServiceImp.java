package com.apirest.backend.Service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.backend.DTO.TiendaDTO;
import com.apirest.backend.Exception.RecursoNoEncontradoException;
import com.apirest.backend.Model.TiendasModel;
import com.apirest.backend.Repository.ITiendasRepository;

@Service
public class TiendasServiceImp implements ITiendasService {
    
    @Autowired 
    ITiendasRepository tiendasRepository;
    
    @Override
    public String GuardarTienda(TiendasModel tienda) {
        tiendasRepository.save(tienda);
        return "La tienda " + tienda.getNombre() + ", fue creada con éxito";
    }

    @Override
    public List<TiendasModel> ListarTiendas() {
        return tiendasRepository.findAll();
    }

    @Override
    public TiendasModel buscarTiendaPorId(ObjectId id) {
        return tiendasRepository.findById(id)
            .orElseThrow(() -> new RecursoNoEncontradoException("Error!. No existe una tienda con ID: " + id + " o esta mal escrito"));
    }

    @Override
    public TiendasModel actualizarTienda(ObjectId id, TiendasModel tienda) {
        TiendasModel tiendaExistente = buscarTiendaPorId(id);
        tiendaExistente.setNombre(tienda.getNombre());
        tiendaExistente.setDireccion(tienda.getDireccion());
        tiendaExistente.setTelefonos(tienda.getTelefonos());
        return tiendasRepository.save(tiendaExistente);
    }

    @Override
    public String eliminarTienda(ObjectId id) {
        TiendasModel tiendaExistente = buscarTiendaPorId(id);
        tiendasRepository.delete(tiendaExistente);
        return "La tienda con ID: " + id + ", fue eliminada correctamente";
    }

    @Override
    public List<TiendaDTO> buscarTiendasPorCiudad(String ciudad) {
        return tiendasRepository.buscarTiendasPorCiudad(ciudad);
    }
}