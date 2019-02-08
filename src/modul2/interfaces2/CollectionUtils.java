package modul2.interfaces2;

import java.util.Collection;
import java.util.Set;
//a = 1 4 8 15
//b = 1 3 5 15


/**
 * Утилиты для работы с коллекциями объектов 
 * 
 * @author nedis
 * @version 1.0
 */
public interface CollectionUtils {

	/**
	 * Объединение двух коллекций с дубликатами
	 * 
	 * @param a первая коллекция
	 * @param b вторая коллекция
	 * @return новая колекция содержащая объединение a и b, может содержать дубликаты 
	 * @throws NullPointerException если a или b == null
	 */
	Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException; // c=1 4 8 15 1 3 5 15
	
	/**
	 * Пересечение двух коллекций с дубликатами
	 * 
	 * @param a первая коллекция
	 * @param b вторая коллекция
	 * @return новая колекция содержащая пересечение a и b, может содержать дубликаты 
	 * @throws NullPointerException если a или b == null
	 */
	Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException;//c = 1 15 1 15
	
	/**
	 * Объединение двух коллекций без дубликатов
	 * 
	 * @param a первая коллекция
	 * @param b вторая коллекция
	 * @return новая колекция содержащая объединение a и b без дубликатов 
	 * @throws NullPointerException если a или b == null
	 */
	Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException;//c= 1 4 8 15  3 5
	
	/**
	 * Пересечение двух коллекций без дубликатов 
	 * 
	 * @param a первая коллекция
	 * @param b вторая коллекция
	 * @return новая колекция содержащая пересечение a и b без дубликатов
	 * @throws NullPointerException если a или b == null
	 */
	Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException;//
	
	/**
	 * Разность двух коллекций  
	 * 
	 * @param a первая коллекция
	 * @param b вторая коллекция
	 * @return новая колекция содержащая разность a и b 
	 * @throws NullPointerException если a или b == null
	 */
	Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException;
}
