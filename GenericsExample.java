package com.example.myapplication;

public class GenericsExample {

 public static void main(String[] args){
   
   shout("alora");
   shout(21);
   
 }


  private static <T> void shout (T thingToShout){
   System.out.println(thingToShout + "!!!!");
 }
 }