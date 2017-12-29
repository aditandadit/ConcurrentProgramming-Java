# Concurrent-Java-Coursera

WEEK 1 --> Create a Concurrent Data Structure using Java ReentrantLock & ReentrantReadWriteLock

WEEK 2 --> Thread Safe Bank Transaction using Critical Section ( Isolated in PCDP )

WEEK 3 --> Create Concurrent Dynamic Prime Number Generating PipeLine Based on Actor Model of Concurrency using Sieve of Eratosthenes

``` 
The Actor model model of concurrent computation
treats "actors" as the universal primitives of concurrent computation.
In response to a message that it receives,
an actor can: make local decisions, create more actors, send more messages,
and determine how to respond to the next message received.
Actors may modify their own private state,
but can only affect each other through messages (avoiding the need for any locks).
```
WEEK 4 --> Parallel implementation of Boruvka's algorithm to compute a Minimum Spanning Tree using TryLock

``` 
Boruvka's algorithm computes the minimal spanning tree through successive applications of edge-contraction on an input graph (without self-loops).
In edge-contraction, an edge is chosen from the graph and a new node is formed with the union of the connectivity of the incident nodes of the chosen edge.
In the case that there are duplicate edges, only the one with least weight is carried through in the union.
Boruvka's algorithm proceeds in an unordered fashion. Each node performs edge contraction with its lightest neighbor. 
```

To Test and build --> cd into miniProject_{WeekNumber}
``` 
mvn test
```
```
mvn clean install 
```
