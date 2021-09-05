package com.aca.week8.Class13;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

public class DB {
    final List<User> objects = new ArrayList<>();

    public DB() {
        for(int i = 0; i < 10_000; i++) {
            final User user = new User(UUID.randomUUID().toString(),
                    BigDecimal.valueOf(i)
            );

            objects.add(user);
        }
    }

    public BigDecimal getSalaryByUsername(String username) {
        for (int i = 0; i < objects.size(); i++) {
            if(objects.get(i).getUserName().equals(username)) {
                return objects.get(i).getSalary();
            }
        }
        throw new NoSuchElementException("Could not find salary by username");
    }
    /*

    1) "abc".hashcode() -> -374578
    -2 * 10^9 -+ 2*10^9

    2) [a,b]  ->  [c,d] mashtabavorel
     */
}
