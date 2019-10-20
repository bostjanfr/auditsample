package org.bofie.audit.sample.service;

import lombok.RequiredArgsConstructor;
import org.bofie.audit.sample.domain.Bar;
import org.bofie.audit.sample.exceptions.BarException;
import org.bofie.audit.sample.repository.BarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BarService {
    private final BarRepository barRepository;

    public List<Bar> findAll() {
        return barRepository.findAll();
    }

    public Optional<Bar> findById(Long id) {
        return barRepository.findById(id);
    }

    public Bar save(Bar bar) throws BarException {
        if (bar.getId() == null){
            return barRepository.save(bar);
        }

        Optional<Bar> old = barRepository.findById(bar.getId());
        if (old.isPresent()){
            return barRepository.save(bar);
        }

        throw new BarException("No Bar found");
    }

    public void deleteById(Long id) {
        barRepository.deleteById(id);
    }

}
