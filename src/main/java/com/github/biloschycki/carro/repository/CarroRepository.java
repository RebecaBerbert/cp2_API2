package com.github.biloschycki.carro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.github.biloschycki.carro.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
