package at.fhj.iit;

public interface Greeter {
	
	/**
	 * Student 1
	 * Student 2
	 * Student 3 (OPTIONAL)
	 * 
	 * TODO Instruction for GIT Lab for Grading GIT Part of Configurationmanagement
	 *  - copy content of this git repository / zip file
	 *
	 *	- create your own local and remote repository
	 * 
	 *  - implement Main				(! Student 1 !)
	 *  - call sayHello()
	 *  - call sayGoodBye()
	 *
	 *  => publish current implementation for your colleagues in remote repository
	 *
	 *
	 *  - implement GreeterImpl			(! Student 1 !)
	 *  - implement Constructor with 'name' argument
	 *  - change name of current GreeterImpl Call
	 * 
	 *  - create branch S2
	 *  - implement sayHello() Method 	(! Student 2 !)
	 *	- simple "Hello, <your name>!" output
	 *  
	 *  - create branch S3
	 *  - implement sayGoodBye() Method (! Student 1, 2, or 3 !)
	 *  - simple "Good Bye, <your name>!" output
	 *
	 *	=> publish all branches to remote repository
	 *  
	 *
	 *  - merge branch S2 and S3 into master (Any Student)
	 *  - tag with "FinalVersion"
	 *  - keep all branches, don't delete any branch :) (!)
	 *  
	 *
	 * FINAL ASSIGNMENT
	 *  - don't forget to push everything (!) 
	 *	  AND final version includes 
	 *		- runnable source code
	 *		- with two demo outputs (1x hello, 1x goodbye)
	 * - finish your assignment at elearning website
	 *
	 * 
	 * REMEMBER Git commands:
	 *
	 *   											<- Clone (FROM REMOTE)
	 *   				<- Checkout (From LOCAL)
	 *   -> (add) 		-> Commit (TO LOCAL) 		-> Push (TO REMOTE)
	 *   					  		(LOCAL)			<- Pull (FROM REMOTE)
	 *
	 *
	 */

	void sayHello();

	void sayGoodbye();

}