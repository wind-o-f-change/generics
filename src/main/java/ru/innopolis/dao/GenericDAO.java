package ru.innopolis.dao;

import ru.innopolis.exception.PersistException;
import ru.innopolis.model.Identified;

import java.io.Serializable;
import java.util.Collection;

/**
 * Унифицированный интерфейс управления персистентным состоянием объектов
 * @param <T> тип объекта персистенции
 * @param <PK> тип первичного ключа
 */
public interface GenericDAO<T extends Identified<PK>, PK extends Serializable> {

    /** Создает новую запись, соответствующую объекту object */
    T save(T ob) throws PersistException;

    /** Возвращает объект соответствующий записи с первичным ключом key или null */
    T getByPK(PK key) throws PersistException;

    /** Удаляет запись об объекте по первоичном ключу */
    T deleteByPK(PK key) throws PersistException;

    /** Сохраняет состояние объекта */
    T update(T ob) throws PersistException;

    /** Удаляет запись об объекте */
    T delete(T ob) throws PersistException;

    /** Возвращает список объектов соответствующих всем записям */
    Collection<T> getAll() throws PersistException;

    /** Создает новые записи, соответствующему списку объектов object */
    Collection<T> addAll(Collection<T> obs) throws PersistException;

}
