# Concurrent-Java-Coursera
[Coursera Verified Certificate](https://www.coursera.org/account/accomplishments/certificate/2YRK37SR6FUN)
WEEK 1 --> [Create a Concurrent Data Structure using Java ReentrantLock & ReentrantReadWriteLock](miniproject_1/src/main/java/edu/coursera/concurrent/CoarseLists.java)

WEEK 2 --> [Thread Safe Bank Transaction using Critical Section ( Isolated in PCDP )](miniproject_2/src/main/java/edu/coursera/concurrent/)

WEEK 3 --> [Create Concurrent Dynamic Prime Number Generating PipeLine Based on Actor Model of Concurrency using Sieve of Eratosthenes](miniproject_3/src/main/java/edu/coursera/concurrent/SieveActor.java)

``` 
The Actor model of concurrent computation 
treats "actors" as the universal primitives of concurrent computation.
In response to a message that it receives,
an Actor can: make local decisions, create more actors, send more messages,
and determine how to respond to the next message received.
Actors may modify their own private state,
but can only affect each other through messages (avoiding the need for any locks).
```
WEEK 4 --> [Parallel implementation of Boruvka's algorithm to compute a Minimum Spanning Tree For US Road Networks](miniproject_4/src/main/java/edu/coursera/concurrent/ParBoruvka.java)

``` 
Boruvka's algorithm computes the minimal spanning tree through successive applications of 
edge-contraction on an input graph (without self-loops).
In edge-contraction, an edge is chosen from the graph and a new node is formed with the 
union of the connectivity of the incident nodes of the chosen edge.
Boruvka's algorithm proceeds in an unordered fashion. 
```

To Test and build --> cd into miniProject_{WeekNumber}
``` 
mvn test
```
```
mvn clean install 
```
