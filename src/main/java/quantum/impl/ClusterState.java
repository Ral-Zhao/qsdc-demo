package quantum.impl;

import quantum.QuantumState;

/**
 * Created by Zhao Zhe on 2017/9/9.
 */
public class ClusterState implements QuantumState {

    private int particles = 4;
    private double[] state;

    public ClusterState(){
        this.state = new double[]{0.5,0,0,0.5,0,0,0,0,0,0,0,0,0.5,0,0,-0.5};
    }

    public double[] getState() {
        return this.state;
    }

    public void setState(double[] state) {
        this.state = state;
    }

    public int getParticles() {
        return this.particles;
    }

    public void setParticles(int num) {
        this.particles = num;
    }
}
