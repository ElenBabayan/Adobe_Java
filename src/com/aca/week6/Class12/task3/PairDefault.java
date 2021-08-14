package com.aca.week6.Class12.task3;

public final class PairDefault<T, K> implements Pair<T, K>{
    private final T key;
    private final K value;

    public PairDefault(T key, K value) {
        if(key == null) {
            throw new IllegalArgumentException("The key should not be null");
        }
        if(value == null) {
            throw new IllegalArgumentException("The value should not be null");
        }
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public K getValue() {
        return value;
    }

    public boolean equals(Object that) {
        if(this == that) {
            return true;
        }
        if(!(that instanceof PairDefault)) {
            return false;
        }
        // USE <?, ?> FOR SAFETY (main add example)
        final Pair <?, ?> pair = (Pair<?, ?>) that;
        return this.getValue().equals(pair.getValue())
                && this.getKey().equals(pair.getKey());
    }

    @Override
    public String toString() {
        return "PairDefault{" +
                "key=" + getKey() +
                ", value=" + getValue() +
                '}';
    }

    public static <T, K> void printPair(PairDefault<T, K> pair) {
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }

    public static void main(String[] args) {
        PairDefault<Integer, String> myPair = new PairDefault<>(12,"Elen");
        System.out.println(myPair.getKey());
        System.out.println(myPair.getValue());

        final PairDefault<Integer, String> pair2 = new PairDefault<Integer, String>(12,"Elen");
        System.out.println(myPair.equals(pair2));

        PairDefault.printPair(myPair);
    }
}
