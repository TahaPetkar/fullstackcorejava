package com.streamapi.demo;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MainStreamApi {
	public static void main(String args[]) {
		int[] intArray= {3,2,6,1,8,4,5,2,3,4,1,5};
			IntStream intStream = Arrays.stream(intArray);
//		intStream.map((int no) ->retrun no*2;)) .forEach(no->System.ou.println(no))
				intStream
				 .map((no)->no+2)
				  .filter(no->no%2==0)
				   .map(no->no+1)
				    .peek(no->System.out.print(no))
				     .distinct()
				      .sorted() 
				       .forEach(no->System.out.println(no));
				  intStream.close();
	}
}
