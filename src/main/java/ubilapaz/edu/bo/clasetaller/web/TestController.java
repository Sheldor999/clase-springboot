package ubilapaz.edu.bo.clasetaller.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ubilapaz.edu.bo.clasetaller.dto.UsuarioDto;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<Object> test(){
        UsuarioDto usuarioDto = new UsuarioDto("Nicolas", "12345", 20);
        return new ResponseEntity<Object>(usuarioDto, HttpStatus.OK);
    }
    @PostMapping("/test")
    public ResponseEntity<String> test2(@RequestBody UsuarioDto usuarioDto){
        return new ResponseEntity<String>("Hola "+usuarioDto.usuario+" Tu password: "+usuarioDto.password, HttpStatus.OK);
    }
    @PutMapping("/test/{id}")
    public ResponseEntity<Integer> test3(@PathVariable("id") int id){
        id = id+1;
        return new ResponseEntity<Integer>(id, HttpStatus.OK);
    }
}