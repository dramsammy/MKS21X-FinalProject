public class Driver{

  public static void main(String[] args){
    Board test = new Board();
    Pieces old=test.getPieces(5,5);
    System.out.println(old.getPieceChar());
    System.out.println(old.getValue());
    System.out.println(old.getLetterMultiplier());
    System.out.println(old.getWordMultiplier());
    test.modifyBoard(5,5,'Q');
    old=test.getPieces(5,5);
    System.out.println(old.getPieceChar());
    System.out.println(old.getValue());
    System.out.println(old.getLetterMultiplier());
    System.out.println(old.getWordMultiplier());
    test.modifyBoard(5,5,'K');
    old=test.getPieces(5,5);
    System.out.println(old.getPieceChar());
    System.out.println(old.getValue());
    System.out.println(old.getLetterMultiplier());
    System.out.println(old.getWordMultiplier());





  }







}