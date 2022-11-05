package br.com.contrateumjr.juniorousandy;

import br.com.contrateumjr.juniorousandy.model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JuniorousandyApplicationTests {

    @Test
   public void criaUsuarioTest() {
       Usuario usuario = new Usuario();
        assertNotNull(usuario);
   }

}
