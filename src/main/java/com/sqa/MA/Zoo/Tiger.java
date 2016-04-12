/**
 *   File Name: Tiger.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 7, 2016
 *
 */

package com.sqa.MA.Zoo;

/**
 * Tiger //ADDD (description of class)
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
public class Tiger extends AbstractCat implements IZooAnimal {
	String sound = "out a huge PURRR!.";

	/**
	 * @see com.sqa.MA.Zoo.IAnimal#act()
	 */
	@Override
	public void act() {
		System.out.println("They battle a man with a sword");
	}
}
