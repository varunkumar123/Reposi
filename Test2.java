public class Predicates {
	
    public static void main(String[] args) {
    	
       Predicate<Integer> predicate = (person) -> person > 30;
       
        boolean result = predicate.test(35);
        
        System.out.println(result);
    }
}
