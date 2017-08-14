/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB2;

import java.util.ArrayList;

/**
 *
 * @author Vicky Virdaus
 */
public class Node {

    //    A Unique Identifier for our node
    public String stationName;
    //    An arraylist containing a list of Nodes that
//    This node is directly connected to - It's child nodes.
    Node leftChild;
    Node rightChild;
    Node middleChild;
    Node middleChild2;

    public Node(String stationName, Node firstChild, Node secondChild){
        this.stationName = stationName;
        this.leftChild = firstChild;
        this.rightChild = secondChild;
        
    }

    public ArrayList<Node> getChildren(){
        ArrayList<Node> childNodes = new ArrayList<>();
        if(this.leftChild != null)
        {
            childNodes.add(leftChild);
        }
        if(this.rightChild != null) {
            childNodes.add(rightChild);
        }
        if(this.middleChild != null)
        {
            childNodes.add(middleChild);
        }
        if(this.middleChild2 != null) {
            childNodes.add(middleChild2);
        }
        return childNodes;
    }

    //    An auxiliary function which allows
//    us to remove any child nodes from
//    our list of child nodes.
    public boolean removeChild(Node n){
        return false;
    }

}

