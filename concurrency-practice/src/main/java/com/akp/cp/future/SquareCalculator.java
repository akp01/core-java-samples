package com.akp.cp.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

class SquareCalculator {

    private final ExecutorService executor;

    SquareCalculator(ExecutorService executor) {
        this.executor = executor;
    }

    Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            Thread.sleep(1000);
            return input * input;
        });
    }
}
