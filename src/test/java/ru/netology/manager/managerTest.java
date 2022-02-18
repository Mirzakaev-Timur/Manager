package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class managerTest {

    @Test
    public void saveFilms() {
        film first = new film(1, "Бладшот");
        film second = new film(2, "Вперёд");
        film third = new film(3, "Отель Белград");
        film fourth = new film(4, "Джентльмены");
        film fifth = new film(5,"Человек-неведимка");
        film sixth = new film(6, "Тролли.Мировой тур");
        film seventh = new film(7, "Номер один");
        film eighth = new film(8, "Человек-паук");
        film ninth = new film(9, "Девчата");
        film tenth = new film(10, "Гарри Поттер и философский камень");
        film eleventh = new film(11, "Аладдин");

        manager manager = new manager();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void get10Films() {
        film first = new film(1, "Бладшот");
        film second = new film(2, "Вперёд");
        film third = new film(3, "Отель Белград");
        film fourth = new film(4, "Джентльмены");
        film fifth = new film(5,"Человек-неведимка");
        film sixth = new film(6, "Тролли.Мировой тур");
        film seventh = new film(7, "Номер один");
        film eighth = new film(8, "Человек-паук");
        film ninth = new film(9, "Девчата");
        film tenth = new film(10, "Гарри Поттер и философский камень");
        film eleventh = new film(11, "Аладдин");
        film twelfth = new film(12, "В бой идут одни старики");

        manager manager = new manager(10);

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        manager.save(twelfth);

        film[] expected = {twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth,third};
        film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void getFilmsWhenLimit11() {
        film first = new film(1, "Бладшот");
        film second = new film(2, "Вперёд");
        film third = new film(3, "Отель Белград");
        film fourth = new film(4, "Джентльмены");
        film fifth = new film(5,"Человек-неведимка");
        film sixth = new film(6, "Тролли.Мировой тур");
        film seventh = new film(7, "Номер один");
        film eighth = new film(8, "Человек-паук");
        film ninth = new film(9, "Девчата");
        film tenth = new film(10, "Гарри Поттер и философский камень");
        film eleventh = new film(11, "Аладдин");
        film twelfth = new film(12, "В бой идут одни старики");

        manager manager = new manager(11);

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        manager.save(twelfth);

        film[] expected = {twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth,third, second};
        film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void getFilmsWhenLimit10() {
        film first = new film(1, "Бладшот");
        film second = new film(2, "Вперёд");
        film third = new film(3, "Отель Белград");
        film fourth = new film(4, "Джентльмены");
        film fifth = new film(5,"Человек-неведимка");
        film sixth = new film(6, "Тролли.Мировой тур");
        film seventh = new film(7, "Номер один");
        film eighth = new film(8, "Человек-паук");
        film ninth = new film(9, "Девчата");
        film tenth = new film(10, "Гарри Поттер и философский камень");
        film eleventh = new film(11, "Аладдин");
        film twelfth = new film(12, "В бой идут одни старики");

        manager manager = new manager(10);

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        manager.save(twelfth);

        film[] expected = {twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth,third};
        film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void getFilmsLimit9and9Films() {
        film first = new film(1, "Бладшот");
        film second = new film(2, "Вперёд");
        film third = new film(3, "Отель Белград");
        film fourth = new film(4, "Джентльмены");
        film fifth = new film(5,"Человек-неведимка");
        film sixth = new film(6, "Тролли.Мировой тур");
        film seventh = new film(7, "Номер один");
        film eighth = new film(8, "Человек-паук");
        film ninth = new film(9, "Девчата");

        manager manager = new manager(9);

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);


        film[] expected = {ninth, eighth, seventh, sixth, fifth, fourth,third, second, first};
        film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void get1Films (){
        film first = new film(1, "Бладшот");

        manager manager = new manager(1);
        manager.save(first);

        film[] expected = {first};
        film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }
}



