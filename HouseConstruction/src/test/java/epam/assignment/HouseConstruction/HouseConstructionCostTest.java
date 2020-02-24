package epam.assignment.HouseConstruction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseConstructionCostTest {
	public static final Logger logger=LogManager.getLogger(App.class);


	public static void main(String[] args) {
		logger.info("program started");
		HouseConstructionCost house=new HouseConstructionCost();
		house.input();
		house.cost();
		logger.info("program terminated");
		
	}

}
