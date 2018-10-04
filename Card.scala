package BackJack


object Main extends App{



}

class Player() {

}

class Card(){
  val mark = Array("ハート","クローバー","ダイヤ","スペード");
  val card = Array("A","2","3","4","5","6","7","8","9","10","J","Q","K");
  var tranp = List[Object]();
  for( i <- 0 to mark.length - 1; j <- 0 to card.length - 1){
    tranp :+= (mark(i),card(j));
  }
}
