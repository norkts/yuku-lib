package com.norkts.yuku;

/**
 * ¹³×Óº¯Êý
 * @param <P>
 * @param <R>
 */
public interface ITask<P, R> {
    R execute(P param) throws Exception;
}
