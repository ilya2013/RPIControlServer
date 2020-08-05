package ru.bis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bis.dao.model.DhtModel;
import ru.bis.dto.DhtDTO;
import ru.bis.repository.DhtRepository;

@Service
public class DhtService {
    @Autowired
    private DhtRepository dhtRepository;

    public DhtDTO addDht(DhtDTO dhtDTO) {
        DhtModel dhtModel = DhtDTO.toDhtModel(dhtDTO);
        dhtRepository.save(dhtModel);
        return  new DhtDTO();
    }
}
