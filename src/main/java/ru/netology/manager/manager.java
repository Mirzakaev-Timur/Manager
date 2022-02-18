package ru.netology.manager;

public class manager {

    private film[] items = new film[0];

    public void save(film item) {
        int length = items.length + 1;
        film[] tmp = new film[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public film[] findAll() {
        return items;
    }


    private int limit = 10;

    public manager() {
    }

    public manager(int limit) {
        this.limit = limit;
    }


    public film[] getAll() {
        int resultLength;
        if (limit > items.length) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        film[] items = findAll();
        film[] result = new film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }



}
