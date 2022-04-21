package br.com.roberto.codigoruim.funcoes.seqfibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void testFibonacci(){
        Assertions.assertEquals(0, Fibonacci.fib(0));
        Assertions.assertEquals(1, Fibonacci.fib(1));
        Assertions.assertEquals(1, Fibonacci.fib(2));
        Assertions.assertEquals(2, Fibonacci.fib(3));
        Assertions.assertEquals(3, Fibonacci.fib(4));
        Assertions.assertEquals(5, Fibonacci.fib(5));
        Assertions.assertEquals(8, Fibonacci.fib(6));
        Assertions.assertEquals(13, Fibonacci.fib(7));
        Assertions.assertEquals(21, Fibonacci.fib(8));
        Assertions.assertEquals(34, Fibonacci.fib(9));
        Assertions.assertEquals(55, Fibonacci.fib(10));
    }

    @Test
    void testSeq(){
        Assertions.assertEquals("0,1,1,2,3,5", Fibonacci.seq(5));
        Assertions.assertEquals("0,1,1,2,3,5,8,13,21,34,55", Fibonacci.seq(10));
    }


}
