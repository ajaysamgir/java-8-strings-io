# java-8-strings-io

## Strings in java 8
- Initially in Java version String class use for such operations like concatenation using + operator. but it was quite heavy operation then java introduced StringBuffer class which is helps to perform string operations with efficient way but problem with StringBuffer is they are synchronized.
- Java provide another one class StringBuilder which is faster then string buffer. in Java 7 update jdk start to use StringBuilder behind the + operator so after java 7 + operator improves performance during spring concatenation.
- Java 8 introduced StringJoiner class which provide add method which work same as + operator. also StringJoiner have additional features like add prefix and postfix to string.
- see StringJoinerImpl.java
- With the help of java 8 features StringJoiner can be directly used from string class using static method join()
- join() method not allow for prefix and postfix delimiters so you can not use that feature.

## Java IO Enhancement in java 8

 