package bankproject_iv;

import java.util.ArrayList;

public class COMPOSITE_TEST_COMPOSITE implements COMPOSITE_TEST_COMPONENT{
    
    String test_name;
    
    ArrayList<COMPOSITE_TEST_COMPONENT> components;

    public COMPOSITE_TEST_COMPOSITE() {
    }

    public COMPOSITE_TEST_COMPOSITE(String test_name) {
        this.test_name = test_name;
        components = new ArrayList<>();
    }
    
    @Override
    public void testFunc(){
        for (COMPOSITE_TEST_COMPONENT c : components){
            c.testFunc();
        }
    }
    
    public void add(COMPOSITE_TEST_COMPONENT subComponent){
        components.add(subComponent);
    }

    
    
    
}
