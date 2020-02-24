package Interest.CalculateInterest;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.math.*;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.apache.logging.log4j.LogManager;

public class CompoundInterest extends Interest{
private double compoundInterest;
		public static final Logger logger=LogManager.getLogger(CompoundInterest.class);
	public void calculate()
	{	
		logger.info("entering calculate method:");
		PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
		
		compoundInterest=principal*(Math.pow((1+(rateOfInterest/100)),time));
		out.println("The Simple Interest is "+compoundInterest);
		logger.info("Compound Interest is calculated");
	}
	

}
