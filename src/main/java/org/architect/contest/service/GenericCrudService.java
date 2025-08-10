package org.architect.contest.service;
import java.util.List;

public interface GenericCrudService<D, CD, UD, K> {

    /**
     * Yangi obyekt yaratish
     * @param createDto obyektni yaratish uchun DTO
     */
    D create(CD createDto);

    /**
     * Mavjud obyektni yangilash
     * @param updateDto yangilanish malumotlari
     * @param id obyekt ID si
     */
    D update(UD updateDto, K id);

    /**
     * ID bo‘yicha obyektni olish
     * @param id obyekt ID si
     */
    D get(K id);

    /**
     * Barcha obyektlarni olish
     */
    List<D> getAll();

    /**
     * ID bo‘yicha obyektni o‘chirish
     * @param id obyekt ID si
     */
    void delete(K id);
}
