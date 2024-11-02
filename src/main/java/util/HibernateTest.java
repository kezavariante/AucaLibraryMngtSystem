package util;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import model.Location;
import model.LocationType;

public class HibernateTest {

    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSession();
        Transaction transaction = null;

        try {
            // Start transaction
            transaction = session.beginTransaction();
//            
//            Location province = new Location();
//            province.setLocation_name("Kigali Province");
//            province.setLocation_type(LocationType.PROVINCE);
//            province.setLocation_code("kg101");
//            session.save(province);
//            
//            // Create District under the Province
//            Location district = new Location();
//            district.setLocation_name("Gasabo District");
//            district.setLocation_type(LocationType.DISTRICT);
//            district.setParentLocation(province);  // Associate with Province
//            district.setLocation_code("G101");
//            session.save(district);
//            
//            // Create Sector under the District
//            Location sector = new Location();
//            sector.setLocation_name("Kacyiru Sector");
//            sector.setLocation_type(LocationType.SECTOR);
//            sector.setParentLocation(district);  // Associate with District
//            sector.setLocation_code("kacy101");
//            session.save(sector);
//            
//            // Create Cell under the Sector
//            Location cell = new Location();
//            cell.setLocation_name("Kinyinya Cell");
//            cell.setLocation_type(LocationType.CELL);
//            cell.setParentLocation(sector);  // Associate with Sector
//            cell.setLocation_code("kiy101");
//            session.save(cell);
//            
//            // Create Village under the Cell
//            Location village = new Location();
//            village.setLocation_name("Nyamwenda Village");
//            village.setLocation_type(LocationType.VILLAGE);
//            village.setParentLocation(cell);  // Associate with Cell
//            village.setLocation_code("Ny101");
//            session.save(village);
//            
            // Commit the transaction
            transaction.commit();
            System.out.println("Locations created and saved successfully!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();  // Close the session
        }
    }
}