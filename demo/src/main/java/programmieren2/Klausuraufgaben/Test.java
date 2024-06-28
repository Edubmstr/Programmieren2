package programmieren2.Klausuraufgaben;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
        List<String> g7 = Arrays.asList("USA", " Japan ", "France ", " Germany ", " Italy ", "U.K."," Canada ");

 String s = g7 . stream ()
. filter ( e -> e . length () <= 3)
. map ( x -> x. replace (".","") )
 . collect ( Collectors . joining (",")) ;
 System . out . println (s ) ;// result ?
    }

}
