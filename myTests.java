// import java.io.ByteArrayInputStream;
// import java.io.InputStream;

// import org.junit.*;
// public class myTests {
//     @Test
//     public void testWithUserInput(){
        

//         String input = "T";
//         InputStream in = new ByteArrayInputStream(input.getBytes());
//         System.setIn(in);

        
//     }
// }

// Simple choice 1 inclusive

// User input:
// 1
// 5
// 23

// output:

// The following primes in the range from 5 to 23 are:
// 5, 
// 7, 
// 11, 
// 13, 
// 17, 
// 19, 
// 23, 


// Simple choice 2

// User input:
// 2
// 5
// 23

// output:

// The first 23 primes starting from 5 are:
// 5, 
// 7, 
// 11,
// 13,
// 17,
// 19,
// 23,
// 29,
// 31,
// 37,
// 41,
// 43,
// 47,
// 53,
// 59,
// 61,
// 67,
// 71,
// 73,
// 79,
// 83,
// 89,
// 97,


// Invalid Choice then choice 1

// User input:
// one
// 1
// 5
// 23

// output:

// invalid choice - please try again

// The following primes in the range from 5 to 23 are:
// 5, 
// 7, 
// 11, 
// 13, 
// 17, 
// 19, 
// 23, 

// Valid choice 1 invalid min and max

// User input:
// 1
// -5
// -5

// output:

// invalid input min set to 2
// invalid input max set to min

// The following primes in the range from 2 to 2 are:
// 2,


// Choice 2 invalid start/amount

// User input:
// 2
// -5
// W

// output:

// Start point set to 2.
// Amount set to 1.

// The first 1 primes starting from 2 are:
// 2, 
