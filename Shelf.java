import java.util.*;

class Shelf {
  private int length;
  private ArrayList<Shelfable> collection;

  public Shelf(int length){
    this.length = length;
    collection = new ArrayList<Shelfable>();
  }

  public int getLength(){
    return this.length;
  }

  public int countCollection(){
    return collection.size();
  }

  public void shelve(Shelfable reader){
    collection.add(reader);
  }

  public boolean isFull(){
    return countCollection() == this.length;
  }

  public int contentRating(){
    int total = 0;
    for( Shelfable reader : collection ) {
      total += reader.content_rating();
    }
    return total;
  }

  public Shelfable takeFromShelf() {
    if (countCollection() > 0) {
      return collection.remove(0);
    }
    return null;
  }
  

}


