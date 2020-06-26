package com.example.dev.rest;

import com.example.dev.domain.Dinossauro;
import com.example.dev.service.DinossauroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DinossauroRest
{
    @Autowired
    private DinossauroService dinossauroServ;

    @PostMapping("/dinossauro")
    public ResponseEntity<Dinossauro> dinossauroSave(@RequestBody @Valid Dinossauro dinossauro)
    {
        return ResponseEntity.ok(dinossauroServ.dinossauroSave(dinossauro));
    }

    @PutMapping("/dinossauro")
    public ResponseEntity<Dinossauro> dinossauroUpdate(@RequestBody @Valid Dinossauro dinossauro)
    {
        return ResponseEntity.ok(dinossauroServ.dinossauroUpdate(dinossauro));
    }

    @DeleteMapping("/dinossauro/{id}")
    public ResponseEntity dinossauroDelete(@PathVariable Long id)
    {
        try
        {
            dinossauroServ.dinossauroDelete(id);
            return ResponseEntity.ok().build();
        }
        catch (Exception e)
        {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/dinossauro")
    public ResponseEntity<List<Dinossauro>> dinossauroList()
    {
        return ResponseEntity.ok(dinossauroServ.dinossauroList());
    }

    @GetMapping("/dinossauro/{id}")
    public ResponseEntity<Dinossauro> dinossauroGet(@PathVariable Long id)
    {
        return ResponseEntity.ok(dinossauroServ.dinossauroGetById(id));
    }
}
