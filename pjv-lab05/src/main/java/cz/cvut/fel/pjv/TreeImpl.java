package cz.cvut.fel.pjv;

public class TreeImpl implements Tree {
    private NodeImpl root;
    private TreeImpl LeftTree;
    private TreeImpl RightTree;

    public int depth = 0;

    public void setTree(int[] values){
        if (values.length == 0) {
            root = null;
            return;
        }
        else if(values.length % 2 == 0){
            //expecting 2 children
            if (values.length == 2){
                root = new NodeImpl(values[1]);
                this.LeftTree = new TreeImpl();//need?
                this.LeftTree.depth = this.depth + 1;
                this.LeftTree.setTree(new int[]{values[0]});
                this.root.setLeft(new NodeImpl(values[0]));



            }else {
                root = new NodeImpl(values[(values.length / 2)]);


                int[] left = java.util.Arrays.copyOfRange(values, 0, values.length / 2);
                this.LeftTree = new TreeImpl();

                this.LeftTree.depth = this.depth + 1;
                this.LeftTree.setTree(left);

                this.root.setLeft(this.LeftTree.getRoot());


                int[] right = java.util.Arrays.copyOfRange(values, values.length / 2 + 1, values.length);
                this.RightTree = new TreeImpl();

                this.RightTree.depth = this.depth + 1;
                this.RightTree.setTree(right);

                this.root.setRight(this.RightTree.getRoot());




            }
        }
        else{
//            if(values.length == 1){
//                String s = "stop";
//            }
            root = new NodeImpl(values[values.length/2]);


            int[] left = java.util.Arrays.copyOfRange(values, 0, values.length/2);
            LeftTree = new TreeImpl();

            this.LeftTree.depth = this.depth + 1;
            LeftTree.setTree(left);
            this.root.setLeft(this.LeftTree.getRoot());

            int[] right = java.util.Arrays.copyOfRange(values, values.length/2 + 1, values.length);
            RightTree = new TreeImpl();

            this.RightTree.depth = this.depth + 1;
            RightTree.setTree(right);

            this.root.setRight(this.RightTree.getRoot());



        }
    }

    @Override
    public Node getRoot() {
        return this.root;
    }

//    int DepthXD = 0;
//    private void printDepth(){
//        System.out.println("Depth: " + this.DepthXD);
//    }

    private String creatDepth(int depth){
        String s = "";
        for(int i = 0; i < depth; i++){
            s += " ";
        }
        return s;
    }

    @Override
    public String toString() {
        if(this.root == null){
            return "";
        }
        else if(this.root.getLeft()==null && this.root.getRight()==null){
//            return " ".repeat(this.depth) + "-" + this.root.toString() ;
            return  creatDepth(this.depth) + "-" + this.root.toString() + "\n";
        }
        else if(this.root.getLeft()==null){
            return creatDepth(this.depth) +"-" + this.root.toString() + "\n" + this.RightTree.toString() ;
        }else if(this.root.getRight()==null){
            return creatDepth(this.depth) +"-"+ this.root.toString() + "\n" + this.LeftTree.toString();
        }
        else{
            return  creatDepth(this.depth) +"-"+this.root.toString() +"\n"+  this.LeftTree.toString()  + this.RightTree.toString();
        }
    }

    public TreeImpl() {
    }
}
