package com.aca.week6.Class11;

import java.util.NoSuchElementException;
import java.util.Objects;

public class BufferImpl<T> implements Buffer<T> {

    private T value = null;

    // get user put order, class cast exception
    @Override
    public T get() {
        if(this.value == null) {
            throw new NoSuchElementException("Object is null");
        }
        T tmp = value;
        value = null;
        return tmp;
    }

    @Override
    public void put(T o) {
        if(this.value != null) {
            throw new IllegalStateException("Object already exists");
        }
        this.value = o;
    }

    @Override
    public String toString() {
        return "BufferImpl{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof BufferImpl))
            return false;

        BufferImpl buffer = (BufferImpl) o;
        return this.value.equals(buffer.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public static void main(String[] args) throws Exception {
        final Buffer<User> buffer = new BufferImpl<>();
        buffer.put(new User("Elen"));
        // final Order order = (Order) buffer.get();
        // when we make classes generic, no exception is thrown,
        // compiler error says inconvertible types


        final Buffer<User> userBuffer = new BufferImpl<>();
       // userBuffer.put(new Order(10, "china"));// cannot put order
        userBuffer.put(new User("Elen"));
        final User user = userBuffer.get();
        System.out.println(user);

        /*
        Generics add that type safety feature
        Generics work only with Reference Types:
         */
    }
}
