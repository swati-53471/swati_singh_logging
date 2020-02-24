package Interest.CalculateInterest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest extends Interest{
	private double simpleInterest;
	public static final Logger logger=LogManager.getLogger(CompoundInterest.class);

	
	public void calculate()
	{	
		logger.info("entering calculate method");
		PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));

		simpleInterest=principal*rateOfInterest*time/100;
		out.println("The Simple Interest is "+simpleInterest);
		logger.info("Simple interest calculated");
	}
	

}
