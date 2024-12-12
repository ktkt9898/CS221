# Linked Lists
Instead of hard coding, use a chain to refer where elements "point" to eachother in the chain
Cannot standardize the next() method for different objects, we want to link elements but not directly relate the objects
so they can be configured to hold anything

Instead of directly linking objects, use a concept called a "node" which can hold a reference to a configurable type
This is a lightwieght object that can be configured to hold any element type; no longer have to worry about what the list holds

These nodes are the foundation/backbone of a chain linear data structure

# Nodes
The critical point is to know where the beginning starts
If wanting to add to the beginning, just create a new node to the start of the chain that "points" to the start node, similarly to add to the end, add a node that points to the node right before null and link this node to the node, including null right after;
no need to copy and shift