package epam.lambda;
import java.util.*;
import java.util.function.DoubleConsumer;
import java.util.function.ToIntFunction;

public class First {
	public static void main(String[] args){
	final List<Integer> primes=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
	primes.stream()
	         .mapToInt(new ToIntFunction<Integer>() {
				@Override
				public int applyAsInt(Integer i) {
					return i;
				}
			})
	         .average()
	         .ifPresent(new DoubleConsumer() {
				@Override
				public void accept(double avg) {
					System.out.println(avg);
				}
			});
	    }
	}