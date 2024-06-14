package com.streamapi.demo1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MainStreamAPI {
	public static void main(String args[]) {
		int[] intArray = {3,2,6,1,8,4,5,2,3,4,1,5};
		IntStream intStream=Arrays.stream(intArray);
		OptionalInt min=intStream
//				long count= intStream
//				Double count=inStream
			.filter(no->no>2)
				.sorted()
//						.peek(no->System.out.println(no))
							.map(no->no+2)
								.distinct()
								.filter(no->no>5 && no<10)
//							.forEach(no->System.out.print(no));
//								.forEach(System.out::pintln);
								.min();
								if(!min.isEmpty())
									System.out.println(min.getAsInt());
//								System.out.println(min.getAslong());
//								System.out.println(min.getAsDouble());
//								System.out.println(count);
							
		intStream.close();
	}
}
