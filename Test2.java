public class Predicates {
	
    public static void main(String[] args) {
    	
       Predicate<Integer> predicate = (person) -> person > 30;
       
        boolean results = predicate.test(35);
        
        System.out.println(resultsss);
    }
}
