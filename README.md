Please see https://github.com/dylanbeattie/rockstar for more information about this awesome language.

Yes, I know what you're thinking. Java is so much NOT the right tool for the job. But it was all that I had on my home computer (OK, so I also had enviroments for C++ and Matlab... but Matlab is a language where NOBODY should be doing this kind of parsing, and considering which kind of project is this, Java is probably a better choice than C++).

So, Java it is. I haven't used lex/yacc, let alone better parser tools, in ages. Also this is the very first time I'm writing an interpreter. My point is: the code is crap and I never intended otherwise. It is also probably buggy and I think it doesn't follow the full specs. I wrote this in one single evening, probably no more than 4 or 5 hours in total. This is absolutely NOT intended for professional use. But the language creator clearly specified that if you write even a single line of Rockstar then you are a full-fledged Rockstar developer. And this crappy interpreter can be used to write a (probably faulty) Hello world. YOU CAN BE A ROCKSTAR DEVELOPER TOO! JUST USE THIS INTERPRETER! BESTELLEN SIE JETZT! Also, I can't promise that I will keep this implementation up to date, but if you really want it, as long as you ask nicely and I have the free time (this might be tough depending on the time of the year), I don't mind spending some time maintaining the project :).

I will probably provide further code examples. Despite my dislike for dynamically typed languages, I have to admit that writing snippets of code in Rockstar is fun, at least for the few first times, if only because you can get very creative and lyrical. It's paradoxical: the natural obfuscation of the language says "only for especially nerdy programmers", but the room for imagination says "people with pure humanities background are very welcome". I guess that Rockstar can be an inclusive language: Bonnie Tyler, Nathan East or Freddie Mercury are just as welcome as Rudolf Schenker. There is room for everyone in the land of rock!

07/08/2018 Added functionality to work with the example provided with the Rockstar specs.
*"LOWER OR EQUAL" and "HIGHER OR EQUAL" comparisons.
*Add, Substract, Multiply and Divide instructions added.
*NoOp instrucion added for comments.
*Added support to complex assignments (ie: x = y + z).
*Fixed Until and If blocks (and While too probably).
*Added "debug" flag and toString() methods to all instructions.
*Added auto conversion of inputs to numbers instead of only strings.
*Added pretty-print for integers.
