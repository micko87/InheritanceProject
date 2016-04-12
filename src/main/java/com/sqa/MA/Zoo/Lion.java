/**
 *   File Name: Lion.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 7, 2016
 *
 */

package com.sqa.MA.Zoo;

/**
 * Lion //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Lion extends AbstractCat implements IZooAnimal {

	String sound = "a rough ROARRRRRRR";

	/**
	 * @see com.sqa.MA.Zoo.IAnimal#act()
	 */
	@Override
	public void act() {
		System.out.println("They jump throuh a hoop of fire");

	}

}
