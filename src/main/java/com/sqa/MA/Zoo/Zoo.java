/**
 *   File Name: Zoo.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 7, 2016
 *
 */

package com.sqa.MA.Zoo;

/**
 * Zoo //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0 Create the following class structure: IAnimal (method makeNoise)
 *        which is an interface used by Animal subclasses of Cat, Bird, Fish,
 *        subclasses Lion, Tiger/ Parrot, Penguin / Shark, Killer Whale – Create
 *        the class Zoo which contains a property zooAnimals, an array of
 *        IZooAnimal objects (the interface IZooAnimal extends IAnimal and
 *        contains the method performTrick). The class Zoo should contains a
 *        method doShow() which showcases the animals at the Zoo. Include
 *        abstract classes where needed. You may want to diagram this structure
 *        and show it to me before implementing it!
 *
 */
public class Zoo {

	IZooAnimal[] zooAnimals;

	/**
	 *
	 */
	public void doShow() {
		setupAnimals();
		performShow();

	}

	/**
	 *
	 */
	private void performShow() {
		for (int i = 0; i < this.zooAnimals.length; i++) {
			this.zooAnimals[i].performTrick();

		}

	}

	}

	/**
	 *
	 */
	private void setupAnimals() {
		IZooAnimal[] myzooAnimals = { new Lion(), new Tiger() };
		this.zooAnimals = myzooAnimals;
	}

}
