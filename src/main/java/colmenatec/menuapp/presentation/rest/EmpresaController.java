package colmenatec.menuapp.presentation.rest;

import colmenatec.menuapp.business.facade.impl.EmpresaFacadeImpl;
import colmenatec.menuapp.domain.dto.EmpresaDto;
import colmenatec.menuapp.domain.entities.Empresa;
import colmenatec.menuapp.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaDto,Long, EmpresaFacadeImpl> {
    public EmpresaController(EmpresaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarSucursales/{id}")
    public EmpresaDto asignarSucursales(@RequestParam List<Long> sucursalesIds, @PathVariable Long id){
        return facade.asignarSucursales(id,sucursalesIds);
    }

}
