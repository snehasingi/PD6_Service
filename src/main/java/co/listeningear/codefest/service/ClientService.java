package co.listeningear.codefest.service;


import co.listeningear.codefest.repository.ClientRepository;
import co.listeningear.codefest.repository.JobRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


}
