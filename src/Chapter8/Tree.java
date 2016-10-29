package Chapter8;

/**
 * Created by JobQ on 10/28/2016.
 */
public class Tree {
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private Node root;
    public Node find(int key) {
        // 1. we will search the value from the root
        Node current = root;

        // 2. if the value = key, then return the node
        while (current.iData!=key){
            if (current.iData<key)
                current=current.rightChild;
            else
                current=current.leftChild;
            if (current==null)
                return null;
        }
    return current;
    }
    public void insert(int id,double dd,char c){
        Node node = new Node();
        node.iData=id;
        node.fData=dd;
        node.c=c;
        node.leftChild=null;
        node.rightChild=null;

        Node current = root;
        //1. if there are not root
        if (root==null){
            root=node;
            return;
        }
        //2. find the position
        Node parent = root;
        while (current!=null){
            parent = current;
            if (id>current.iData)
                current=current.rightChild;
            else
                current=current.leftChild;
        }
        if (parent.iData>id)
            parent.leftChild = node;
        else
            parent.rightChild=node;
    }


    /**
     * input 1 to show the tree inorder
     * */
    public void display(int type){
        if (type==1)
            inOrder(this.root,1);
        else if(type==2)
            preOrder(this.root,1);
        else
            postOrder(this.root,1);
    }
    private void inOrder(Node localRoot,int level){
        if(localRoot!=null){
            inOrder(localRoot.leftChild,level+1);
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(localRoot.iData+"="+localRoot.c);
            inOrder(localRoot.rightChild,level+1);
        }
    }

    private void preOrder(Node localRoot,int level){
        if(localRoot!=null){
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(localRoot.iData+"="+localRoot.c);
            preOrder(localRoot.leftChild,level+1);
            preOrder(localRoot.rightChild,level+1);
        }
    }

    private void postOrder(Node localRoot,int level){
        if(localRoot!=null){
            postOrder(localRoot.leftChild,level+1);
            postOrder(localRoot.rightChild,level+1);
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(localRoot.iData+"="+localRoot.c);

        }
    }
    public Node minimum(){
        Node current = root;
        while (current.leftChild!=null)
            current = current.leftChild;
        return current;
    }
    public boolean delete(int id){
        // 1. firstly, we need to find the node and its parent
        Node current = root;
        Node parent = current;
        if (root==null)
            return false;
        while(current.iData!=id) {
            parent=current;
            if (current.iData > id)
                current = current.leftChild;
            else
                current = current.rightChild;
            if (current==null)
                return false;
        }
        System.out.println("the node is ="+current.iData);
        // 2. find the successive point

       System.out.println("the parent point is "+parent.iData);
        if(current.leftChild==null&&current.rightChild==null){
            if(parent.iData>current.iData)
                parent.leftChild=null;
            else
                parent.rightChild=null;
            return true;
        }
        if (current.leftChild==null&&current.rightChild!=null){
            if(parent.iData>current.iData)
                parent.leftChild=current.rightChild;
            else
                parent.rightChild=current.rightChild;
            return true;
        }
        if (current.leftChild!=null&&current.rightChild==null) {
            if (parent.iData > current.iData)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
            return true;
        }
        Node successive = current.leftChild;
        System.out.println(successive.iData);
        System.out.println(successive.rightChild==null);
        while (successive.rightChild!=null)
            successive=successive.rightChild;
        this.delete(successive.iData);
        System.out.println("current\t"+current.leftChild+"  "+current.rightChild.iData);
        successive.rightChild=current.rightChild;
        successive.leftChild=current.leftChild;
        System.out.println("successive=\t"+successive.iData+" "+successive.leftChild+"  "+successive.rightChild.iData);
        if (parent.iData<current.iData)
            parent.rightChild=successive;
        else if(parent.iData>current.iData)
            parent.leftChild=successive;
        else
            this.root=successive;
        return true;
    }

}
