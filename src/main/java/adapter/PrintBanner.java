package adapter;

public class PrintBanner extends Banner implements Print{
  public PrintBanner(String string){
    super(string);
  }
  
  public void printWeak(){
    showWithParen();
  }
  
  public void printString(){
    showWithAster();
  }
  
}
