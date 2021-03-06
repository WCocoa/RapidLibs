package com.marno.mbasiclib.adapter;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by marno on 2016/5/13/15:09.
 */
interface DataIO<T> {

    void add(T elem);

    void addAt(int location, T elem);

    void addAll(List<T> elements);

    void addAllAt(int location, List<T> elements);

    void remove(T elem);

    void removeAll(List<T> elements);

    void removeAt(int index);

    void clear();

    void replace(T oldElem, T newElem);

    void replaceAt(int index, T elem);

    void replaceAll(List<T> elements);

    ArrayList<T> getAll();

    T get(int position);

    int getSize();

    boolean contains(T elem);

    void onEmptyData();

    void onHasData();
}
