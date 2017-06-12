package step23.ex11;

import java.io.PrintStream;

public interface Command {
	void service(PrintStream out) throws Exception;
	
}
