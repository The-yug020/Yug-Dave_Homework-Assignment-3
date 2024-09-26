package car;

abstract class Vehicle {
    protected Manufacture manufacture;
    protected Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public abstract void showCharacteristics();
}

class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("ICEV - Manufacture: " + manufacture.getName() + ", Country: " + manufacture.getCountry() + ", Engine: " + engine.getType());
    }
}

class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("BEV - Manufacture: " + manufacture.getName() + ", Country: " + manufacture.getCountry() + ", Engine: " + engine.getType());
    }
}

class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("HybridV - Manufacture: " + manufacture.getName() + ", Country: " + manufacture.getCountry() + ", Engine: " + engine.getType());
    }
}

