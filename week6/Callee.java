package week6;

public class Callee implements Incrementable{
    int i = 0;
public void increment(){
    i++;
    System.out.println("i = " + i);
}}
