package com.example.demo.service;

import com.example.demo.model.Libro;
import com.example.demo.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements LibroRepository {

    @Autowired
    private LibroRepository libroRepository;


    @Override
    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    @Override
    public List<Libro> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Libro> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Libro> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        libroRepository.deleteById(aLong);
    }

    @Override
    public void delete(Libro entity) {
        libroRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Libro> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Libro> S save(S entity) {
        return libroRepository.save(entity);
    }

    @Override
    public <S extends Libro> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Libro> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Libro> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Libro> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Libro> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Libro getOne(Long aLong) {
        return null;
    }

    @Override
    public Libro getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Libro> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Libro> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Libro> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Libro> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Libro> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Libro> boolean exists(Example<S> example) {
        return false;
    }

    public Object findAllByPaginasMultiplicadas(int paginas) {
        List<Libro> libros = libroRepository.findAll();
        for (Libro libro : libros) {
            libro.setCantidadPaginas(libro.getCantidadPaginas() * paginas);
        }
        return libros;
    }
}

