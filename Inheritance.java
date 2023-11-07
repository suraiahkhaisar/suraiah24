class Bird
{
void fly()
{
System.out.println("I am a Bird");
}
}
class Parrot extends Birds
{
void WhatColorAmI()
{
System.out.println("I am Green!");
}
}
class Inheritance
{
public static void main(String args[])
{
Parrot p=new Parrot();
p.fly();
p.WhatColorAmI();
}
}