package org.bofie.audit.sample.service;

import lombok.RequiredArgsConstructor;
import org.bofie.audit.sample.domain.Bar;
import org.bofie.audit.sample.exceptions.BarException;
import org.bofie.audit.sample.repository.BarRepository;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BarService {
    private final BarRepository barRepository;

    private final Javers javers = JaversBuilder.javers().build();

    public List<Bar> findAll() {
        return barRepository.findAll();
    }

    public Optional<Bar> findById(Long id) {
        return barRepository.findById(id);
    }

    public Bar save(Bar bar) throws BarException {
        return barRepository.save(bar);
    }

    public void deleteById(Long id) {
        barRepository.deleteById(id);
    }

}
