package _6_BinarySearchTree;


import _1_Array.Array;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main {

    // 打乱数组顺序
    private static void shuffle(Object[] arr){

        for(int i = arr.length - 1 ; i >= 0 ; i --){
            int pos = (int) (Math.random() * (i + 1));
            Object t = arr[pos];
            arr[pos] = arr[i];
            arr[i] = t;
        }
    }

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Random random = new Random();

        int n = 10;

//        for(int i = 0 ; i < n ; i ++)
//            bst.add(random.nextInt(n));
        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);
        bst.add(6);
        bst.add(8);
        System.out.println();
        bst.postOrderNR();
        System.out.println(bst.levelOrder2());

//        System.out.println(bst._inOrder());
        // 注意, 由于随机生成的数据有重复, 所以bst中的数据数量大概率是小于n的

        // order数组中存放[0...n)的所有元素
//        Integer[] order = new Integer[n];
//        for( int i = 0 ; i < n ; i ++ )
//            order[i] = i;
        // 打乱order数组的顺序
//        shuffle(order);

        // 乱序删除[0...n)范围里的所有元素
//        for( int i = 0 ; i < n ; i ++ )
//            if(bst.contains(order[i])){
//                bst.remove(order[i]);
//                System.out.println("After remove " + order[i] + ", size = " + bst.size() );
//            }

        // 最终整个二分搜索树应该为空
//        System.out.println(bst.size());
    }
}
