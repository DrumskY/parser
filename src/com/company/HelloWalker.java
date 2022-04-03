package com.company;



public class HelloWalker extends HelloBaseListener {
  public void enterR(HelloParser.RContext ctx ) {
    System.out.print( "String " + ctx.ID().getText() );
  }

  public void exitR(HelloParser.RContext ctx ) {
    System.out.println( );
  }

  public void enterZ(HelloParser.ZContext ctx) {
    System.out.print( "int " + ctx.ID().getText()) ;
  }
  public void exitZ(HelloParser.ZContext ctx) {
    System.out.println(" ") ;
  }

  public void enterY(HelloParser.YContext ctx) {
    System.out.print( "double " + ctx.ID().getText()) ;
  }
  public void exitY(HelloParser.YContext ctx) {
    System.out.println(" ") ;
  }

  public void enterW(HelloParser.WContext ctx) {
    System.out.print( "char " + ctx.ID().getText()) ;
  }
  public void exitW(HelloParser.WContext ctx) {
    System.out.println(" ") ;
  }

  public void enterX(HelloParser.XContext ctx) {
    System.out.print( "System.out.print( '" + ctx.ID().getText()) ;
  }
  public void exitX(HelloParser.XContext ctx) {
    System.out.println(" ')") ;
  }
}

