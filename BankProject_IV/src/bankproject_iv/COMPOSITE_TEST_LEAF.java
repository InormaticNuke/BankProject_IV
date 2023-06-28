package bankproject_iv;

public class COMPOSITE_TEST_LEAF implements COMPOSITE_TEST_COMPONENT {
    
    public String test_name;
    public int test_id;
    public COMPOSITE_TEST_LEAF()
    {
        
    }
    
    public COMPOSITE_TEST_LEAF(String test_name, int test_id){
        this.test_name = test_name;
        this.test_id   = test_id;
    }
    
    @Override
    public void testFunc(){
        System.out.println("Composite Test 01");
    }
    
    
}
