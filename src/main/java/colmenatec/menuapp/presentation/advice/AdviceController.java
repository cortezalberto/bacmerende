package colmenatec.menuapp.presentation.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class AdviceController {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleEmptyInput(Exception e){
        return ResponseEntity.internalServerError().body(e.getMessage());
    }
}
