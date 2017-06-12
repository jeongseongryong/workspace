package step23.ex12;

import java.io.PrintStream;

public interface Command {
	void service(PrintStream out) throws Exception;
	
}
