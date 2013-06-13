# Fjord, F&#35; programming language for the JVM.

[![Build Status](https://travis-ci.org/penberg/fjord.png?branch=master)](http://travis-ci.org/penberg/fjord)

Fjord is an implementation of the [F#][F#] programming language for the JVM.

*The implementation is at very early stages, so if you are looking to use F# on
the JVM, Fjord is probably not for you.* However, if you are interested in
hacking on F# implementation for the JVM, welcome on board!

## Building Fjord

### Requirements

Fjord is built and packaged with [Apache Maven][Apache Maven] and requires Java
1.6 or higher to build and run.

### Building from sources

To build F#, run:

```
mvn package
```

### Trying it out

To launch the F# interactive shell run:

```
./bin/fji
```

and you are greeted with:

```
Fjord

For help type #help
> _
```

## Features

* Aims at F# 3.0 language compatibility

## Want to help?

Want to help? Grab the [F# specification][F# specification], fork the GitHub
repository, and send a pull request!

For questions and comments, drop me a line on [Twitter] or on #fjord at
irc.freenode.net, or send me email at penberg@iki.fi.

## License

```
Copyright (C) 2013 Pekka Enberg

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

## Credits

*(in order of appearance)*

* Alex Biehl

[Apache Maven]: http://maven.apache.org/
[F# specification]: http://fsharp.org/about/files/spec.pdf
[F#]: http://fsharp.org/
[Twitter]: https://twitter.com/penberg
