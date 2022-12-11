package com.example.gasolinetrackproject.repository.impl;

import com.example.gasolinetrackproject.model.City;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryCityRepository {

    public List<City> findAllCities(){
        return List.of(
                new City(1L, "Берово"),
                new City(2L, "Битола"),
                new City(3L, "Богданци"),
                new City(4L, "Боговиње"),
                new City(5L, "Босилово"),
                new City(6L, "Брвеница"),
                new City(7L, "Валандово"),
                new City(8L, "Василево"),
                new City(9L, "Вевчани"),
                new City(10L, "Велес"),
                new City(11L, "Виница"),
                new City(12L, "Врапчиште"),
                new City(13L, "Гевгелија"),
                new City(14L, "Гостивар"),
                new City(15L, "Градско"),
                new City(16L, "Дебар"),
                new City(17L, "Дебарца"),
                new City(18L, "Делчево"),
                new City(19L, "Демир Капија"),
                new City(20L, "Демир Хисар"),
                new City(21L, "Дојран"),
                new City(22L, "Долнени"),
                new City(23L, "Желино"),
                new City(24L, "Илинден"),
                new City(25L, "Јегуновце"),
                new City(26L, "Кавадарци"),
                new City(27L, "Канатларци"),
                new City(28L, "Карбинци"),
                new City(29L, "Кичево"),
                new City(30L, "Конче"),
                new City(31L, "Кочани"),
                new City(32L, "Кратово"),
                new City(33L, "Крива Паланка"),
                new City(34L, "Кривогаштани"),
                new City(35L, "Крушево"),
                new City(36L, "Куманово"),
                new City(37L, "Маврово и Ростуша"),
                new City(38L, "Македонска Каменица"),
                new City(39L, "Македонски Брод"),
                new City(40L, "Могила"),
                new City(41L, "Неготино"),
                new City(42L, "Ново Село"),
                new City(43L, "Охрид"),
                new City(44L, "Петровец"),
                new City(45L, "Пехчево"),
                new City(46L, "Прилеп"),
                new City(47L, "Пробиштип"),
                new City(48L, "Радовиш"),
                new City(49L, "Ранковце"),
                new City(50L, "Ресен"),
                new City(51L, "Росоман"),
                new City(52L, "Свети Николе"),
                new City(53L, "Скопје"),
                new City(54L, "Старо Нагоричане"),
                new City(55L, "Струга"),
                new City(56L, "Струмица"),
                new City(57L, "Теарце"),
                new City(58L, "Тетово"),
                new City(59L, "Чучер Сандево"),
                new City(60L, "Штип")
                );
    }
}

