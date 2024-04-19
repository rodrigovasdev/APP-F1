package com.f1.f1list;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.f1.f1list.models.ResultRaceModel;
import com.f1.f1list.repositories.ResultRepository;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ResultTest {
    @Autowired
    private ResultRepository resultRepository;

    @Test
    public void whenFindFirst_thenReturnFirstUser() {

        ResultRaceModel carrera1 = new ResultRaceModel();
        carrera1.setTiempo("25:38.426");

        Optional<ResultRaceModel> found = resultRepository.findFirstByOrderByIdAsc();

        assertTrue(found.isPresent());
        assertEquals(carrera1.getTiempo(), found.get().getTiempo());
    }

}
