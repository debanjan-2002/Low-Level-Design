import Strategy.IJumpStrategy;
import Strategy.IRunStrategy;

public class Fighter {
    IRunStrategy runStrategy;
    IJumpStrategy jumpStrategy;
    Fighter(IRunStrategy runStrategy, IJumpStrategy jumpStrategy) {
        this.runStrategy = runStrategy;
        this.jumpStrategy = jumpStrategy;
    }
    public void printDetails() {
        this.runStrategy.run();
        this.jumpStrategy.jump();
    }
}
