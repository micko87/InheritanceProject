/**
 *   File Name: AbstractZooAnimal.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 7, 2016
 *
 */

package com.sqa.MA.Zoo;

/**
 * AbstractZooAnimal //ADDD (description of class)
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
public abstract class AbstractZooAnimal implements IZooAnimal, IAnimal {

	private String sound = "a quite soudn";

	/**
	 * @return the sound
	 */
	public String getSound() {
		return this.sound;
	}

	/**
	 *
	 */
	@Override
	public void makeNoise() {
		System.out.println("They make" + getSound());

	}

	/**
	 * @see com.sqa.MA.Zoo.IZooAnimal#performTrick()
	 */
	@Override
	public final void performTrick() {

		System.out.println(this.getClass().getSimpleName() + "performs a trick");
		act();
		makeNoise();

	}

	/**
	 * @param sound
	 *            the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

}
