package com.aca.week8.JavaPractice;

     class MapLegendGeneric4<K> implements MyMap<K, Object> {
        public void put( K key, String value) {}

        @Override
        public void put(K key, Object value) {

        }

        public String get(K key) { return null; }

    }
    //when write abstract class => works


