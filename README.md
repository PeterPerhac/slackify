# Slackify

Turns the program argument into a series of colon-surrounded letters, leaving punctuation alone and replacing whitespace with `:blank:` emoji. It's up to you to load the emojis into your Slack workspace:

e.g.

`slackify "Hello World!"` produces `:h::e::l::l::o::blank::w::o::r::l::d:!`

You can copy-paste the output into a slack message, and, provided you have emojis for each letter of the alphabet (i.e. `:a:`, `:b:`, `:c:`, etc.), your message will become a lot more colourful and exciting:

![Hello World!](slack-hello-world.png)

This thing uses Scala Native. There are some steps you need to take prior to building the project:

Scala Native website http://www.scala-native.org/
Current version environment setup steps: http://www.scala-native.org/en/v0.3.9-docs/user/setup.html

Basically, on a Mac, assuming you have your Scala development environment in place (i.e. java / scala / sbt installed), the one thing extra you'll need to do is install `llvm` toolchain `brew install llvm` and you should be ready to go.

```
sbt nativeLink

./target/scala-2.11/slackify-out "Hello world"

# or do both of the above in a single step:
sbt 'run "Hello world"'
```

2019-07-30 Peter Perhac
