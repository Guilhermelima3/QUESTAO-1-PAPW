package com.example.dev.service;

import com.example.dev.domain.Dinossauro;
import com.example.dev.repository.DinossauroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DinossauroService
{
    @Autowired
    private DinossauroRepository dinossauroRep;


    public Dinossauro dinossauroSave(Dinossauro dinossauro) { return dinossauroRep.save(dinossauro); }

    public Dinossauro dinossauroUpdate(Dinossauro dinossauro) throws RuntimeException
    {
        if(dinossauro != null)
            return dinossauroRep.save(dinossauro);
        throw new RuntimeException("Esse dinossauro não existe.");
    }


    public void dinossauroDelete(Long dinossauroId)
    {
        dinossauroRep.deleteById(dinossauroId);
    }

    public List<Dinossauro> dinossauroList()
    {
        return dinossauroRep.findAll();
    }

    public Dinossauro dinossauroGetById(Long dinossauroId)
    {
        return dinossauroRep.findById(dinossauroId).get();
    }

}
