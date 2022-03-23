package com.thetuber.thetuber.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PageUtils {

    public static <T> List<List<T>> gridList(List<T> list) {
        List<List<T>> gridList = new ArrayList<>();

        while (!list.isEmpty()) {
            if (list.size() > 1) {
                gridList.add(List.of(list.remove(0), list.remove(0)));
            } else {
                gridList.add(List.of(list.remove(0)));
            }
        }

        return gridList;
    }

}
