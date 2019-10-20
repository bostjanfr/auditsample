package org.bofie.audit.sample.repository;

import org.bofie.audit.sample.domain.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarRepository extends JpaRepository<Bar, Long> {
}
