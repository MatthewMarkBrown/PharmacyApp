//package ac.ca.cput.RepositoryImpTest.Admin;
//
//import ac.ca.cput.Repository.admin.ConsumptionRepository;
//import ac.ca.cput.Repository.admin.impl.ConsumptionRepositoryImp;
//import ac.ca.cput.factory.admin.ConsumptionFactory;
//import ac.ca.cput.model.admin.Consumption;
//import ac.ca.cput.model.admin.Inventory;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//
//import java.util.Set;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class ConsumptionImpTest {
//    private ConsumptionRepository repository;
//    private Consumption consumption;
//
//    private Consumption getSavedConsumption() {
//        Set<Consumption> savedConsumption = this.repository.getAll();
//        return savedConsumption.iterator().next();
//    }
//
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository= ConsumptionRepositoryImp.getRepo();
//        this.consumption = ConsumptionFactory.getConsumption("Test Course");
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<Consumption> all = this.repository.getAll();
//        System.out.println("In getAll, all = " + all);
//    }
//
//    @Test
//    public void a_create() {
//        Consumption created = this.repository.create(this.consumption);
//        System.out.println("In create, created = " + created);
//        d_getAll();
//        Assert.assertSame(created, this.consumption);
//    }
//
//    @Test
//    public void b_read() {
//        Consumption savedConsumption = getSavedConsumption();
//        System.out.println("In read, courseId = "+ savedConsumption.getQuantity());
//        Consumption read = this.repository.read(consumption.getQuantity());
//        System.out.println("In read, read = " + read);
//        d_getAll();
//        Assert.assertEquals(savedConsumption, read);
//    }
//
//    @Test
//    public void e_delete() {
//        Consumption savedCourse = getSavedConsumption();
//        this.repository.delete(savedCourse.getQuantity());
//        d_getAll();
//    }
//
//    @Test
//    public void c_update() {
////        String newname = "New Test Location";
////        Consumption consumption = new Consumption.Builder().copy(getSavedConsumption()).quantity(newname).build();
////        System.out.println("In update, about_to_updated = " + consumption);
////        Consumption updated = this.repository.update(consumption);
////        System.out.println("In update, updated = " + updated);
////        Assert.assertSame(newname, updated.getQuantity());
////        d_getAll();
//    }
//
//
//
//
//
//}
