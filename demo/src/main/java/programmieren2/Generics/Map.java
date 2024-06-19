/* package programmieren2.Generics;

import java.util.HashMap;

public class Map<K extends Number, V> {

     HashMap<K, V> hashMap;

}

List meineListe = new ArrayList();
meineListe.add( "Hallo" );
String s = (String) meineListe.get( 0 ); // ohne Generics

List meineListe = new ArrayList();
meineListe.add( new Integer(42) );
String s = (String) meineListe.get( 0 ); // <-- Laufzeit-Exception !

List<String> meineListe = new ArrayList<>();
meineListe.add( "Hallo" );
String s = meineListe.get( 0 ); // mit Generics 

List<String> meineListe = new ArrayList<>();
meineListe.add( new Integer(42) ); // <-- Kompilierfehler
String s = meineListe.get( 0 );

from typing
import TypeVar, ListT = TypeVar('T')def element(items: List[T]) -> T:return items[0]# Usageprint(element([1, 2, 3]))print(element(['a', 'b', 'c'])) */