#Slackify

This thing uses Scala Native. There are some steps you need to take prior to building the project:

Scala Native website http://www.scala-native.org/
Current version environment setup steps: http://www.scala-native.org/en/v0.3.9-docs/user/setup.html

Basically, on a Mac, assuming you have java and sbt setup, the one thing extra you'll need to do is install llvm toolchain `brew install llvm` and you should be ready to go.

```
sbt nativeLink

./target/scala-2.11/slackify-out "Hello world"

# or do both of the above in a single step:
sbt 'run "Hello world"'
```

2019-07-30 Peter Perhac
