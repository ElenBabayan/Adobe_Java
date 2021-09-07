package com.aca.week8.JavaPractice;

//class MapLegendNonGeneric implements MyMap <String, Integer> {
//    public void put(String s, Integer i) { }
//    public Integer get(String s) { return null; }
//}


class MapLegendGeneric<K, V> implements MyMap<K, V> {
    public void put(K key, V value) { }
    public V get(K key) { return null; }
}

