package colmenatec.menuapp.presentation.rest;

import colmenatec.menuapp.business.facade.impl.SucursalFacadeImpl;
import colmenatec.menuapp.domain.dto.SucursalDto;
import colmenatec.menuapp.domain.entities.Sucursal;
import colmenatec.menuapp.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalDto,Long, SucursalFacadeImpl> {
    public SucursalController(SucursalFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarDireccion/{id}")
    public SucursalDto asignarDireccion(@RequestParam Long idDireccion, @PathVariable Long id){
        return facade.asignarDireccion(id,idDireccion);
    }

    @PutMapping("/asignarCategorias/{id}")
    public SucursalDto asignarCategorias(@RequestParam List<Long> idsCategorias, @PathVariable Long id){
        return facade.asignarCategorias(id,idsCategorias);
    }
}
