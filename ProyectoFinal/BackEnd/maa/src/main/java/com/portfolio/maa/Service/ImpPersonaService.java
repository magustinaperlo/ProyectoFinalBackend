
package com.portfolio.maa.Service;

import com.portfolio.maa.Entity.Persona;
import com.portfolio.maa.Interface.IPersonaService;
import com.portfolio.maa.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {

    @Autowired IPersonaRepository ipersonaRepository; 
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> personas= ipersonaRepository.findAll();
        return personas;
    }

    @Override
    public void savePersona(Persona persona) {
       ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
         ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
      Persona persona = ipersonaRepository.findById(id).orElse(null);
      return persona;
    }
  
    
}
