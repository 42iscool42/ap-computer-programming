public class ParagraphPrint {
    public static void main(String[] args) {
        System.out.println("\t There are numerous binary decision trees that one could construct. Nonetheless,\n" + 
                           "we assert that given any such binary decision tree for comparing n elements, we can \n" + 
                           "compute its minimum height h; that is, there must be some leaf node that requires h\n" + 
                           "comparison nodes in the tree from the root to that leaf. Consider a complete binary \n" + 
                           "tree of height h in which all non-leaf nodes have both a left and right child. This \n" + 
                           "tree contains a total of n=2h−1 nodes and height h=log (n+1); if the tree is not \n" + 
                           "complete, it could be unbalanced in strange ways, but we know that h≥⌈log (n+1)⌉.[7]\n" +
                           "Any binary decision tree with n! leaf nodes already demonstrates it has at least n! \n" + 
                           "nodes in total. We need only compute h=⌈log (n!)⌉ to determine the height of any such\n" +
                           "binary decision tree. We take advantage of the following properties of logarithms: \n" + 
                           "log (a*b)=log (a)+log (b) and log (xy)=y*log (x).");
    }
}