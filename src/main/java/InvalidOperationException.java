package main.java;/*File:  InvalidOperationExcepiton.java		Author:  	amehlaseDate:	 ??Description:  Exception for when an invalid operation is thrown.*/import java.lang.*;  // for class Exception/** * class for matrix positions */public class InvalidOperationException extends RuntimeException {            /**         * Constructs a <code>InvalidOperationException</code>          * with no detail message.         */        public InvalidOperationException() {                super();        }        /**         * Constructs a <code>DimensionException</code> with the specified          * detail message.          *         * @param   s   the detail message.         */        public InvalidOperationException(String message) {                super( message );        }}