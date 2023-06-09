package co.ke.stanslaus.learningsecurity.services;

import co.ke.stanslaus.learningsecurity.entities.SystemParameters;
import co.ke.stanslaus.learningsecurity.repository.SystemParametersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemParameterService {

    @Autowired
    private SystemParametersRepository systemParametersRepository;
    public void saveParam (SystemParameters systemParameters){
    systemParametersRepository.save(systemParameters);
    }
}
