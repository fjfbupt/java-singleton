# Design Pattern: Singleton

## Intent
Ensure a class only has one instance, and provide a global point of access to it.

## Implementation
There are many ways to implement the Singleton. Here we use the Initialization-on-demand approach.

### Initialization-on-demand (holder pattern)

Wiki:
>(...) efforts on the "Double-checked locking" idiom led to changes in the Java memory model in Java 5 and to what is generally regarded as the standard method to implement Singletons in Java.
>The technique known as the initialization-on-demand holder pattern is as lazy as possible, and works in all known versions of Java.
>It takes advantage of language guarantees about class initialization, and will therefore work correctly in all Java-compliant compilers and virtual machines.

>The nested class is referenced no earlier (and therefore loaded no earlier by the class loader) than the moment that `getInstance()` is called.
>Thus, this solution is thread-safe without requiring special language constructs (i.e. `volatile` or `synchronized`).


### Test result
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
objc[67784]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/jre/bin/java (0x108b634c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x10ab344e0). One of the two will be used. Which one is undefined.
Apr 30, 2019 6:16:22 PM org.junit.jupiter.engine.discovery.JavaElementsResolver resolveClass
WARNING: Class 'com.sunlife.singleton.SingletonTest' could not be resolved.
Running com.sunlife.singleton.AppTest
18:16:23.119 [main] INFO com.sunlife.singleton.App - com.sunlife.singleton.InitializingOnDemandHolderIdiom@769f71a9
18:16:23.125 [main] INFO com.sunlife.singleton.App - com.sunlife.singleton.InitializingOnDemandHolderIdiom@769f71a9
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.178 sec - in com.sunlife.singleton.AppTest
Running com.sunlife.singleton.InitializingOnDemandHolderIdiomTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.068 sec - in com.sunlife.singleton.InitializingOnDemandHolderIdiomTest

Results :

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.785 s
[INFO] Finished at: 2019-04-30T18:16:23-04:00
[INFO] ------------------------------------------------------------------------
```


## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
* [Effective Java (2nd Edition)](http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683)
* Many open source solutions/blogs
