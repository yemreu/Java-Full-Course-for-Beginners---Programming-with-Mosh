package com.codewithmosh;

import java.awt.Point;

public class PrimitiveTypesVsReferenceTypes {

	public static void main() {
		Point point1 = new Point(1,1);
		Point point2 = point1;
		point1.x = 2;
		System.out.println(point2);
	}
}
