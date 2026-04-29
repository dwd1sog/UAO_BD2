package com.apirest.backend.Service;

import java.util.List;

import org.bson.types.ObjectId;

import com.apirest.backend.DTO.TiendaDTO;
import com.apirest.backend.Model.TiendasModel;

public interface ITiendasService {
    public String GuardarTienda (TiendasModel tienda);
    public List<TiendasModel> ListarTiendas();
    public List<TiendaDTO> buscarTiendasPorId(ObjectId id);
    public TiendasModel actualizarTienda(ObjectId id, TiendasModel tienda);
    public String eliminarTienda(ObjectId id);
    List<TiendaDTO> buscarTiendasPorCiudad(String ciudad);
    TiendasModel buscarTiendaPorId(ObjectId id);
}
