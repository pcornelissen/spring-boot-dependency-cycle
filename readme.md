# How to break a circular dependency cycle in spring boot when you are using constructor injection

It rarely happens, but when it does, it's very annoying. You have a circular dependency and you want (or have) to stick to
constructor injection.


Checkout the commits in this repo to see how it can be done:

1. The first commit is the project with the circular dependency
1. Three commits try to put @Lazy to the class/bean definitions (tl;dr: Doesn't work)
1. To break the cycle you can put @Lazy at one of the injection points and spring will create a proxy, which breaks the chicken and egg scenario

    Be aware:
    1. If you are using Lombok, you have to write the constructor on your own (or generate it using your IDE)
    1. You no longer need to add cglib as dependency to your project as other tutorials suggest
    
This is based on Spring-boot 2.0.2