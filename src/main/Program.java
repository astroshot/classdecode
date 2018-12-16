package main;

import jvm.ClassFileDecoder;


/**
 * Created by Altair on 2017/3/28.
 */
public class Program {
  public static void testClassFileDecoder() {
    ClassFileDecoder decoder = new ClassFileDecoder();
    decoder.setFileName("E:\\Projects\\java\\HashMap.class");
    decoder.decode();
  }
  public static void main(String[] args) {
    testClassFileDecoder();
  }
}
