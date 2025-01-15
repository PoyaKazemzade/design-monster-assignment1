## What happens if the designers of the Storage class decide to change the implementation of the List to LinkedList?
## Think about the method calls in main - does trimToSize() exist in LinkedList?
## Should Main know about what concrete type of List Storage provides?

- If the implementation of the List in Storage is changed to LinkedList, the Main class would face issues if it depends on
methods or behaviors specific to ArrayList. For example, trimToSize() belongs to ArrayList and does not exist in LinkedList.

- Main should not know about the concrete type of the List provided by Storage for the following reasons.

    1- Decoupling: This reduces the coupling between Main and Storage, making the system easier to maintain and extend.

    2- Polymorphism: Programming to an interface (in this case List) allows Main to work with any List implementation like 
    ArrayList, LinkedList without requiring changes.

    3- Encapsulation: By hiding the concrete type and exposing only the List interface, Storage increases the flexibility
    to change its internal implementation without affecting external code.