package car;

public class ProjectManager {
    public static void main(String[] args) {
        
        Vehicle[] vehicles = new Vehicle[] {
                new ICEV(new Manufacture("Toyota", "Japan"), new CombustionEngine()),
                new BEV(new Manufacture("Tesla", "USA"), new ElectricEngine()),
                new HybridV(new Manufacture("Honda", "Japan"), new HybridEngine()),
                new ICEV(new Manufacture("Ford", "Germany"), new CombustionEngine()),
                new BEV(new Manufacture("Chevrolet", "France"), new HybridEngine()),
            };

        // Show characteristics of each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
        }
    }
}

