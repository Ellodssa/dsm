package org.ea.service;

import java.lang.Exception;
import java.io.IOException;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.regex.*;

import com.rabbitmq.client.*;
import com.rabbitmq.client.Consumer;

public class App {

  public static void main(String[] args) {
    while(true) {
      System.out.print("Ahh ");
      sleep(400);
      System.out.print("Ahh ");
      sleep(400);
      System.out.print("Ahh ");
      sleep(400);
      System.out.print("Ahh ");
      sleep(400);
      System.out.println("Staying alive! ");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      sleep(1000);
    }
  }
  public static  void sleep(int nanos) {
    try {
      Thread.sleep(nanos);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
