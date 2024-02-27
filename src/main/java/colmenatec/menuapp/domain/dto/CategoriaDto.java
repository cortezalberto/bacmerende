package colmenatec.menuapp.domain.dto;

import lombok.Data;
import java.util.HashSet;
import java.util.Set;

@Data
public class CategoriaDto extends BaseDto{
    private String nombre;
    private Set<ProductoDto> productos = new HashSet<>();
    private Set<ComboDto> combos = new HashSet<>();
}
