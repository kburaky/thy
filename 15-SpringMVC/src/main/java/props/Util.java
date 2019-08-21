package props;

import java.util.ArrayList;
import java.util.List;

public class Util implements UserInterface{
	
	@Override
	public List<User> dataResult() {
		List<User> ls = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User u = new User();
			u.setId(i);
			u.setTitle("Product " + i );
			ls.add(u);
		}
		return ls;
	}

}
