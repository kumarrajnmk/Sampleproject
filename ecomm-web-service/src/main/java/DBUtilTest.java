import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

public class DBUtilTest {

	@Test
	public void testGetDBCon() {
		//fail("Not yet implemented");
		
		
		
		Connection con=DBUtil.getDBCon();
		
		
		assertNotNull(con);
	}

}
