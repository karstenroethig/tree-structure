package karstenroethig.commons.tree.iterator;

import java.util.Iterator;

import karstenroethig.commons.tree.Node;
import karstenroethig.commons.tree.Tree;

public interface IIteratorStrategy<T> {

	public Iterator<Node<T>> createIterator( Tree<T> tree );
}
