package car;

abstract class Engine {
    public abstract String getType();
}

class CombustionEngine extends Engine {
    @Override
    public String getType() {
        return "Combustion Engine";
    }
}

class ElectricEngine extends Engine {
    @Override
    public String getType() {
        return "Electric Engine";
    }
}

class HybridEngine extends Engine {
    @Override
    public String getType() {
        return "Hybrid Engine";
    }
}
