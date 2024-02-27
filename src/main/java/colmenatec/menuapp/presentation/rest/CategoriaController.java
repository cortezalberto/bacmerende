package colmenatec.menuapp.presentation.rest;

import colmenatec.menuapp.business.facade.impl.CategoriaFacadeImpl;
import colmenatec.menuapp.domain.dto.CategoriaDto;
import colmenatec.menuapp.domain.dto.EmpresaDto;
import colmenatec.menuapp.domain.entities.Categoria;
import colmenatec.menuapp.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaDto,Long, CategoriaFacadeImpl> {

    public CategoriaController(CategoriaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarProductos/{id}")
    public CategoriaDto asignarProductos(@RequestParam List<Long> idsProductos, @PathVariable Long id){
        return facade.asignarProductos(id,idsProductos);
    }
}
