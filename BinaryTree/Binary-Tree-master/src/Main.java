//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create an instance of BinarySearchTree for Integer
        BinarySearchTree<Integer> intTree = new BinarySearchTree<>();
            intTree.insert(8);
            intTree.insert(17);
            intTree.insert(12);
            intTree.insert(9);
            intTree.insert(5);
            intTree.insert(2);      // Insert several integer values into the tree

        System.out.println("======== In Order ========");
        intTree.inOrder(intTree.root);  // Call inOrder traversal method to print the integers in sorted order
        System.out.println();
        System.out.println("======== Pre Order ========");
        intTree.preOrder(intTree.root);
        System.out.println();
        System.out.println("======== Post Order ========");
        intTree.postOrder(intTree.root);
        System.out.println();


        // Create an instance of BinarySearchTree for Person
        BinarySearchTree<Person> personTree = new BinarySearchTree<>();
            // Insert several Person objects into the tree
            personTree.insert(new Person("John Smith", 25));
            personTree.insert(new Person("Sarah Jones", 30));
            personTree.insert(new Person("Michael Brown", 22));
            personTree.insert(new Person("Oblong Roblox", 19));

        // Call inOrder traversal method to print the Person objects in order by id
        System.out.println("======== In Order ========");
        personTree.inOrder(personTree.root);  // Call inOrder traversal method to print the integers in sorted order
        System.out.println();
        System.out.println("======== Pre Order ========");
        personTree.preOrder(personTree.root);
        System.out.println();
        System.out.println("======== Post Order ========");
        personTree.postOrder(personTree.root);
        System.out.println();

        int height = intTree.height(intTree.root);
        System.out.println("Height of tree is: " + height);

        int comp = intTree.comparisons;
        System.out.println("Comparasions made: " + comp);

        boolean isFound = intTree.search(intTree.root, 9);
        if(isFound)
            System.out.println("Number was found");
        else
            System.out.println("Number was NOT found");
    }
}





