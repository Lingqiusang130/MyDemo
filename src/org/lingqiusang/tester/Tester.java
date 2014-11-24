/**
 * 
 */
package org.lingqiusang.tester;

import org.lingqiusang.dao.DBManager;

/**
 * @author lingqiusang
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBManager dbManager = new DBManager();
		dbManager.getMyslqConnection();
	}

}
