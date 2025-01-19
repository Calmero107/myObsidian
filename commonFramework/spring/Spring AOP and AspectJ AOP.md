
**Spring AOP is a runtime enhancement, while AspectJ is a compile-time enhancement.** Spring AOP is based on proxying, while AspectJ is based on bytecode manipulation.

Spring AOP has integrated AspectJ, which is the most complete AOP framework in the Java ecosystem. AspectJ is more powerful than Spring AOP, but Spring AOP is relatively simpler.

If we have fewer aspects, then the performance difference between the two is not much. However, when there are too many aspects, it is better to choose AspectJ, which is much faster than Spring AOP.