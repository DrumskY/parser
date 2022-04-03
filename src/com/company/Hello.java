package com.company;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Hello {
  public static void main( String[] args) throws Exception, IOException
  {
    CharStream charStream= CharStreams.fromFileName("C:/Users/Bartek/Desktop/Parser/src/com/company/test.txt");
    HelloLexer lexer = new HelloLexer(charStream);
    CommonTokenStream tokens = new CommonTokenStream( lexer );
    HelloParser parser = new HelloParser( tokens );
    ParseTree tree = parser.program();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk( new HelloWalker(), tree );
  }
}
