package ru.bis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.bis.dao.model.DhtModel;

import java.util.Optional;

@Repository
@Transactional
public interface DhtRepository extends CrudRepository<DhtModel, Long> {

    @Override
    <S extends DhtModel> S save(S entity);

    @Override
    <S extends DhtModel> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    Optional<DhtModel> findById(Long aLong);

    Optional<DhtModel> findAllByDeviceName(String deviceName);
}
