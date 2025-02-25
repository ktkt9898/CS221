import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Search for shortest paths between start and end points on a circuit board
 * as read from an input file using either a stack or queue as the underlying
 * search state storage structure and displaying output to the console or to
 * a GUI according to options specified via command-line arguments.
 * 
 * @author mvail
 * @author Kyle Truschel
 */
public class CircuitTracer {

	/**
	 * Launch the program.
	 * 
	 * @param args three required arguments:
	 *             first arg: -s for stack or -q for queue
	 *             second arg: -c for console output or -g for GUI output
	 *             third arg: input file name
	 */
	public static void main(String[] args) {
		new CircuitTracer(args); // create this with args
	}

	/** Print instructions for running CircuitTracer from the command line. */
	private void printUsage() {
		System.out.println(
				"Usage: java CircuitTracer -s|-q -c|-g filename \n -s for stack or -q for queue \n -c for console or -g for GUI");
	}

	/**
	 * Set up the CircuitBoard and all other components based on command
	 * line arguments.
	 * 
	 * @param args command line arguments passed through from main()
	 */
	public CircuitTracer(String[] args) {
		// Parse and validate command line args - first validation provided
		CircuitBoard board = null;

		if (args.length != 3) {
			printUsage();
			return; // exit the constructor immediately
		}
		if (!args[0].equals("-s") && !args[0].equals("-q")) {
			printUsage();
			return;
		}

		if (!args[1].equals("-c") && !args[1].equals("-g")) {
			printUsage();
			return;
		}

		// Initialize the Storage to use either a stack or queue
		// Intialize an empty Storage object that stores objects of type TraceState
		Storage<TraceState> stateStore = null;

		switch (args[0]) {
			case "-s":
				stateStore = Storage.getStackInstance();
				break;
			case "-q":
				stateStore = Storage.getQueueInstance();
				break;
			default:
				printUsage();
				return;
		}

		// Read in the CircuitBoard from the given file
		try {
			board = new CircuitBoard(args[2]);
		} catch (FileNotFoundException e) {
			System.out.println(e + " File was not found.");
			return;
		} catch (InvalidFileFormatException e) {
			System.out.println(e + " File is not in the correct format.");
			return;
		}

		// Run the search for best paths
		// Initalize an empty list that stores objects of type TraceState
		ArrayList<TraceState> bestPaths = new ArrayList<TraceState>();

		// Add a new initial TraceState object (a path with one trace)
		// to stateStore for each open position adjacent to the starting component
		int x = board.getStartingPoint().x;
		int y = board.getStartingPoint().y;

		// Check right
		if (board.isOpen(x + 1, y)) {
			stateStore.store(new TraceState(board, x + 1, y));
		}

		// Check left
		if (board.isOpen(x - 1, y)) {
			stateStore.store(new TraceState(board, x - 1, y));
		}

		// Check up
		if (board.isOpen(x, y + 1)) {
			stateStore.store(new TraceState(board, x, y + 1));
		}

		// Check down
		if (board.isOpen(x, y - 1)) {
			stateStore.store(new TraceState(board, x, y - 1));
		}

		while (!stateStore.isEmpty()) {
			TraceState currentState = stateStore.retrieve();

			// if bestPaths is empty or the TraceState object's path is equal in length to
			// one of the TraceStates in bestPaths,
			// add it to bestPaths
			// else if that TraceState object's path is shorter than the paths in bestPaths,
			// clear bestPaths and add the current TraceState as the new shortest path
			if (currentState.isSolution()) {
				// The first found scenario, meaning bestPaths is empty, or similar length paths
				// are found
				if (bestPaths.isEmpty() || currentState.pathLength() == bestPaths.get(0).pathLength()) {
					bestPaths.add(currentState);

					// If a shorter path is found, clear bestPaths and add the new shortest path
				} else if (currentState.pathLength() < bestPaths.get(0).pathLength()) {
					bestPaths.clear();
					bestPaths.add(currentState);
				}
			}

			// else generate all valid next TraceState objects from the current TraceState
			// and add them to stateStore
			else {
				// Get the current position of x and y
				x = currentState.getRow();
				y = currentState.getCol();

				if (currentState.isOpen(x - 1, y)) {
					stateStore.store(new TraceState(currentState, x - 1, y));
				}
				if (currentState.isOpen(x + 1, y)) {
					stateStore.store(new TraceState(currentState, x + 1, y));
				}
				if (currentState.isOpen(x, y - 1)) {
					stateStore.store(new TraceState(currentState, x, y - 1));
				}
				if (currentState.isOpen(x, y + 1)) {
					stateStore.store(new TraceState(currentState, x, y + 1));
				}
			}
		}

		// Output results to console or GUI, according to specified choice
		switch (args[1]) {
			case "-c":
				for (TraceState path : bestPaths) {
					System.out.println(path.getBoard().toString());
				}
				break;
			// not for 10 points
			case "-g":
				System.out.println("GUI mode is not supported in this version.");
				break;
			default:
				printUsage();
				return;
		}
	}
} // class CircuitTracer
