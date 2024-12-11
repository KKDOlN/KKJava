package com.kk.day11.oop.interfactpkg.zoo;

public class Zoo {
	public static void main(String [] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Bear bear = new Bear();
		zooKeeper.feed(bear);
		zooKeeper.feed(new Camel());
		zooKeeper.feed(new Deer());
	}
}
