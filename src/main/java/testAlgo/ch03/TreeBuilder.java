package testAlgo.ch03;

public class TreeBuilder {

    private static int index=0;
    /*
     按照括号分割左右子树
     */
    public static Node build(String s) {
        int len=s.length();
        if(len<1||index>=len){
            return null;
        }
        int val=0;
        int ch;
        int sign=1;
        if(s.charAt(index)=='-'){
            sign=-1;
            index++;
        }
        while(index<len&&(ch=s.charAt(index))<='9'&&ch>='0'){
            val*=10;
            val+=ch-'0';
            index++;
        }
        Node root=new Node(sign*val);
        if(index>=len||s.charAt(index)==')'){
            index++;
            return root;//have no child
        }//here now index is pointing to a '('

        index++;//now pointing to a number
        root.left=build(s);
        if(index>=len||s.charAt(index)==')'){
            index++;
            return root;
        }//here it means index is pointing to '('
        index++;
        root.right=build(s);
        if(index>=len||s.charAt(index)==')'){
            index++;
        }
        return root;
    }
}
