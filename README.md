## Stackey-the-Bear

### Uses: Stacks, Queue

#### Part I
Stackey the Bear puts out forest fires. The forest is represented by an 11 x 11 grid with rows and columns labeled from 0 to 10. Stackey starts out at home base which is (0,0) at time 0. When Stackey gets a call about  a forest fire, and Stackey is not going to a fire or putting out a fire at the time of the call, Stackey will go the location of the fire and put it out. If Stackey is busy moving to a fire or putting one out when a call comes in, Stackey will put the new call on a stack. When Stackey is done putting out the current fire, and the stack of calls is not empty, Stackey will pop the stack and answer that call. When Stackey is done putting out a fire, and there are no calls on the stack, Stackey will stop where Stackey is and wait for the next call. Stackey always moves one square left, right, up or down at a time. Stackey never moves diagonally. Moving 
one square takes one minute. Putting out a fire takes one minute. The time of the simulation starts at 0. When a call is received, it is given as a triple (time, x, y) where time is the time of the call in minutes from the start of the simulation, and x and y are the location of the fire. Both x and y are between 0 and 10, inclusive. 

The program reads in a list of fire calls (time, x, y) and simulates Stackey's movement. The times of the calls are increasing in the input. Every time Stackey receives a call, moves to a fire, or puts out a fire, the  program print out a message with the time, Stackey's (or the fire's) position, and the action.The program reads from standard
input until the end of input and write to standard output. Each fire call is on a separate line of the input and consists of three ints, separated by a space. 

#### Part II
Queuey the Bear is Stackey's cousin who also puts out forest fires. However. Queuey uses a queue instead of a stack. A program that simulates Queuey's behavior. Everything else is the same as the Stackey simuation. 
