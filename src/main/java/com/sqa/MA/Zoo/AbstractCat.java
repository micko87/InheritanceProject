/**
 *   File Name: Cat.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 7, 2016
 *
 */

package com.sqa.MA.Zoo;

/**
 * Cat //ADDD (description of class)
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
public abstract class AbstractCat extends AbstractZooAnimal implements IAnimal {
	String sound = "a rough ROARRRRRRR";

	/**
	 * @return the sound
	 */
	@Override
	public String getSound() {
		return this.sound;
	}

}
